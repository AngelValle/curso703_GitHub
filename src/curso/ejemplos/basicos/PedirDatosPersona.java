package curso.ejemplos.basicos;

import java.util.*;

public class PedirDatosPersona {
	
	/* METODO NUMERO_PERSONAS */
	public static byte numeroPersonas()	{
		byte numeropersonas = 0;
		Scanner scnumeropersonas = new Scanner(System.in);
		System.out.println("¿Cuantas personas quieres crear?:");
		numeropersonas = scnumeropersonas.nextByte();
		return numeropersonas;	
	}
	
	/* METODO PEDIR_NOMBRE */
	public static String pedirNombre() { // Metodo para pedir nombre que nos devuelve una "String".
		String nombre = null; // Creamos una String nombre y la asignamos a valor de memoria "null".
		Scanner scnombre = new Scanner(System.in); // Scanner scnombre ("scnombre" variable que guarda lo introducido) = new Scanner(System.in). (Lo que guarda en la variable, entrada por el sistema Scanner).
		System.out.println("Ingresa un nombre:"); // Imprimimos una linea por pantalla.
		nombre = scnombre.next(); // Variable "nombre" = scnombre.next(). (Valor de entrada con Scanner).
		return nombre; // La String que devolvemos es la variable "nombre".
	}
	
	/* METODO PEDIR_EDAD */
	public static byte pedirEdad() { // Metodo para pedir edad que nos devuelve un "byte".
		byte edad = 0; // Creamos un byte edad y la asignamos a valor de memoria "0".
		Scanner scedad = new Scanner(System.in); // Scanner scedad ("scedad" variable que guarda lo introducido) = new Scanner(System.in). (Lo que guarda en la variable, entrada por el sistema Scanner).
		System.out.println("Ingresa una edad:"); // Imprimimos una linea por pantalla.
		edad = scedad.nextByte(); // Variable "edad" = scedad.next(). (Valor de entrada con Scanner).
		return edad; // El byte que devolvemos es la variable "edad".
	}


}
