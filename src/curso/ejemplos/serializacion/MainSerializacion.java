package curso.ejemplos.serializacion;

import java.io.*;

public class MainSerializacion {
	
	private static Alumno alumno1 = new Alumno("Alumno1","a",1);
	private static Alumno alumno2 = new Alumno("Alumno2","b",2);
	private static Alumno alumno3 = new Alumno("Alumno3","c",3);
	private static Alumno alumno4 = new Alumno("Alumno4","d",4);
	private static Alumno alumno5 = new Alumno("Alumno5","e",5);
	private static Alumno[] lista_persona = {alumno1, alumno2, alumno3, alumno4, alumno5};
	
	private static Alumno alumnovacio1 = new Alumno();
	private static Alumno alumnovacio2 = new Alumno();
	private static Alumno alumnovacio3 = new Alumno();
	private static Alumno alumnovacio4 = new Alumno();
	private static Alumno alumnovacio5 = new Alumno();
	private static Alumno[] lista_persona_vacia = {alumnovacio1, alumnovacio2, alumnovacio3, alumnovacio4, alumnovacio5};

	public static void main(String[] args) throws IOException, Exception {
		
		ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream("ficheros\\grabarobjetos.txt"));
		salida.writeObject(lista_persona);
		salida.close();
		
		ObjectInputStream entrada = new ObjectInputStream(new FileInputStream("ficheros\\grabarobjetos.txt"));
		lista_persona_vacia = (Alumno[])entrada.readObject();
		entrada.close();
		
		for(int i=0;i<lista_persona_vacia.length;i++)
		{
			System.out.println(lista_persona_vacia[i]);
		}
	}
}
