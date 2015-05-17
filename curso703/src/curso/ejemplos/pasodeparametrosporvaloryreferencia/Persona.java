package curso.ejemplos.pasodeparametrosporvaloryreferencia;

public class Persona {
	private String passwd = null; // Atributo "EDAD" de la clase "PERSONA".
	private String nombre = null; // Atributo "NOMBRE" de la clase "PERSONA".
	private int edad = 0;
	
	
/* DEFINICIONES DE CONSTRUCTOR */
	public Persona(String nombre, int edad){ // Definimos un "CONSTRUCTOR" nuevo que recoge "nombre" y "edad".
		this.nombre = nombre; // Traduccion: Este.nombre(nombre referente al atributo de la clase "Persona") = nombre(Recogido por el constructor).
//		this.passwd = passwd; // Traduccion: Esta.edad(edad referente al atributo de la clase "Persona") = edad(Recogido por el constructor).
		this.edad = edad;
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
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	/* METODOS DE "Persona" */


	@Override
	public String toString() {
		String persona = null;
		
		persona = ("Nombre: "+this.nombre+"\nContraseña: "+this.passwd+"\nEdad: "+this.edad);
		
		return persona;
	}
	
	
	public void mismaPersonaIncrementoEdadNoStatic(int edad) {
		this.setEdad(this.getEdad()+edad);
	}
	
	public static void mismaPersonaIncrementoEdadStatic(Persona persona,int edad) {
		persona.setEdad(edad+persona.getEdad());
	}
	
	public static Persona nuevaPersonaIncrementoEdad(Persona persona,int edad) {
		
		Persona persona2 = new Persona(persona.getNombre(),edad+persona.getEdad());

		return persona2;
	}

	
}
