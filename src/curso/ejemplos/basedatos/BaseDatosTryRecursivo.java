package curso.ejemplos.basedatos;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;

public class BaseDatosTryRecursivo {
	
	public static void main(String[] args) throws Exception {
		
		ArrayList<DTO_Employees> arraylist = new ArrayList<DTO_Employees>(); // Creamos ArrayList
		Conexion conexion = Conexion.getInstance();
		conexion.iniciarDriver(); // Iniciamos el Driver de Oracle
		
		try(Statement stmt = conexion.iniciarRegistro(conexion.iniciarConexion()))
		{   
  	        try(ResultSet rset = SentenciasSQL.consultaSueldo(stmt))
  	        {
  				while (rset.next())
  				{
  					DTO_Employees empleado = null;
  					empleado = new DTO_Employees(
  								rset.getString(1),
  								rset.getString(2),
  								rset.getString(3),
  								rset.getString(4),
  								rset.getString(5),
  								rset.getString(6),
  								rset.getString(7),
  								rset.getString(8),
  								rset.getString(9),
  								rset.getString(10),
  								rset.getString(11)
  								);
  					arraylist.add(empleado);
  				}   
  	        }
  	        catch (Exception e) 
  	        {
  	        	e.printStackTrace();
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println(arraylist);
	}
}