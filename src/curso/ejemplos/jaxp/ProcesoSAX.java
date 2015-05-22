package curso.ejemplos.jaxp;

import java.io.*;
import java.util.*;

import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;

public class ProcesoSAX {

	public static void main(String[] args) {  
        
	      try {  
	         // Creamos nuestro objeto libro vacío  
//	         Libro libro = new Libro();  
	         Map<String, Libro> m_libro = new HashMap<String, Libro>();  
	         // Creamos la factoria de parseadores por defecto  
	         XMLReader reader = XMLReaderFactory.createXMLReader();
	         // Añadimos nuestro manejador al reader pasandole el objeto libro  
//	         LibroXML libroxml = new LibroXML(libro);
	         LibrosXML librosxml = new LibrosXML(m_libro);
	         reader.setContentHandler(librosxml);
	         // Procesamos el xml de ejemplo  
	         reader.parse(new InputSource(new FileInputStream("Ficheros\\libros.xml")));  
	         
	         System.out.println(m_libro.toString());           
	      } catch (SAXException e) {  
	         e.printStackTrace();  
	      } catch (IOException e) {  
	         e.printStackTrace();  
	      }  
	  
	   }  
}
