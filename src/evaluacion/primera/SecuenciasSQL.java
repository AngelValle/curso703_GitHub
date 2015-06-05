package evaluacion.primera;

public class SecuenciasSQL {
	
	
	/**
	 * Metodo para construir una J.QUERY valida para crear 1 Region en la Tabla REGIONS.
	 *  
	 * @param value1 => REGION_ID a insertar.
	 * @param value2 => REGION_NAME a insertar.
	 * @return String : J.Query construida para crear region.
	 */
	public static String crearRegion (int value1, String value2)
	{
		String stringfinal = null;
		
		stringfinal = "INSERT INTO REGIONS (REGION_ID,REGION_NAME) VALUES ('"+ value1 +"','" + value2 + "')";
		
		return stringfinal;
	}
	
	/**
	 * Metodo para construir una J.QUERY valida para borrar 1 Region en la Tabla REGIONS.
	 * 
	 * @param value => REGION_ID a insertar.
	 * @return String : J.Query construida para borrar region.
	 */
	public static String borrarRegionID (int value)
	{
		String stringfinal = null;
		
		stringfinal = "DELETE FROM REGIONS WHERE REGION_ID = " + value;
		
		return stringfinal;
	}
	
	/**
	 * Metodo para construir una J.QUERY valida para recuperar 1 Region de la Tabla REGIONS.
	 * 
	 * @param value => REGION_ID a buscar.
	 * @return String : J.Query construida para buscar 1 region.
	 */
	public static String recuperarRegionID (int value)
	{
		String stringfinal = null;
		
		stringfinal = "SELECT * FROM REGIONS WHERE REGION_ID = "+ value;
		
		return stringfinal;
	}
	
	/**
	 * Metodo para construir una J.QUERY valida para recuperar una Lista Region de la Tabla REGIONS.
	 * 
	 * @return String : J.Query construida para hacer una consulta Lista Region.
	 */
	public static String recuperarListaRegion ()
	{
		String stringfinal = null;
		
		stringfinal = "SELECT * FROM REGIONS";
		
		return stringfinal;
	}
	
	
	
	
}
