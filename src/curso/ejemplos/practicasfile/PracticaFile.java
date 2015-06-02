package curso.ejemplos.practicasfile;

import java.io.*;
import java.util.*;

public class PracticaFile {
	
	public static ArrayList<String> ficheroToArray(String rutafichero) {
		File fichero = new File(rutafichero);
		ArrayList<String> array = new ArrayList<String>();
		FileReader fr = null;
		BufferedReader br = null;
		
		if(fichero.exists()) {
			try {
				fr = new FileReader(fichero);
				br = new BufferedReader(fr);
				String linea;
			
				while(null!=(linea = br.readLine())) {
					
					array.add(linea.toString());
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
		System.out.println(ficheroToArray(rutafichero));
		
	}

}
