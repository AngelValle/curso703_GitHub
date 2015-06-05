package evaluacion.primera;

import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		
		String bd = "HR.REGIONS";
		
		RegionDTO regiondto = new RegionDTO();
		regiondto.setI_region_id(5);
		regiondto.setS_region_name("Angel");
		
		// PRUEBA INSERTAR
		
		RegionDAO.insertarRegion(bd, regiondto);
		
		// PRUEBA MOSTRAR FILTRADO
		
		List<RegionDTO> recuperarregion = RegionDAO.recuperarRegion(bd, regiondto);
		System.out.println(recuperarregion);
		// PRUEBA BORRAR
		
		 RegionDAO.borrarRegion(bd, regiondto);
		// PRUEBA MOSTRAR LISTA
		
		 List<RegionDTO> recuperarlistaregion = RegionDAO.recuperarListaRegion(bd);
		 System.out.println(recuperarlistaregion);
	}

}
