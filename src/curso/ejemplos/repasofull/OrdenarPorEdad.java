package curso.ejemplos.repasofull;

import java.util.Comparator;

public class OrdenarPorEdad implements Comparator<Persona> {

	@Override
	public int compare(Persona p1, Persona p2) {
		
		Integer p1edad = p1.getEdad();
		Integer p2edad = p2.getEdad();
		Integer esmayor = 0;
		
		esmayor = p1edad.compareTo(p2edad);
		
		return esmayor;
	}
}
