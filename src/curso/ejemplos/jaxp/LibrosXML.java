package curso.ejemplos.jaxp;

import java.util.*;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class LibrosXML extends DefaultHandler {
	
	private String valor = null;
	private Libro libro = null;

	private Map<String, Libro> m_libro = null;
	
	public LibrosXML(Map<String, Libro> m_libro)
	{
		this.libro = new Libro();
		this.m_libro = m_libro;
	}
	
	
	@Override 	
	public void startElement(String uri, String localName, String name, Attributes attributes) throws SAXException
	{
		valor = null; // Limpiamos la variable "valor".
		
	    if(localName.equals("libro")) // Si la etiqueta (localName) es == "libro" leemos el ISBN.
	    {  
	    	String isbn = attributes.getValue("isbn");  
	    	libro.setIsbn(isbn);
	    }  
	}
	@Override  
	   public void characters(char[] ch, int start, int length) throws SAXException 
	   {   
	      valor = new String(ch,start,length); // Guardamos el texto en la variable temporal
	   }
	@Override  
		public void endElement(String uri, String localName, String name) throws SAXException
		{  
//			Según la etiqueta guardamos el valor leido en una propiedad del objeto libro 
			if (localName.equals("titulo"))
			{  
				libro.setTitulo(valor);  
			}else if (localName.equals("autor"))
			{  
				libro.setAutor(valor);  
			}else if (localName.equals("anyo"))
			{  
				libro.setAnyo(valor);  
			}else if (localName.equals("editorial"))
			{  
				libro.setEditorial(valor);
				m_libro.put(libro.getIsbn(), libro);
				libro = new Libro();
			}
		} 
} 
