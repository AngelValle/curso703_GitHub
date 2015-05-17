package curso.ejemplos.basicos;

import java.util.Calendar;

public class Persona {
	public byte edad; // Atributo "EDAD" de la clase "PERSONA".
	public String nombre; // Atributo "NOMBRE" de la clase "PERSONA".
	private int fechanacimiento; // Atributo "FECHANACIMIENTO" de la clase "PERSONA".
	private static final byte MAYOREDAD = 18;
	

	
/* DEFINICIONES DE CONSTRUCTOR */
	
	/**
	 * 
	 * @param nombre // Nombre que introducimos al crear un objeto.
	 * @param edad // Edad que introducimos al crear un objeto.
	 * 
	 * La fecha de nacimiento se hace atraves del algoritmo ( Fecha actual - Edad).
	 */
	
	public Persona(String nombre, byte edad){ // Definimos un "CONSTRUCTOR" nuevo que recoge "nombre" y "edad".
		this.nombre = nombre; // Traduccion: Este.nombre(nombre referente al atributo de la clase "Persona") = nombre(Recogido por el constructor).
		this.edad 	= edad; // Traduccion: Esta.edad(edad referente al atributo de la clase "Persona") = edad(Recogido por el constructor).
		Calendar micalendario = Calendar.getInstance(); // Creamos un objeto "micalendario" de la clase "Calendar" cogiendo los valores actuales. (Ver mas a fondo como lo hace).
		int anioactual = 0; // Creamos "a�oactual" y lo asignamos a 0.
		anioactual = micalendario.get(Calendar.YEAR); // a�oactual(int) = micalendario(fecha actual).get(recoge) (Calendar.YEAR)(Metodo "YEAR" dentro de la clase "CALENDAR").
		
		fechanacimiento = anioactual - edad; // Restamos al a�o actual la edad del objeto y nos devuelve el a�o de nacimiento. (Falla si no se han cumplido los a�os en el a�o actual).
	}
	
	public Persona(){} // Redefinimos el metodo "CONSTRUCTOR ESTANDAR", hace falta si queremos llamarlo sin metodos al haber definido uno nuevo.
	
/* FIN DEFINICIONES DE CONSTRUCTOR */
	
	
	@Override
	public boolean equals(Object obj) {
		boolean igualdad = false;
		Persona p = null;
		
		p = (Persona) obj; // CASTING DE "P" SE CONVIERTE EN OBJETO DE PERSONA COPIANDO LOS ATRIBUTOS Y METODOS DE "OBJ".
		
		if((this.nombre.equals(p.nombre)) && (this.edad == p.edad)) {
			igualdad = true;
		}
		else if ((this.nombre != p.nombre) || (this.edad != p.edad))	{
			igualdad = false;
		}
		return igualdad;
	}
	
	public void mostrar () {
		System.out.print("Su nombre es: ");
		System.out.println(this.nombre);
		System.out.print("Su edad es: ");
		System.out.println(this.edad);
		System.out.print("Su fecha de nacimiento es: ");
		System.out.println(fechanacimiento);
	}
	
	public boolean esMayorDeEdad(){
		boolean esmayor = false;
		
		if (this.edad >= MAYOREDAD) {
			esmayor = true;
		}
		else if (this.edad <= MAYOREDAD) {
			esmayor = false;
		}
		return esmayor;
	}
	
	@Override
	public String toString() {
		String persona = null;
		
		persona = ("Nombre: "+this.nombre+"\n"+"Edad: "+this.edad+"\n"+"Fecha de nacimiento: "+this.fechanacimiento);
		
		return persona;
	}
}
