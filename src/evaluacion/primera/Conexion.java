package evaluacion.primera;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Properties;

public class Conexion {

	private Properties propiedades = new Properties();
	private String user = null;
	private String password = null;
	private String driver = null;
	private String conection = null;
	
	private static Conexion conexion  = new Conexion(); // Singleton
	
	private Conexion()
	{
	}
	
	public static Conexion getInstance()
	{
		return conexion;
	}
	
	protected void iniciarDriver() throws Exception
	{
		BufferedReader br = null;
		try
		{
			br = new BufferedReader(new FileReader("ficheros/bd.properties"));
			this.propiedades.load(br);
			this.user = propiedades.getProperty("usuario");
			this.password = propiedades.getProperty("password");
			this.driver = propiedades.getProperty("driver");
			this.conection = propiedades.getProperty("conection");
			
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
		Class.forName(driver);
	}
	
	protected Connection iniciarConexion() throws Exception
	{
		Connection conn = DriverManager.getConnection (this.conection, this.user, this.password);
		
		return conn;
	}
	
	protected  Statement iniciarRegistro(Connection conn) throws Exception
	{
		Statement stmt = conn.createStatement();
		return stmt;
	}
}
