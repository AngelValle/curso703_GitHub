package curso.ejemplos.prueba_trycatch;

import java.io.Serializable;


public class Persona implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String passwd = null; // Atributo "EDAD" de la clase "PERSONA".
	private String nombre = null; // Atributo "NOMBRE" de la clase "PERSONA".
	
	
/* DEFINICIONES DE CONSTRUCTOR */
	public Persona(String nombre, String passwd){ // Definimos un "CONSTRUCTOR" nuevo que recoge "nombre" y "edad".
		this.nombre = nombre; // Traduccion: Este.nombre(nombre referente al atributo de la clase "Persona") = nombre(Recogido por el constructor).
		this.passwd = passwd; // Traduccion: Esta.edad(edad referente al atributo de la clase "Persona") = edad(Recogido por el constructor).
	}
	
	public Persona(){} // Redefinimos el metodo "CONSTRUCTOR ESTANDAR", hace falta si queremos llamarlo sin metodos al haber definido uno nuevo.
	
/* FIN DEFINICIONES DE CONSTRUCTOR */
	
/* METODOS GET Y SET */

	public String getPasswd() {
		return this.passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/* METODOS DE "Persona" */
	
	public void mostrar () {
		System.out.print("Su nombre es: ");
		System.out.println(this.nombre);
		System.out.print("Su password es: ");
		System.out.println("****************");
	}

	@Override
	public String toString() {
		String persona = null;
		
		persona = ("Nombre: "+this.nombre+"\n"+"Contraseña: "+this.passwd);
		
		return persona;
	}
}
