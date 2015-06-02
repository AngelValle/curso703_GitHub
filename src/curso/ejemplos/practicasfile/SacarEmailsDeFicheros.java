package curso.ejemplos.practicasfile;

import java.io.*;
//import java.util.Arrays;

public class SacarEmailsDeFicheros {
	
	private static String emails = "";
	private static String[] array = null;
	private static long tiempo_inicio = System.currentTimeMillis();
	private static Runtime rt = Runtime.getRuntime();

	
	/**
	 * Metodo que nos facilita la obtencion de e-mails desde un fichero.
	 * (Deben empezar por "***" y acabar en "///").
	 * @param ruta Ruta del fichero que vamos a procesar en busca de e-mails.
	 * @return Este metodo nos devuelve un array con los e-mails.
	 *
	 * 
	 */
	private static String[] resolverEmails (String ruta) throws IOException 
	{
		
		String[] array_de_emails = null;
		String linea = null;
//		String email = "";
		int contador = 0;
		
		String emailstart 	= "***";
		String emailfin		= "///";
		
//		String expresion_regular_mail_delante = ".*[\\*\\*\\*]{1}";
//		String expresion_regular_mail_detras = "/{3}[\\S\\s]*[\\*\\*\\*]{1}";
//		String expresion_regular_mail = "[\\S]+@[\\S]";
		
//			escribirmos una expresi�n regular que la define y su significado ser�a:
//	
//			Cualquier caracter (S) o espacio en blanco (s), de O a N veces (*)
//			seguido de un conjunto {1} de 3 asteriscos \\*
//			seguido de cualquier caracter (S) de 1 a N veces (+)
//			seguido de una arroba (@) 1 vez - simplemente @ -
//			seguido de 3 barras /{3}
//			y seguido de O a N (*) caracteres (S) o espacios en blanco(s)
//		 	
//			Siendo cadena un String, puedo aplicar:
//			  
//			 cadena.matches("regex")	Devuelve TRUE si cadena, es descrita totalmente por la expresi�n regular pasada
//			 cadena.split("regex")	Me devuelve un array de subcadenas de cadena, usando la expresi�n regular como separador. "regex" no est� inclu�da en el resultado
//			 cadena.replaceFirst("regex"), "replacement") Sustituye la primera aparici�n de la expresi�n regular en cadena, con el replacement dado
//			 cadena.replaceAll("regex"), "replacement") Sustituye todas las apariciones de la expresi�n regular, con el replacement dado
//			 	
//			Ahora, escribmos una expresi�n regular que defina el patr�n de aparici�n de un e-mail:
//		
//			3 asteriscos
//			seguido de cualquier caracter
//			terminado con 3 barras
		
		BufferedReader br = new BufferedReader(new FileReader(new File(ruta)));
		
		while(null!=(linea=br.readLine()))
		{
			//TODO Hacer con expresiones irregulares.
			
			if((linea.contains(emailstart))&&(linea.contains(emailfin)))
			{
				emails = emails + (linea.substring((linea.indexOf(emailstart)+3), linea.indexOf(emailfin))) + ":";
				contador++;	
			}			
//			if(linea.matches(expresion_regular_mail_delante))
//			{
//				linea.replaceAll(expresion_regular_mail_delante, "");
//			}
//			if(linea.matches(expresion_regular_mail_detras))
//			{
//				linea.replaceAll(expresion_regular_mail_detras, "***");
//			}
//			if(linea.matches(expresion_regular_mail)==true)
//			{
//				emails = emails + linea + ":";
//				contador++;
//			}
		}
		br.close();
		
		
		
//		BufferedWriter bw = new BufferedWriter(new FileWriter(new File(ruta)));
		array_de_emails = new String[contador];
		array_de_emails = emails.split(":");	
		
//		for(int i=0;i<array_de_emails.length;i++)
//		{
//			bw.write(array_de_emails[i]+"\r\n");
//		}
//		bw.close();
		
	return array_de_emails;
	}
	
	public static void main(String[] args) throws IOException {
		long freememory_inicio = rt.freeMemory();
		
		String rutafichero = null;
		rutafichero = "ficheros\\email2.txt";

		array = resolverEmails(rutafichero);

//		Array2Fichero.arrayToFichero(array, "ficheros\\3.txt");
		
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}
		
		System.out.println("Tiempo de ejecucion: "+(System.currentTimeMillis() - tiempo_inicio)+" milisegundos.");
		
		rt.gc();
		System.out.println(rt.freeMemory()-freememory_inicio);
	}

}
