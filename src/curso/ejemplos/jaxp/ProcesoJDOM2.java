package curso.ejemplos.jaxp;

import java.io.*;
import java.util.*;
import org.jdom2.*;
import org.jdom2.input.*;
import org.jdom2.output.*;

public class ProcesoJDOM2 {
	
	private static Element tranformarLibroAElement (Libro l)
	{
		Element e_libro = new Element("Libro");
		e_libro.setAttribute("ISBN", l.getIsbn());
		Element e_titulo = new Element("Titulo");
		e_titulo.addContent(l.getTitulo());
		Element e_autor = new Element("Autor");
		e_autor.addContent(l.getAutor());
		Element e_anyo = new Element("Anyo");
		e_anyo.addContent(l.getAnyo());
		Element e_editorial = new Element("Editorial");
		e_editorial.addContent(l.getEditorial());
		
		e_libro.addContent(e_titulo);
		e_libro.addContent(e_autor);
		e_libro.addContent(e_anyo);
		e_libro.addContent(e_editorial);
		
		return e_libro;
	}
	
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
		
		// CREAMOS UN TREEMAP PARA GUARDAR LUEGO EL CONTENIDO DEL FICHERO XML
		Map<String, Libro> tree_libros = new TreeMap<String, Libro>();
		
		for (Element libro : libros) 
		{
			// CREAMOS UN LIBRO 
			Libro book = new Libro();
			
			// INSERTAMOS EL ISBN. DEFINIDO COMO VALOR DEL ATTRIBUTE
			book.setIsbn(libro.getAttribute("isbn").getValue());
			
			// CREAMOS UN LIST CON LOS HIJOS DE CADA ELEMENT LIBRO
			List<Element> detalles = libro.getChildren();

			// RECORREMOS LOS HIJOS DE CADA LIBRO
			for (Element detalle : detalles) 
			{	
				// HACEMOS UN SWITCH Y DEPENDIENDO DEL .getName() RECIBIDO, INSERTAREMOS EL VALOR EN SU LUGAR
				switch (detalle.getName()) 
				{
					case "titulo": 		book.setTitulo(detalle.getValue());
						break;
					case "autor": 		book.setAutor(detalle.getValue());
						break;
					case "anyo": 		book.setAnyo(detalle.getValue());
						break;
					case "editorial": 	book.setEditorial(detalle.getValue());
										tree_libros.put(book.getTitulo(), book);
						break;
				}
			}
		}
		
		List<Libro> list_libros = new ArrayList<Libro>();
		list_libros.addAll(tree_libros.values());
	
		Element e_libros = new Element("Libros");
		Document documentolibros = new Document(e_libros);
		Integer contador = 0;
		
		for (Libro libro : list_libros) 
		{
			Element elementolibro = null;
			elementolibro = tranformarLibroAElement(libro);
			e_libros.addContent(elementolibro);
			contador++;
		}
		
		Element e_total = new Element("Total");
		e_libros.addContent(e_total);
		e_total.addContent(contador.toString());
		
		Format format = Format.getPrettyFormat();
		XMLOutputter xmloutputter = new XMLOutputter(format);
		String docStr = xmloutputter.outputString(documentolibros);
		FileWriter fw = new FileWriter("lsalida3.xml");
		fw.write(docStr);
		fw.close();
	}

}