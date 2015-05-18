package curso.ejemplos.repasofull;

import java.io.*;
import java.util.Properties;

import curso.ejemplos.repasofull.exception.*;

public class ListaPersonas implements Serializable
{
	private static final long serialVersionUID = 1L;

	private static final int CAPACIDAD = 10;
	private static Persona[] array_personas;
	
	
	public ListaPersonas() 
	{
		array_personas = new Persona[CAPACIDAD];
	}
	
	public Persona[] getListaPersonas ()
	{
		return array_personas;
	}
	
	public Persona buscarPersona (String nombre)
	{
		Persona persona = null;
		int contador = 0;
		boolean comprobar = false;
		
		do {
			comprobar = (array_personas[contador].getNombre().equals(nombre));
			if(comprobar==false)
			{
				contador++;
			}
		} while ((comprobar==false)&&(contador<=array_personas.length-1));
		
		if(comprobar)
		{
			persona = array_personas[contador];
		}
		
		return persona;
	}
	
	public Persona buscarPersona (int edad)
	{
		Persona persona = null;
		int contador = 0;
		boolean comprobar = false;
		
		do {
			comprobar = (array_personas[contador].getEdad()==edad);
			
			if(comprobar==false)
			{
				contador++;
			}
			
		} while ((comprobar==false)&&(contador<=array_personas.length-1));
		
		if(comprobar)
		{
			persona = array_personas[contador];
		}
		
		return persona;
	}
	
	public void serializar() throws FileNotFoundException, IOException
	{
		Properties f_propiedades = new Properties();
		FileInputStream fis = null;
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		String ruta = null;
		
		try
		{
			fis = new FileInputStream(new File("serializa.properties"));
			f_propiedades.load(fis);
			ruta = f_propiedades.getProperty("destino");
			
			fos = new FileOutputStream(new File("ficheros\\"+ruta));
			oos = new ObjectOutputStream(fos);
			oos.writeObject(array_personas);
		}
		
		catch(FicheroException e)
		{
			throw new FicheroException();
		}
		
		finally
		{
			fis.close();
			fos.close();
			oos.close();
		}
	}
	
	public void deserializar() throws FileNotFoundException, IOException, ClassNotFoundException
	{
		Properties f_propiedades = new Properties();
		FileInputStream fis = null;
		FileInputStream fis2 = null;
		ObjectInputStream ois = null;
		String ruta = null;
		
		try
		{
			fis = new FileInputStream(new File("serializa.properties"));
			f_propiedades.load(fis);
			ruta = f_propiedades.getProperty("destino");
			
			fis2 = new FileInputStream(new File("ficheros\\"+ruta));
			ois = new ObjectInputStream(fis2);
//			for (int i=0; i<array_personas.length; i++) {
			array_personas = (Persona[])ois.readObject();
//			}
		}
		
		catch(FicheroException e)
		{
			throw new FicheroException();
		}
		
		finally
		{
			fis.close();
			fis2.close();
			ois.close();
		}
	}
	
	public void insertarPersona (Persona p) throws PersonaExisteException, DesbordamientoArrayException
	{
		boolean existe = false;
		int contador = 0;
		
		for (int i=0; i<array_personas.length-1; i++) 
		{
			if (null!=array_personas[i])
			{
				contador++;
			}
		}
		
		if(array_personas[contador]!=null)
		{
			throw new DesbordamientoArrayException();
		}
		
		for (int i=0; i<contador; i++) 
		{
			existe = p.equals(array_personas[i]);
			
			if(existe)
			{
				throw new PersonaExisteException();
			}
			
		}
		
		array_personas[contador] = p;
	}
	
	public int numeroPersonas()
	{
		int contador = 0;
		
		for (int i=0; i<array_personas.length; i++) 
		{
			if (null!=array_personas[i])
			{
				contador++;
			}
		}
		return contador;
	}
	
	public boolean estaLlena()
	{
		int contador = 0;
		boolean estallena = false;
		
		for (int i=0; i<array_personas.length; i++) 
		{
			if (null!=array_personas[i])
			{
				contador++;
			}
		}
		
		if(contador==CAPACIDAD)
		{
			estallena=true;
		}
		
		return estallena;
	}
	
	public void mostrar()
	{	
		for (int i=0; i<array_personas.length-1; i++)
		{
			if (null!=array_personas[i])
			{
				System.out.println(array_personas[i]);
			}
		}
	}
	
	public void eliminarPersona(String nombre)
	{
		{
			int contador = 0;
			boolean comprobar = false;
			
			do {
				comprobar = (array_personas[contador].getNombre().equals(nombre));
				if(comprobar==false)
				{
					contador++;
				}
			} while ((comprobar==false)&&(contador<=array_personas.length-1));
			
			if(comprobar)
			{
				array_personas[contador] = null;
			}
			else
			{
				System.out.println("No se encontro la persona a eliminar.");
			}
		}
	}
	
	public static int getCapacidad ()
	{
		return CAPACIDAD;
	}

}
