package curso.ejemplos.practicasfile;

import java.util.Stack;

public class MetodosCapicua {

	/**
	 * 
	 * 
	 * @author Val
	 *
	 *El código de esta clase, es un poco misterioso. Algún programador Clase "C", no ha usado
	 *nombres descriptivos y ahora, nos toca pegarnos y descubrir qué narices hace este código, 
	 *para poder usarlo en nuestro proyecto.
	 *
	 *
	 *Se pide:
	 *
	 *1) Adivinar la funcionalidad del método adivinaQueHace
	 *2) Una vez descubierto, aplicar un nombre apropiado al método y a la clase
	 *3) Idear un método equivalente, pero distinto. Es decir, crear un método 
	 *que haga lo mismo que adivinaQueHace, pero de otra manera.
	 *4) EXTRA: Sólo si resolviste los puntos anteriores, implementa una versión recursiva
	 *
	 */
	
	static private int contadorinicio = 0;
	static private int contadorfinal = 0;
	/**
	 * Metodo esCapicua para saber si una palabra es PALINDROMA. (Metodo eficiente al 100%).
	 * @param cad Cadena que ingresaremos para comprobar si es palindroma o no.
	 * @return Nos devuelve un boolean en TRUE si es palindroma y un FALSE si no es palindroma.
	 */
	private static boolean esCapicua (String cad)
	{
		boolean escapicua = true; // Boleano a TRUE
		
		int contadorprincipio = 0; // Variable "i" ha 0, para usarla en el while hasta igualar al caracter 0.
		int contadorultimo = cad.length()-1; // Variable "j" es igual a la longitud de la cadena que ingresamos al llamar al metodo.
		
		while ((contadorprincipio<=contadorultimo)&&(escapicua)) // Recorremos la cadena hasta que el caracter sea igual a 0.
		{
			escapicua = cad.charAt(contadorprincipio)==cad.charAt(contadorultimo); // Igualamos el boleano a TRUE si el caracter primero y ultimo son iguales.
			contadorprincipio++; // Sumamos 1 al caracter que recorre por abajo.
			contadorultimo--; // Restamos 1 al caracter que recorre por arriba.
		}
		
		
		return escapicua; // Devolvemos si es "capicia"
	}
	
//	private static boolean esCapicua2 (String cad)
//	{
//		boolean escapicua = false;
//		int contadorprincipio = 0;
//		int contadorultimo = cad.length()-1;
//		
//		do{
//			if(cad.charAt(contadorprincipio)==cad.charAt(contadorultimo))
//			{
//				escapicua = true;
//				contadorprincipio++;
//				contadorultimo--;
//			}
//		}while((escapicua)&&(contadorprincipio<=contadorultimo));
//
//		return escapicua;
//	}
	/**
	 * Metodo esCapicua2 para saber si una palabra es PALINDROMA (Metodo eficiente al 100%)
	 * se comprueba atraves de una pila por lo que el proceso es 100% real.
	 * @param cad Cadena que ingresaremos para comprobar si es palindroma o no.
	 * @return Nos devuelve un boolean en TRUE si es palindroma y un FALSE si no es palindroma.
	 */
	private static boolean esCapicua2 (String cad)
	{
		boolean escapicua = false;
		Stack<Character> pila = new Stack<Character>();
		int posicion1 = 0;
		int posicion2 = 0;
		int longitud = cad.length()-1;
		
		while(posicion1<=longitud)
		{
			pila.push(cad.charAt(posicion1));
			posicion1++;
		}
		
		do
		{
			if(cad.charAt(posicion2)==pila.peek())
			{
				pila.pop();
				posicion2++;
				escapicua = true;
			}
			else
			{
				escapicua = false;
				pila.clear();
			}
		}while((escapicua)&&(posicion2<=longitud));
		
	return escapicua;
	}
	/**
	 * Metodo esCapicuaRecursivo para saber si una palabra es PALINDROMA (Metodo no eficiente al 100%)
	 * este metodo ES RECURSIVO y se llama a si mismo hasta el final de la palabra siempre y cuando sea palindroma.
	 * @param cad Cadena que ingresaremos para comprobar si es palindroma o no.
	 * @return Nos devuelve un boolean en TRUE si es palindroma y un FALSE si no es palindroma.
	 */
	private static boolean esCapicuaRecursivo (String cad)
	{
		boolean escapicua = false;
		if((contadorinicio==0)&&(contadorfinal==0))
		{
			contadorinicio = 0;
			contadorfinal = cad.length()-1;
		}
		if(cad.charAt(contadorinicio)==cad.charAt(contadorfinal))
		{
			escapicua = true;
			contadorinicio++;
			contadorfinal--;
			if(contadorinicio<=contadorfinal)
			{
				esCapicuaRecursivo(cad);
			}
		contadorinicio=0;
		contadorfinal=0;
		}
	return escapicua;
	}
	
	public static void main(String[] args) {
		if (esCapicua("LARUTANOTURAL")) // Llamamos al metodo ingresando la cadena "poop".
		{
			System.out.println("VERDADERO");
		} else 
		{
			System.out.println("FALSO");
		}
		
		if (esCapicua2("LARUTANOTURAL")) // Llamamos al metodo ingresando la cadena "poop".
		{
			System.out.println("VERDADERO");
		} else 
		{
			System.out.println("FALSO");
		}
		
		if (esCapicuaRecursivo("LARUTANOTURAL")) // Llamamos al metodo ingresando la cadena "poop".
		{
			System.out.println("VERDADERO");
		} else 
		{
			System.out.println("FALSO");
		}
		
	}
}
