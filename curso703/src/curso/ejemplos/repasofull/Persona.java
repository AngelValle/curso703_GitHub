package curso.ejemplos.repasofull;
import java.io.Serializable;

public class Persona implements Serializable 
{
	private static final long serialVersionUID = 1L;
	
	private int edad;
	private String nombre;
	
	
	public Persona(String nombre, int edad) 
	{
		this.edad = edad;
		this.nombre = nombre;
	}


	public int getEdad() 
	{
		return edad;
	}


	public void setEdad(int edad) 
	{
		this.edad = edad;
	}


	public String getNombre() 
	{
		return nombre;
	}


	public void setNombre(String nombre) 
	{
		this.nombre = nombre;
	}
	
	@Override
	public String toString() 
	{
		return "Nombre: "+this.nombre+" "+"Edad: "+this.edad;
	}
	
	@Override
	public boolean equals(Object obj) {
		boolean igualdad = false;
		Persona p = null;
		
		p = (Persona) obj; // CASTING DE "P" SE CONVIERTE EN OBJETO DE PERSONA COPIANDO LOS ATRIBUTOS Y METODOS DE "OBJ".
		
		if((this.nombre.equals(p.nombre))&&(this.edad == p.edad))
		{
			igualdad = true;
		}
		else if((this.nombre != p.nombre) || (this.edad != p.edad))
		{
			igualdad = false;
		}
		return igualdad;
	}
}
