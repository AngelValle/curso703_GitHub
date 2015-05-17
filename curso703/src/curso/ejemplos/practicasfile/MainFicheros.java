package curso.ejemplos.practicasfile;

import java.io.*;

public class MainFicheros {
	
	public static String separador = "|";
	
	public static void verDirectorio(String ruta) {
		String rutamod = "";
		String[] lista = null;
		
		File file = new File (ruta); // Reconocemos "file" como un archivo y recogemos su ruta.
		lista = file.list(); // Hacemos un ".list" del archivo "file".
		
		if(file.exists()) {// Comprobamos que el fichero echiste.
		
			for(int i=0;i<lista.length;i++) { // Recorremos la lista generada.
			
				rutamod = ruta+"\\"+lista[i]; //Añadimos a la ruta parte del array para comprobar si es un directorio y listarlo.
				File filetemp = new File(rutamod); // Creamos un archivo temporal con la rutamod.
			
				if(filetemp.isDirectory()) { // Comprobamos que el archivo es un directorio.
					System.out.println(separador+"=>"+ lista[i]); // Escribimos por pantalla "Carpeta"
					separador = separador + "."; // Ampliamos el separador
					verDirectorio(rutamod); // Hacemos recursividad si es directorio para listarlo y volver a ver si sus ficheros (si es que tiene) son directorios.
				}
				else {
					System.out.println(separador+" "+lista[i]); // Escribimos por pantalla "Fichero"
				}
			}
		}
		else{
			System.out.println("¡La ruta no apunta a ninguna carpeta!");
		}
	}

	
	public static void main(String[] args) {
		
		String ruta = "ficheros";
		MainFicheros.verDirectorio(ruta);
		
	}

}
