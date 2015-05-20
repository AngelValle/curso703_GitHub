package curso.ejemplos.trasteo;

import java.util.*;
import curso.ejemplos.repasofull.Persona;

public class Recorrer implements Iterator<Persona>{

	static ArrayList<Persona> arraylist = new ArrayList<Persona>(); 
	static Iterator<Persona> i_p = arraylist.iterator();
	
	
	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Persona next() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void remove() {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		
		Persona p = null;
		
		while(i_p.hasNext())
		{
			p = i_p.next();
			System.out.println(p);
		}
		
	}
	
	
	
}
