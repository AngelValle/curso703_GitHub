package evaluacion.primera;

import java.sql.*;
import java.util.*;


public class RegionDAO {
	
	private static Conexion conexion = Conexion.getInstance();
	
	
	public static List<RegionDTO> resultset2regionDTO (ResultSet rset) throws Exception
	{
		List<RegionDTO> listregion = new ArrayList<RegionDTO>();
		
		while (rset.next())
			{
			RegionDTO dtobject = new RegionDTO(rset.getInt(1),rset.getString(2));
			listregion.add(dtobject);
			}
		return listregion;
	}
	
	
	/**
	 * Metodo para recuperar una lista con el resultado de toda la lista de BD REGIONS
	 *  
	 * 
	 * @return Nos devuelve una List de RegionDTO.
	 */
	public static List<RegionDTO> recuperarListaRegion()
	{
		List<RegionDTO> listregion = new ArrayList<RegionDTO>();
		ResultSet rset = null;

		try 
		{
			conexion.iniciarDriver();
			Connection conn = conexion.iniciarConexion();
			Statement stmt = conexion.iniciarRegistro(conn);
			
			rset = stmt.executeQuery(SecuenciasSQL.RECUPERAR_LISTA_REGION);
			listregion = resultset2regionDTO(rset);
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		finally
		{
			try 
			{
				rset.close();
			} 
			catch (SQLException e) 
			{
				e.printStackTrace();
			}
		}
		return listregion;
	}
	
	
	/**
	 * Metodo para insertar un objeto RegionDTO en base de datos REGIONS
	 *  
	 * @param regiondto --> Objeto RegionDTO para insertalo en la base de datos.
	 * @return Nos devuelve un boleano en True o False.
	 */
	public static boolean insertarRegion (RegionDTO regiondto)
	{	
		RegionDTO regionDTO = new RegionDTO();
		ResultSet rset = null;
		try 
		{
			conexion.iniciarDriver();
			Connection conn = conexion.iniciarConexion();
			Statement stmt = conexion.iniciarRegistro(conn);
			
			rset = (ResultSet)regionDTO;		
			
			stmt.executeQuery(SecuenciasSQL.CREAR_REGION);
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		finally
		{
			try 
			{
				rset.close();
			} 
			catch (SQLException e) 
			{
				e.printStackTrace();
			}
		}
		return false;
	}
	
}
