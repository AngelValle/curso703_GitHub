package evaluacion.primera;

import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		
		
		RegionDTO regiondto = new RegionDTO();
		regiondto.setI_region_id(5);
		regiondto.setS_region_name("Angel");
		
		// PRUEBA INSERTAR
		
		System.out.println("Region insertada: "+RegionDAO.insertarRegion(regiondto));
		
		// PRUEBA MOSTRAR FILTRADO
		
		RegionDTO regionrecogida = RegionDAO.recuperarRegion(regiondto);
		System.out.println(regionrecogida);
		// PRUEBA BORRAR
		
		 System.out.println("Region borrada: "+RegionDAO.borrarRegion(regiondto));
		// PRUEBA MOSTRAR LISTA
		
		 List<RegionDTO> recuperarlistaregion = RegionDAO.recuperarListaRegion();
		 System.out.println(recuperarlistaregion);
	}

}
