package curso.ejemplos.basicos;

public class MainPersona {
	
	public static void main(String[] args) { // Metodo main donde inicia el programa.
		
		/* CREAMOS EL OBJETO PERSONA */
		
		String	nombre	= null; // Definimos una variable String llamada "nombre" y la asiganos al valor de memoria "null".
		byte	edad 	= 0; // Definimos una variable byte llamada "edad" y la asiganos al valor de memoria "0".
		byte 	numeropersonas = 0;
		numeropersonas = PedirDatosPersona.numeroPersonas();
		
		for (int contador=0;contador < numeropersonas; contador++){
			Persona p 	= null; // Creamos un objeto "p" de la clase "Persona" y le asignamos el valor de memoria "null".
			Persona p2 	= null;
//			boolean igualdadobjetos = false;
			
			nombre	= PedirDatosPersona.pedirNombre(); // nombre = String devuelta por el metodo "pedirNombre()".
			edad 	= PedirDatosPersona.pedirEdad(); // edad = byte devuelto por el metodo "pedirEdad()".
			p 	= new Persona(nombre, edad); // Usamos nuestro constructor reeditadon con 2 atributos de entrada. nombre = nombre devuelto por "pedirNombre()". edad = edad devuelta por "pedirEdad()".
			p2 	= new Persona(); 
			p2.nombre 	= "angel";
			p2.edad		= 22;
			
//			p.mostrar();
			
//			igualdadobjetos = p.equals(p2);
			
//			if(igualdadobjetos == false){
//				System.out.println("Los objetos no son iguales.");
//			}
//			else if (igualdadobjetos == true) {
//				System.out.println("Los objetos si son iguales.");
//			}

			
//			/* Forma 1 de recoger booleano */
//			if(p.esMayorDeEdad())
//			{
//				System.out.println("Es mayor de edad. (MSJ Enviado desde Main(Metodo1))");
//			}
//			else {
//				System.out.println("Es menor de edad. (MSJ Enviado desde Main(Metodo1))");
//			}
			
			System.out.println(p);
			
			/* Forma 2 de recoger booleano */
//			boolean esmayor = false;
//			esmayor = p.esMayorDeEdad();
//			if(esmayor == true){
//				System.out.println("Es mayor de edad. (MSJ Enviado desde Main(Metodo2))");
//			}
//			else {
//				System.out.println("Es menor de edad. (MSJ Enviado desde Main(Metodo2))");
//			}	
		}
	}
}