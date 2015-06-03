package evaluacion.primera;

import java.util.*;

public class Main {
	
	public static void main(String[] args) {

		
		RegionDTO regiondto = new RegionDTO();
		
		regiondto.setI_region_id(5);
		regiondto.setS_region_name("Africa");
		List<RegionDTO> listregion = RegionDAO.recuperarListaRegion();
		System.out.println(listregion);
		
	}

}
