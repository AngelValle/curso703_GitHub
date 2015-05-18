package curso.ejemplos.arrays;

import curso.ejemplos.arrays.MetodosEjercicios.listanotas;

public class MainEjercicios {
	
	static String cadena = null;
	static String recogercaracter = null;
	static char caracter = 0;
	static int numero = 0;
	static int edad = 0;
	static int nota = 0;
	static String cadenaoriginal = null;
	static int numerofinal = 0;
	
	
	public static void main(String[] args) {
		
// RECOGER CADENA Y CARACTER		
		System.out.println("Ingresa una cadena:");
		cadena = MetodosEjercicios.pedirString();
		
		System.out.println("Ingresa un caracter:");
		recogercaracter = MetodosEjercicios.pedirCaracter();
		caracter = recogercaracter.charAt(0);
		
		System.out.println("Ingresa un numero:");
		numero = MetodosEjercicios.pedirNumero();
		
		System.out.println("Ingresa una edad: ");
		edad = MetodosEjercicios.pedirNumero();
		
		System.out.println("Ingresa una nota de 0 a 10: ");
		nota = MetodosEjercicios.pedirNumero();
		
		System.out.println("Ingresa una cadena que posteriormente se va a poner en orden inverso: ");
		cadenaoriginal = MetodosEjercicios.pedirString();
		
// EJERCICIO 1	
		boolean aparece = false;
		
		aparece = MetodosEjercicios.apareceCaracterEnString(cadena, caracter);
		System.out.println("Aparece el caracter en la cadena: "+aparece);

// EJERCICIO 2
		int cuantasvecesaparece = 0;
		
		cuantasvecesaparece = MetodosEjercicios.apareceCaracterEnStringContar(cadena, caracter);
		System.out.println("Aparece "+cuantasvecesaparece+" veces en la cadena.");
// EJERCICIO 3
		boolean espar = false;
		
		espar = MetodosEjercicios.esPar(numero);
		System.out.println("El numero ingresador es par: "+espar);
// EJERCICIO 4
		boolean esmayor = false;
		
		esmayor = MetodosEjercicios.esMayorEdad(edad);
		System.out.println("La edad ingresada es mayor de edad: "+esmayor);
// EJERCICIO 5
		listanotas notaequivalente;
		
		notaequivalente = MetodosEjercicios.notaEquivalente(nota);
		System.out.println("La nota equivalente en texto es: "+notaequivalente);
// EJERCICIO 6
		String cadenaalreves = null;
		
		cadenaalreves = MetodosEjercicios.cadenaAlReves(cadenaoriginal);
		System.out.println(cadenaalreves);
// EJERCICIO 7
		MetodosEjercicios.contarHasta99();
	}
}
