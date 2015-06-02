package curso.ejemplos.basedatos;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Savepoint;
import java.sql.Statement;
import java.util.Properties;

public class Conexion {

	private Properties propiedades = new Properties();
	private String user = null;
	private String password = null;
	private String driver = null;
	private String conection = null;
	
	private static Conexion instance;
	
	private Conexion() throws Exception {
		
		BufferedReader br = null;
		
		try
		{
			br = new BufferedReader(new FileReader("ficheros/bd.properties"));
			propiedades.load(br);
			user = propiedades.getProperty("usuario");
			password = propiedades.getProperty("password");
			driver = propiedades.getProperty("driver");
			conection = propiedades.getProperty("conection");
			
		}
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
		
		finally
		{
			try 
			{
				br.close();
			} 
			catch (IOException e) 
			{
				e.printStackTrace();
			}
		}
	}
	
	public static Conexion getInstance() throws Exception
	{
		if (instance == null)
		{
			instance = new Conexion();
		}
		return instance;
	}
	
	protected void iniciarDriver() throws Exception
	{
		Class.forName(driver);
	}
	
	
	protected Connection iniciarConexion() throws Exception
	{
		Connection conn = DriverManager.getConnection (this.conection, this.user, this.password);
		
//		conn.setAutoCommit(false);
//		Savepoint savepoint1 = conn.setSavepoint();
//		conn.rollback(savepoint1);
//		conn.commit();
		
		return conn;
	}
	
	protected  Statement iniciarRegistro(Connection conn) throws Exception
	{
		Statement stmt = conn.createStatement();
		return stmt;
	}
}
