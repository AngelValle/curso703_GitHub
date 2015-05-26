package curso.ejemplos.jaxp;

import java.io.*;
import java.util.*;

import org.jdom2.*;
import org.jdom2.input.*;
import org.jdom2.output.*;

public class ProcesoJDOM {
	
	public static void main(String[] args) throws FileNotFoundException, JDOMException, IOException 
	{
		//CREAMOS EL PARSER
		SAXBuilder builder = new SAXBuilder();
		
		// CONSTRUIMOS EL ARBOL DOM A PARTIR DEL FICHERO XML
		Document documentoJDOM = builder.build(new FileInputStream("ficheros\\libros.xml"));

		//MOSTRAMOS EL DOCUMENTO
		Element raiz = documentoJDOM.getRootElement();
		
		// RECORREMOS LOS HIJOS DE LA ETIQUETA RAÍZ
		List<Element> libros = raiz.getChildren();
		
		for (Element libro : libros) 
		{
			//PARA CADA LIBRO, OBTENEMOS SU DETALLE
			System.out.println(libro.getAttribute("isbn"));
			List<Element> detalles = libro.getChildren();

			for (Element detalle : detalles) {

				System.out.println("Nombre =" + detalle.getName());
				System.out.println("Valor =" + detalle.getValue());

			}

			
		}
		
		//AÑADO UN NUEVO HIJO
		Element padre = documentoJDOM.getRootElement();
		
	    // CREAMOS UNA NUEVA ETIQUETA  
	    Element nuevolibro = new Element("libro"); 
	    
	    // AÑADIMOS UN ATRIBUTO  
	    nuevolibro.setAttribute("isbn", "xxxx-yyyy"); 
	    
	    padre.addContent(nuevolibro);  

	    
	   //SERIALIZO EL DOCUMENT A UN FICHERO DE SALIDA
	    
	    Format format = Format.getPrettyFormat();
	    // Creamos el serializador con el formato deseado  
	    XMLOutputter xmloutputter = new XMLOutputter(format);
	    // Serializamos el document parseado  
	    String docStr = xmloutputter.outputString(documentoJDOM); 
	    //Volcamos en un fichero
	    FileWriter fw = new FileWriter("lsalida3.xml");
	    fw.write(docStr);
	    fw.close();
	    
	}

}
