package curso.ejemplos.arrays;

import java.util.Scanner;

public class MetodosEjercicios {
	
	
	static enum listanotas {SOBRESALIENTE,NOTABLE,BIEN,SUFICIENTE,INSUFICIENTE,NOTA_NO_VALIDA};
	
	
	public static String pedirString() {
		String string = null;
		Scanner scstring = new Scanner(System.in);
		string = scstring.next();
		return string;
	}
	
	public static String pedirCaracter() {
		String caracter = null;
		Scanner sccaracter = new Scanner(System.in);
		caracter = sccaracter.next();
		return caracter;
	}
	
	public static int pedirNumero() {
		int numero = 0;
		Scanner scnumero = new Scanner(System.in);
		numero = scnumero.nextInt();
		return numero;
	}
	
// METODO EJERCICIO 1 "Ver si aparece el caracter en la cadena pedidos al usuario"
	public static boolean apareceCaracterEnString(String cadena, char caracter) {
		boolean aparece = false;
		int longitud = cadena.length()-1;
		
		do {
			if(cadena.charAt(longitud)==caracter) {
				aparece=true;
			}
			longitud--;
		}while(longitud!=-1);
		return aparece;
	}
// METODO EJERCICIO 2 "Ver cuantas veces aparece un caracter en la cadena"
	public static int apareceCaracterEnStringContar(String cadena,char caracter) {
		int contador = 0;
		int longitud = cadena.length()-1;
		
		for(int i=0;i<=longitud;i++){
			if(cadena.charAt(i)==caracter) {
				contador++;
			}
		}
		return contador;
	}
// METODO EJERCICIO 3 "Pasar 1 numero y saber si es par o no"
	public static boolean esPar(int numero) {
		boolean espar = false;
		
		numero = numero%2;
		if(numero==0) {
			espar = true;
		}
		return espar;
	}
// METODO EJERCICIO 4 "Recogemos una edad y decimos si es mayor o menos de edad"
	public static boolean esMayorEdad(int numero) {
		boolean esmayor = false;
		int mayoredad = 18;
		
		if(numero>=mayoredad) {
			esmayor = true;
		}
		else {
			esmayor = false;
		}
	return esmayor;
	}
// METODO EJERCICIO 5 "Recogemos una nota y devolvemos un equivalente en String"
	public static listanotas notaEquivalente(int numero) {
		listanotas notacualificativa;
		
		switch (numero) {
		case 10: notacualificativa = listanotas.SOBRESALIENTE;
			break;
		case 9: notacualificativa = listanotas.NOTABLE;
			break;
		case 8:
		case 7: notacualificativa = listanotas.BIEN;
			break;
		case 6:
		case 5: notacualificativa = listanotas.SUFICIENTE;
			break;
		case 4:
		case 3:
		case 2:
		case 1:
		case 0: notacualificativa = listanotas.INSUFICIENTE;
			break;
			
		default: notacualificativa = listanotas.NOTA_NO_VALIDA;
			break;
		}
		return notacualificativa;
	}
// METODO EJERCICIO 6 "Recogemos una cadena de texto y la devolvemos al reves"
	public static String cadenaAlReves(String nombre) {
		String cadenarecibida = nombre;
		String cadenadevuelta = "";
		
		for(int i=cadenarecibida.length()-1;i<=cadenarecibida.length()&&(i!=-1);i--) {
			cadenadevuelta = cadenadevuelta+cadenarecibida.charAt(i);
		}
		return(cadenadevuelta);
	}
// METODO EJERCICIO 7 "Mostramos por pantalla 3,6,9,12,15.....99"
	public static void contarHasta99() {
		int numero = 3;
		int numerosuma = 3;
		System.out.println();
		do {
			System.out.print(numero+",");
			numero = numero+numerosuma;
		}while(numero<=99);
	}
}
