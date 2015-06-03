package curso.ejemplos.basedatos;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;


public class DAO_Employees implements CRUD{
	
	public static List<DTO_Employees> resultset2dtoemployees (ResultSet rset) throws Exception
	{
		List<DTO_Employees> listemployees = new ArrayList<DTO_Employees>();
		
		while (rset.next())
			{
				DTO_Employees dtobject = new DTO_Employees(
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
				
				listemployees.add(dtobject);
			}
		return listemployees;
	}
	

	public static List<DTO_Employees> recuperarTodosDTO() throws Exception
	{
		List<DTO_Employees> listemployees = new ArrayList<DTO_Employees>();
		Conexion conexion = Conexion.getInstance();
		conexion.iniciarDriver();

		try(Statement stmt = conexion.iniciarRegistro(conexion.iniciarConexion()))
		{   		
//			try(ResultSet rset = SentenciasSQL.consultaSueldo(stmt))
			try(ResultSet rset = stmt.executeQuery(SentenciasSQL.CONSULT_EMPLEADOS_SALARY_MAS_3000))
  	        {
  				listemployees = resultset2dtoemployees(rset);
  			}  
	  	    catch(Exception e)
	  		{
	  			e.printStackTrace();
	  		}
  	    }
  	    catch (Exception e) 
  	    {
  	      	e.printStackTrace();
		}
		return listemployees;
	}

	
	@Override
	public void create(DTO_Employees ObjectDTO) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public DTO_Employees read(String Condicion) throws Exception {
		DTO_Employees dtobject = null;
//		
//		List<DTO_Employees> listemployees = new ArrayList<DTO_Employees>();
//		Conexion conexion = Conexion.getInstance();
//		conexion.iniciarDriver(); // Iniciamos el Driver de Oracle
//		
//		try(Statement stmt = conexion.iniciarRegistro(conexion.iniciarConexion("HR", "PASSWORD")))
//		{
//			try(ResultSet rset = SentenciasSQL.consultaSueldo(stmt))
//  	        {
//  				listemployees = resultset2dtoemployees(rset);
//  			}  
//		}
		
		return dtobject;
	}

	@Override
	public void update(DTO_Employees ObjectDTO) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(String Condicion) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getNombreDAO() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
