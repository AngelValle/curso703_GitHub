package evaluacion.primera;

public class RegionDTO {
	
	private int i_region_id = 0;
	private String s_region_name = null;
	
	public RegionDTO(int i_region_id, String s_region_name)
	{
		this.i_region_id = i_region_id;
		this.s_region_name = s_region_name;
	}
	
	public RegionDTO() {
	}
	
	
	// toString
	
	@Override
	public String toString() 
	{
		final String tostring = ("\nRegionDTO : I_REGION_ID = "+i_region_id+" S_REGION_NAME = "+s_region_name);
		return tostring;
	}

	
	// GETTERS Y SETTERS
	
	public int getI_region_id() {
		return i_region_id;
	}

	public void setI_region_id(int i_region_id) {
		this.i_region_id = i_region_id;
	}

	public String getS_region_name() {
		return s_region_name;
	}

	public void setS_region_name(String s_region_name) {
		this.s_region_name = s_region_name;
	}
	
	
	
}
