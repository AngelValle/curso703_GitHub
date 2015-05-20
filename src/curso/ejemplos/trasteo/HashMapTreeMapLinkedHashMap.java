package curso.ejemplos.trasteo;

import java.util.*;

import curso.ejemplos.repasofull.*;
import curso.ejemplos.repasofull.exception.NotaException;

public class HashMapTreeMapLinkedHashMap {
	
	
	
	public static void main(String[] args) throws NotaException {
		
		Alumno p1 = new Alumno("Angel",8,8);
		Alumno p2 = new Alumno("Luis",8,10);
		Alumno p3 = new Alumno("Pedro",8,7);
		Alumno p4 = new Alumno("Juan",8,9);

		Map<String, Persona> mi_mapa1 = new LinkedHashMap<String, Persona>();
		
		mi_mapa1.put("1", p1);
		mi_mapa1.put("2", p2);
		mi_mapa1.put("3", p3);
		mi_mapa1.put("4", p4);
		
		System.out.println(mi_mapa1);
		
		Map<Integer, Persona> mi_mapa2 = new TreeMap<Integer, Persona>();
		
		mi_mapa2.put(p1.getNota(), p1);
		mi_mapa2.put(p2.getNota(), p2);
		mi_mapa2.put(p3.getNota(), p3);
		mi_mapa2.put(p4.getNota(), p4);
		
		System.out.println(mi_mapa2);

		Map<Integer, Persona> mi_mapa3 = new HashMap<Integer, Persona>();
		
		mi_mapa3.put(p1.getNota(), p1);
		mi_mapa3.put(p2.getNota(), p2);
		mi_mapa3.put(p3.getNota(), p3);
		mi_mapa3.put(p4.getNota(), p4);
		
		System.out.println(mi_mapa3);
		
	}
	
}
