package curso.ejemplos.practicasfile;

import java.io.*;

public class Fichero2FicheroCopiaDeBinarios {
	
	
	private static void copiarFicherosBinarios(String rutaficheroriginal,String rutaficheronuevo) throws IOException
	{
		FileInputStream fis = new FileInputStream(new File(rutaficheroriginal));
		FileOutputStream fos = new FileOutputStream(new File(rutaficheronuevo));
		
		int posicionbyte = 0;
		while(-1!=(posicionbyte=fis.read()))
		{
			fos.write(posicionbyte);
		}
		fis.close();
		fos.close();
	}
	
	public static void main(String[] args) throws IOException {
		
		copiarFicherosBinarios("ficheros\\1.pdf","ficheros\\2.pdf");
		
	}

}
