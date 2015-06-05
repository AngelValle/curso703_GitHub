package evaluacion.primera;

public class SecuenciasSQL {
	
	public static final String INSERTARREGION = ("INSERT INTO HR.REGIONS (REGION_ID, REGION_NAME) VALUES (5,'ANGEL')");
	public static final String BORRARREGION = "DELETE FROM HR.REGIONS WHERE REGION_ID = 5";
	public static final String BUSCARREGION = "SELECT * FROM HR.REGIONS WHERE REGION_ID = 5";
	public static final String LISTAREGION = "SELECT * FROM HR.REGIONS";
	
	
	public static String crearRegion (String bd, int value1, String value2)
	{
		String stringfinal = null;
		
		stringfinal = "INSERT INTO " + bd + " (REGION_ID,REGION_NAME) VALUES ('"+ value1 +"','" + value2 + "')";
		
		return stringfinal;
	}
	
	public static String borrarRegionID (String bd, int value)
	{
		String stringfinal = null;
		
		stringfinal = "DELETE FROM " + bd + " WHERE HR.REGIONS.REGION_ID = " + value;
		
		return stringfinal;
	}
	
	public static String recuperarRegionID (String bd, int value)
	{
		String stringfinal = null;
		
		stringfinal = "SELECT * FROM " + bd + " WHERE HR.REGIONS.REGION_ID = "+ value;
		
		return stringfinal;
	}
	
	public static String recuperarListaRegion (String bd)
	{
		String stringfinal = null;
		
		stringfinal = "SELECT * FROM " + bd;
		
		return stringfinal;
	}
	
	
	
	
}
