package curso.ejemplos.repasofull;

import java.io.*;
import java.util.*;

import curso.ejemplos.repasofull.exception.*;

public class Main {
	
	public static void main(String[] args) throws PersonaExisteException, DesbordamientoArrayException, NotaException, FileNotFoundException, IOException, ClassNotFoundException 
	{	
		Persona p1 = new Persona("Angel",22);
		Persona p2 = new Persona("Luis",18);
		Persona p3 = new Persona("Juan",34);
		
		Map<Persona, Persona> hash_persona = new HashMap<Persona, Persona>();
		
		hash_persona.put(p1, p1);
		hash_persona.put(p2, p2);
		hash_persona.put(p3, p3);
		
		Map<Persona, Persona> tree_persona = new TreeMap<Persona, Persona>();
		
		tree_persona.putAll(hash_persona);
		
		hash_persona.clear();
		
		hash_persona.putAll(tree_persona);
		
		System.out.println(hash_persona);
		
		
		
		
		
		
		
//		ArrayList<Persona> arraylist = new ArrayList<Persona>();
//		arraylist.add(p1);
//		arraylist.add(p2);
//		arraylist.add(p3);
//		
//		System.out.println(arraylist+"__Sin ordenar");
//		Collections.sort(arraylist, new OrdenarPorNombre());
//		System.out.println(arraylist+"__Ordenado por nombre");
//		Collections.sort(arraylist, new OrdenarPorEdad());
//		System.out.println(arraylist+"__Ordenado por edad");
		
///////////////////////////// PRUEBAS CON INTERFAZ "Lista" /////////////////////////////
//		List<Persona> list = new LinkedList<Persona>();
//		
//		list.add(p);
//		list.add(j);
//		
//		System.out.println(list);
///////////////////////////////////////////////////////////////////////////////////////		
		
/////////////////////////////////PRUEBAS CON INTERFAZ "Set" ///////////////////////////
//		Set<Persona> mi_mapa2 = new TreeSet<Persona>();
//		
//		mi_mapa2.add(p1);
//		mi_mapa2.add(p2);
//		mi_mapa2.add(p3);
//		
//		System.out.println(mi_mapa2);
///////////////////////////////////////////////////////////////////////////////////////	
		
/////////////////////////////////PRUEBAS CON INTERFAZ "Map" ///////////////////////////
//		Map<String, Persona> mi_mapa1 = new HashMap<String, Persona>();
//		
//		mi_mapa1.put(p1.getNombre(), p1);
//		mi_mapa1.put(p2.getNombre(), p2);
//		mi_mapa1.put(p2.getNombre(), p2);
//		
//		System.out.println(mi_mapa);
///////////////////////////////////////////////////////////////////////////////////////		
		
///////////////////////////// PRUEBA CON LA CLASE "ArrayList" ///////////////////////////////////////	
//		ArrayList<Persona> arraylist = new ArrayList<Persona>();
//		Alumno angel = new Alumno("Angel",8,8);
//		
//		arraylist.add(new Alumno("Angel",8,8));
//		arraylist.add(new Alumno("Luis",8,8));
//		
//		System.out.println("Contiene arraylist 'Angel': "+arraylist.contains(angel));
//		System.out.println("Borramos objeto 'Angel': "+arraylist.remove(angel));
//		
//		// HASTA AQUI TENEMOS ARRAYLIST CON: 1 OBJETO "Angel".
//		// AHORA VAMOS A COPIAR EN "listapersonas" Y BORRAR "arraylist".
//		
//		ListaPersonas listapersonas = new ListaPersonas();
//		
//		for (Persona persona : arraylist) {
//			listapersonas.insertarPersona(persona); // COPIA DE CADA PERSONA DE "arraylist" en "listapersonas". 
//		}
//		
//		arraylist.clear(); // BORRADO "arraylist".
//		
//		Persona[] array_persona = new Persona[2]; //CREAMOS UN ARRAY NUEVO DE "intermediario".
//		
//		array_persona = listapersonas.getListaPersonas(); // COPIAMOS EN "array_persona" EL ARRAY DE "listapersonas".
//		
//		for (int i=0; i<array_persona.length; i++)  //RECORREMOS "array_persona" Y LO COPIAMOS EN "arraylist".
//		{
//			arraylist.add(array_persona[i]);
//		}
//		
//		listapersonas.limpiar(); // BORRADO "listapersonas".
//		
//		for (Persona persona : arraylist) { //RECORREMOS "arraylist" Y MOSTRAMOS SUS "Persona" SIN MOSTRAR LOS == NULL.
//			if(persona!=null)
//			{
//				System.out.println(persona);
//			}
//		}
//		
//		
//		listapersonas.mostrar();
		
//////////////////////////////////////////////////////////////////////////////////////////////////////////	
			
		
		
		
		
/////////////////// PRUEBAS CON LA CLASE "ListaPersona" //////////////////////////////////////////////////
//		ListaPersonas listapersona = new ListaPersonas();
//		
//		
//		listapersona.insertarPersona(new curso.ejemplos.repasofull.Alumno("Angel", 8, 8)); //1
//		listapersona.insertarPersona(new curso.ejemplos.repasofull.Alumno("Diego", 8, 8)); //2
//		listapersona.insertarPersona(new curso.ejemplos.repasofull.Alumno("Luis", 8, 8)); //3
//		listapersona.insertarPersona(new curso.ejemplos.repasofull.Alumno("Diego2", 8, 8)); //4
//		listapersona.insertarPersona(new curso.ejemplos.repasofull.Alumno("Angel3", 8, 8)); //5
//		listapersona.insertarPersona(new curso.ejemplos.repasofull.Alumno("Angel4", 8, 8)); //6
//		listapersona.insertarPersona(new curso.ejemplos.repasofull.Alumno("Angel5", 8, 8)); //7
//		listapersona.insertarPersona(new curso.ejemplos.repasofull.Alumno("Angel6", 8, 8)); //8
//		listapersona.insertarPersona(new curso.ejemplos.repasofull.Alumno("Angel7", 8, 8)); //9
//		listapersona.insertarPersona(new curso.ejemplos.repasofull.Alumno("Angel8", 8, 8)); //10
//		listapersona.insertarPersona(new curso.ejemplos.repasofull.Alumno("Angel9", 8, 8)); //11
//		listapersona.insertarPersona(new curso.ejemplos.repasofull.Alumno("Angel10", 8, 8)); //12
//		listapersona.insertarPersona(new curso.ejemplos.repasofull.Alumno("Angel11", 8, 8)); //13
//		System.out.println(listapersona.numeroPersonas());
//		System.out.println("Busqueda: "+listapersona.buscarPersona("Luis"));
//		listapersona.serializar();
//		listapersona.deserializar();
//		listapersona.mostrar();
//		System.out.println(listapersona.numeroPersonas());
//		listapersona.eliminarPersona("Angel");
//		listapersona.insertarPersona(new curso.ejemplos.repasofull.Alumno("Diego", 8, 8));
//		listapersona.mostrar();
//		listapersona.estaLlena();
//		listapersona.mostrar();
//		listapersona.serializar();
//		listapersona.deserializar();
//		System.out.println(listapersona.numeroPersonas());
//		listapersona.mostrar();
/////////////////// FIN PRUEBAS CON LA CLASE "ListaPersona" ///////////////////////////////////////////////
	}
}
