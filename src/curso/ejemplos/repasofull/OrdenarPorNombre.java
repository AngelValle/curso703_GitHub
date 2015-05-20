package curso.ejemplos.repasofull;

import java.util.Comparator;

public class OrdenarPorNombre implements Comparator<Persona> {
	
	@Override
	public int compare(Persona p1, Persona p2) {
		
//		String p1nombre = p1.getNombre();
//		String p2nombre = p2.getNombre();
//		int esmayor = 0;
//		
//		esmayor = p1nombre.compareToIgnoreCase(p2nombre);
		
		return (p1.getNombre().compareToIgnoreCase(p2.getNombre()));
	}
}
