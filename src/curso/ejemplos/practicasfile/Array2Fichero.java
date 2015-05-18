package curso.ejemplos.practicasfile;

import java.io.*;

public class Array2Fichero {
	
	static String[] array = {"Angel es un DIOS"};
	
	public static boolean arrayToFichero(String[] array_recibido,String rutafichero) throws IOException {
		boolean comprobacion = false;
		BufferedWriter bw = new BufferedWriter(new FileWriter(new File(rutafichero)));
		
		for(int i=0;i<array_recibido.length;i++) {
			bw.write(array_recibido[i]+"\r\n");
		}
		bw.close();
		
		return comprobacion;
	}
	
	public static void main(String[] args) throws IOException {
		
		String rutafichero = null;
		rutafichero = "ficheros\\2.txt";
		arrayToFichero(array, rutafichero);
	}
}
