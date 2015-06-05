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
	
	
	
	public static List<RegionDTO> recuperarRegion(String bd, RegionDTO regiondto)
//	public static List<RegionDTO> recuperarRegion()
	{
		ResultSet rset = null;
		List<RegionDTO> listregion = new ArrayList<RegionDTO>();

		try 
		{
			conexion.iniciarDriver();
			Connection conn = conexion.iniciarConexion();
			Statement stmt = conexion.iniciarRegistro(conn);
			
			String query = SecuenciasSQL.recuperarRegionID(bd, regiondto.getI_region_id());
			rset = stmt.executeQuery(query);
//			rset = stmt.executeQuery(SecuenciasSQL.BUSCARREGION);
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
	

	public static List<RegionDTO> recuperarListaRegion(String bd)
//	public static List<RegionDTO> recuperarListaRegion()
	{
		List<RegionDTO> listregion = new ArrayList<RegionDTO>();
		ResultSet rset = null;

		try 
		{
			conexion.iniciarDriver();
			Connection conn = conexion.iniciarConexion();
			Statement stmt = conexion.iniciarRegistro(conn);
			
			String query = SecuenciasSQL.recuperarListaRegion(bd);
			rset = stmt.executeQuery(query);
//			rset = stmt.executeQuery(SecuenciasSQL.LISTAREGION);
			
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
	

	public static void insertarRegion (String bd,RegionDTO regiondto)
//	public static void insertarRegion ()
	{	
		try 
		{
			conexion.iniciarDriver();
			Connection conn = conexion.iniciarConexion();
			Statement stmt = conexion.iniciarRegistro(conn);
			
			String query = SecuenciasSQL.crearRegion(bd, regiondto.getI_region_id(), regiondto.getS_region_name());
			stmt.executeUpdate(query);
//			stmt.executeQuery(SecuenciasSQL.INSERTARREGION);
			
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	
	public static void borrarRegion (String bd, RegionDTO regiondto)
//	public static void borrarRegion ()
	{	
		try 
		{
			conexion.iniciarDriver();
			Connection conn = conexion.iniciarConexion();
			Statement stmt = conexion.iniciarRegistro(conn);
			
			String query = SecuenciasSQL.borrarRegionID(bd, regiondto.getI_region_id());
			stmt.executeUpdate(query);
//			stmt.executeQuery(SecuenciasSQL.BORRARREGION);
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
}
