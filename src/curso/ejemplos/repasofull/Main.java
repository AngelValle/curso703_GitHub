package curso.ejemplos.repasofull;

import java.io.FileNotFoundException;
import java.io.IOException;

import curso.ejemplos.repasofull.exception.DesbordamientoArrayException;
import curso.ejemplos.repasofull.exception.NotaException;
import curso.ejemplos.repasofull.exception.PersonaExisteException;
import curso.ejemplos.serializacion.Alumno;

public class Main {
	
	public static void main(String[] args) throws PersonaExisteException, DesbordamientoArrayException, NotaException, FileNotFoundException, IOException, ClassNotFoundException 
	{
		ListaPersonas listapersona = new ListaPersonas();
		
//		listapersona.insertarPersona(new curso.ejemplos.repasofull.Alumno("Angel", 8, 8)); //1
//		listapersona.insertarPersona(new curso.ejemplos.repasofull.Alumno("Diego", 8, 8)); //1
//		listapersona.insertarPersona(new curso.ejemplos.repasofull.Alumno("Luis", 8, 8)); //1
//		listapersona.insertarPersona(new curso.ejemplos.repasofull.Alumno("Diego2", 8, 8)); //2
//		listapersona.insertarPersona(new curso.ejemplos.repasofull.Alumno("Angel3", 8, 8)); //3
//		listapersona.insertarPersona(new curso.ejemplos.repasofull.Alumno("Angel4", 8, 8)); //4
//		listapersona.insertarPersona(new curso.ejemplos.repasofull.Alumno("Angel5", 8, 8)); //5
//		listapersona.insertarPersona(new curso.ejemplos.repasofull.Alumno("Angel6", 8, 8)); //6
//		listapersona.insertarPersona(new curso.ejemplos.repasofull.Alumno("Angel7", 8, 8)); //7
//		listapersona.insertarPersona(new curso.ejemplos.repasofull.Alumno("Angel8", 8, 8)); //8
//		listapersona.insertarPersona(new curso.ejemplos.repasofull.Alumno("Angel9", 8, 8)); //9
//		listapersona.insertarPersona(new curso.ejemplos.repasofull.Alumno("Angel10", 8, 8)); //10
//		listapersona.insertarPersona(new curso.ejemplos.repasofull.Alumno("Angel11", 8, 8)); //11
//		System.out.println(listapersona.numeroPersonas());
//		System.out.println("Busqueda: "+listapersona.buscarPersona("Luis"));
//		listapersona.serializar();
		listapersona.deserializar();
//		listapersona.mostrar();
//		listapersona.eliminarPersona("Angel");
//		listapersona.serializar();
		listapersona.mostrar();

	}
}
