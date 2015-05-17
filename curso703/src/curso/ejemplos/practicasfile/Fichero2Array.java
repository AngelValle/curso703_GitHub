package curso.ejemplos.practicasfile;

import java.io.*;

public class Fichero2Array {

	public static int contarLineas(String rutafichero) throws IOException {
		int contador = 0;
		BufferedReader br = new BufferedReader(new FileReader(new File(rutafichero)));
		
		while(null!=br.readLine()) {
			contador++;
		}
		
		br.close();
		return contador;
	}
	
	public static String[] ficheroToArray(String rutafichero) throws IOException {
		int numerodelineas = 0;
		numerodelineas = contarLineas(rutafichero);
		String[] array_dev = new String[numerodelineas];
		File fichero = new File(rutafichero);
		String linea;
		int posicion = 0;
		
		BufferedReader br = new BufferedReader(new FileReader(new File(rutafichero)));
		
		if(fichero.exists()) {

			while(null!=(linea = br.readLine())) 
			{
				array_dev[posicion] = linea;
				posicion++;
			}
		br.close();
		}
	return array_dev;
	}
	
	public static void main(String[] args) throws IOException {
		
		String rutafichero = null;
		rutafichero = "ficheros\\1.txt";
		
		String[] array = ficheroToArray(rutafichero);
		
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}
	}
}