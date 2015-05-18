package curso.ejemplos.basicos;
import java.util.Scanner; // Importamos la clase java.util para usar el metodo "Scanner".

public class QueHace {

	int a;	// por estar declarada aquí, fuera de cualquier método; a es un
			// atributo de la clase. Por lo tanto, es accesible y visible desde
			// todos los métodos de la clase
	static int b = 50; // Creamos un atributo dentro de la clase.

	public QueHace(int valor)	{ // Constructor redefinido con 1 parametro.
		a = valor;
	}
	
	public QueHace() { // Constructor estandar se vuelve a definir al tener un constructor especial.
		
	}
	
	void metodo() { // VOID expecifica que no nos devuelve nada.
		System.out.println(a); // Pintamos en pantalla el atributo "a".
		a++; // a++ = a= a+1.
	}

	public static void main(String args[]) {
		QueHace qh1 = null; // Creamos un objeto "qh1" de la clase "QueHace".
		QueHace qh2 = null; // Creamos un objeto "qh2" de la clase "QueHace".
		QueHace qh7 = null;
				
		String nombre; // Declaramos una variable "String" llamada "nombre"
		Scanner sc = new Scanner(System.in); // Creamos el objeto apartir de la clase y lo inicializamos como un tipo "Scanner".
		nombre = sc.next(); // Copiamos los valores del objeto introducidos y los copiamos en "nombre".
		
		qh1 = new QueHace(); // Damos formato a "qh1" y inicializamos el objeto.
		qh2 = new QueHace(); // Damos formato a "qh2" y inicializamos el objeto.
		qh7 = new QueHace(8);
		
		qh1.metodo(); // Escribe "qh1.a" 0 y suma 1 a la variable "qh1.a".
		qh1.metodo(); // Escribe "qh1.a" 1 y suma 1 a la variable "qh1.a".
		qh1.a = 33; // Establecemos el valor de "qh1.a" en "33".
		qh1.metodo(); // Escribe "qh1.a" 33 y suma 1 a la variable "qh1.a".
		System.out.println(qh1.a); // Escribimos la variable "qh1.a" "34".

		System.out.println(QueHace.b); // Escribimos la variable "QueHace.b" "50".
		// System.out.println(qh2.b); //Escribimos la variable "qh2.b" "50".

		QueHace.b++; // Sumamos 1 al atributo estatico "b" dentro de la clase "QueHace".
		// qh2.b++; // Sumamos 1 al atributo estatico "b" dentro de la clase "QueHace" atraves de su objeto hijo.

		System.out.println(QueHace.b); // Escribemos la variable "QueHace.b" "51".
		// System.out.println(qh1.b); // Escribemos la variable "qh1.b" "51".

		qh2.a = 60; // Establecemos "qh2.a" a "60".
		qh2.metodo(); // Escribimos "qh2.a" "60" y sumamos 1 a la variable "qh2.a" "61".
		System.out.println(qh2.a); // Escribimos el atributo "qh2.a".
		System.out.println(QueHace.b); // Escribimos el atributo "QueHace.b". Atributo "b" dentro de la clase "QueHace".
		System.out.println(nombre); // Imprimimos en pantalla la variable "nombre".
		System.out.println(qh7.a);
	}
}
