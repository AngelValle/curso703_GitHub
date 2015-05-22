package curso.ejemplos.repasofull;

import java.util.*;

public class OrdenHashMap {
	
	public static Map<Coche, Persona> ordenarPorKlave(Map<Coche, Persona> hashmap_sin_ordenar) 
	{
		LinkedHashMap<Coche, Persona> hashmap_ordenado = null;
		
		TreeMap<Coche, Persona> treemap_ordenado = new TreeMap<Coche, Persona>();
		treemap_ordenado.putAll(hashmap_sin_ordenar);
		hashmap_ordenado = new LinkedHashMap<Coche, Persona>();
		hashmap_ordenado.putAll(treemap_ordenado);
		
		return hashmap_ordenado;
	}
	
	public static Map<Coche, Persona> ordenarPorValor(Map<Coche, Persona> hashmap_sin__ordenar) 
	{
		LinkedHashMap<Coche, Persona> linkedhashmap_ordenado = new LinkedHashMap<Coche, Persona>();
		Persona persona_en_curso = null;
		
		ArrayList<Persona> arraylist_valores = new ArrayList<Persona>();
		ArrayList<Coche> arraylist_klaves = new ArrayList<Coche>();
		arraylist_valores.addAll(hashmap_sin__ordenar.values()); 
		arraylist_klaves.addAll (hashmap_sin__ordenar.keySet());
		
		TreeSet<Persona> treemap_ordenado = new TreeSet<Persona>();
		treemap_ordenado.addAll(hashmap_sin__ordenar.values());

		Iterator<Persona> iterador_treemap_ordenado = treemap_ordenado.iterator();
		
		while (iterador_treemap_ordenado.hasNext())
		{
			persona_en_curso = (iterador_treemap_ordenado.next());
			linkedhashmap_ordenado.put(arraylist_klaves.get(arraylist_valores.indexOf(persona_en_curso)), persona_en_curso);
		}
		
		return  linkedhashmap_ordenado;
	}
	
	
//////////////// Investigar 
//
//	public static Map<Coche, Persona> ordenaPorValor2 (HashMap<Coche, Persona> hm)
//	{
//		LinkedHashMap<Coche, Persona> col_dev = null;
//		Comparator<? super Coche> cp = new ComparadorPersonas(hm);
//		
//		TreeMap<Coche, Persona> tm = new TreeMap<Coche, Persona>(cp); //me creo un árbol
//		tm.putAll(hm);//él solito va a ordenar todos los valores
//		
//		col_dev = new LinkedHashMap<Coche, Persona>();//me creo un hashmap enlazado, que respeta el orden de inserción
//		col_dev.putAll(tm);//y vuelco allí la colección, ya ordenada previamente por TreeMap
//		
//		return col_dev;
//		
//	}
	
	
}
