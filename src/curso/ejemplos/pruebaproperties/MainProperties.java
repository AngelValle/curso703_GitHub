package curso.ejemplos.pruebaproperties;

import java.io.*;
import java.util.*;

public class MainProperties {
	
	private static String idioma = null;
	private static Properties propiedades = new Properties();
	
	private static void cargarPropertiesPorIdioma(String idioma) throws IOException  
	{
		switch (idioma) 
		{
			case "spanish": idioma = "es";
				break;
			case "italian": idioma = "it";
				break;
			case "english": idioma = "en";
				break;
		
			default: idioma = "Idioma no valido, Español='spanish', Ingles='english', Italiano='italian'.";
				break;
		}
		if((idioma!="es")&&(idioma!="it")&&(idioma!="en"))
		{
			System.out.println("El idioma ingresado no existe, por favor ingrese un idioma valido.");
		}
		else
		{
			BufferedReader br = new BufferedReader(new FileReader(idioma+".properties"));
			propiedades.load(br);
			br.close();
		
			String ruta = null;
			ruta = propiedades.getProperty("outfile");
		
			BufferedWriter bw = new BufferedWriter(new FileWriter("Ficheros\\"+ruta));
			bw.write(propiedades.getProperty("start")+"\r\n"+propiedades.getProperty("body")+"\r\n"+propiedades.getProperty("end"));
			bw.close();
			if(new File("Ficheros\\"+ruta).exists())
			{
				System.out.println("Fichero creado con existo!");
			}
			else
			{
				System.out.println("Ha ocurrido en error en la creacion del archivo.");
			}
		}
	}

	private static String pedirIdioma() {
		String idioma = null;
		Scanner scidioma = new Scanner(System.in);
		idioma = scidioma.next();
		scidioma.close();
		
		return idioma;
	}
	
	public static void main(String[] args) throws IOException {
		System.out.println("Creacion de cuento.\nIngrese un idioma. (Idioma validos: Español='spanish', Ingles='english', Italiano='italian')");
		
//		idioma = args[0];					// Recoger por args un Idioma.
		idioma = pedirIdioma(); 			// Pedimos por Scanner un Idioma.
		cargarPropertiesPorIdioma(idioma); 	// 1º Segun el idioma cargamos un .properties diferente.
											// 2º Establecemos un valor ruta igual al valor del campo "outfile".
											// 3º Creamos un archivo en el directorio "ruta" con los valores de: start, body y end.
	}
}
