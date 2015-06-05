package evaluacion.primera;

import java.sql.*;
import java.util.*;


public class RegionDAO {
	
	private static Conexion conexion = Conexion.getInstance();
	
	/**
	 * Metodo que usamos para resolver los ResultSet de la Tabla REGIONS y convertirlos 
	 * a List con generico "RegionDTO".
	 * 
	 * @param rset => Recogemos un ResultSet con los registros
	 * @return List con generico "RegionDTO", almacena RegionDTO's 
	 * @throws Exception
	 */
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
	 * Metodo que usamos para recuperar una unica region de la Tabla REGIONS seleccionada por
	 * su clave unica "REGION_ID".
	 * 
	 * @param regiondto => Recogemos una instancia de RegionDTO que usaremos su "REGION_ID" para 
	 * la busqueda de igualdad con otro RegionDTO que forme parte de la tabla.
	 * @return Objeto RegionDTO recogido con el mismo "REGION_ID" que el RegionDTO recogido.
	 */
	public static RegionDTO recuperarRegion(RegionDTO regiondto)
	{
		ResultSet rset = null;
		RegionDTO regiondtofinal = null;

		try 
		{
			conexion.iniciarDriver();
			Connection conn = conexion.iniciarConexion();
			Statement stmt = conexion.iniciarRegistro(conn);
			
			String query = SecuenciasSQL.recuperarRegionID(regiondto.getI_region_id());
			rset = stmt.executeQuery(query);
			regiondtofinal = resultset2regionDTO(rset).get(0);
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
		return regiondtofinal;
	}
	
	/**
	 * Metodo que usaremos para recuperar una lista de todos los registros que forman la Tabla REGIONS
	 * 
	 * @return List con generico "RegionDTO", almacena RegionDTO's
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
			
			String query = SecuenciasSQL.recuperarListaRegion();
			rset = stmt.executeQuery(query);
			
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
	 * Metodo que usaremos para insertar una region en la Tabla REGIONS
	 * 
	 * @param regiondto => Objeto RegionDTO que usamos para insertar
	 * @return Booleano indicando el resultado de la operacion
	 */
	public static boolean insertarRegion (RegionDTO regiondto)
	{	
		boolean comprobar = false;
		try 
		{
			conexion.iniciarDriver();
			Connection conn = conexion.iniciarConexion();
			Statement stmt = conexion.iniciarRegistro(conn);
			
			String query = SecuenciasSQL.crearRegion(regiondto.getI_region_id(), regiondto.getS_region_name());
			stmt.executeUpdate(query);
			comprobar = true;
		} 
		catch (Exception e) 
		{
			comprobar = false;
			e.printStackTrace();
		}
		return comprobar;
	}
	
	/**
	 * Metodo que usaremos para borrar una region en la Tabla REGIONS
	 * 
	 * @param regiondto => Objeto RegionDTO que usamos para borrarlo en la tabla
	 * @return Booleano indicando el resultado de la operacion
	 */
	public static boolean borrarRegion (RegionDTO regiondto)
	{	
		boolean comprobar = false;
		try 
		{
			conexion.iniciarDriver();
			Connection conn = conexion.iniciarConexion();
			Statement stmt = conexion.iniciarRegistro(conn);
			
			String query = SecuenciasSQL.borrarRegionID(regiondto.getI_region_id());
			stmt.executeUpdate(query);
			comprobar = true;
		} 
		catch (Exception e) 
		{
			comprobar = false;
			e.printStackTrace();
		}
		return comprobar;
	}
	
}
