package curso.ejemplos.basedatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;

public class BaseDatos {
	
	
	public static void main(String[] args) throws Exception {
		
		
		Connection conn = null;
		ResultSet rset = null;
		Statement stmt = null;
		ArrayList<DTO_Employees> arraylist = new ArrayList<DTO_Employees>();
		
		
		try
		{
			//registro el driver, en realidad, hago que se ejecuten unas pocas líneas de la clase OracleDriver
//			Class.forName("oracle.jdbc.driver.OracleDriver");
			DriverManager.registerDriver (new oracle.jdbc.driver.OracleDriver());// método equivalente al anterior
			//Sea como sea, es, <<oye, si te piden una conexión, se la pides a esa clase!>>
			conn = DriverManager.getConnection ("jdbc:oracle:thin:@localhost:1521:xe", "HR", "PASSWORD");
  	        stmt = conn.createStatement();
			rset = stmt.executeQuery("SELECT * FROM HR.employees WHERE HR.employees.salary > 3000 order by salary DESC");
			
			
			while (rset.next())
			{
//				System.out.println (rset.getString(1));
//				arraylist.add(rset.getString(1)+rset.getString(2)+rset.getString(3)+rset.getString(4)
//						+rset.getString(5)+rset.getString(6)+rset.getString(7)+rset.getString(8)+rset.getString(9)
//						+rset.getString(10)+rset.getString(11));
				DTO_Employees empleado = null;
				empleado = new DTO_Employees(rset.getString(1),rset.getString(2),rset.getString(3),rset.getString(4)
						,rset.getString(5),rset.getString(6),rset.getString(7),rset.getString(8),rset.getString(9)
						,rset.getString(10),rset.getString(11));
				
				arraylist.add(empleado);
				
			}   
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally //libero recursos, de "adentro a fuera" , ResultSet, Statment, Conexion
		{
			if (rset != null) 	{ try { rset.close(); } catch (Exception e2) { e2.printStackTrace(); }}
			if (stmt != null)	{ try {	stmt.close(); } catch (Exception e2) { e2.printStackTrace(); }}
			if (conn != null) 	{ try { conn.close(); } catch (Exception e3) { e3.printStackTrace(); }}
		  	   
		}   
		System.out.println(arraylist);
	}

}

