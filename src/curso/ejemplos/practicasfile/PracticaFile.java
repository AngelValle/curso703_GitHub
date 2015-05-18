package curso.ejemplos.practicasfile;

import java.util.Scanner;
import java.io.*;

public class PracticaFile {
	
	public static String[] ficheroToArray(String rutafichero) {
		File fichero = new File(rutafichero);
		String[] array = null;
		FileReader fr = null;
		BufferedReader br = null;
		int contador = 0;
		
		if(fichero.exists()) {
			try {
				fr = new FileReader(fichero);
				br = new BufferedReader(fr);
				String linea;
			
				while(null!=(linea = br.readLine())) {
					
					array[contador] = linea;
					contador++;
//					System.out.println(linea);
				}
				
			} catch (IOException e) {
				e.printStackTrace();				
			}
			finally { 
				try {
					fr.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return array;
	}
	
	public static void main(String[] args) {
		
		String rutafichero = null;
		rutafichero = "ficheros\\1.txt";
		ficheroToArray(rutafichero);
		
	}

}
