package curso.ejemplos.basicos;

public class Prueba {
	
	public int calcula() // Creamos un metodo "calcula".
	{
		return 1+1; // Valores devueltos al metodo calcula de la clase Prueba.
	}
	
	public static void main (String [] argumentos)
	{
		int resultado=0; // Declaramos una variable para mostrar resultado, si no expecificamos un dato se inicializa en "0". (Variable AUXILIAR(Variable utilizada para mostrar datos y no para utilizarla en metodos o/y procesos)(Variable local para el metodo)).
		Prueba prueba = null; // Clase = Prueba , Objeto = prueba , null = espacio de memoria no reservado(vacio). Inicializo "prueba".
		prueba = new Prueba(); // Los parentesis marcan que es un metodo cronstructor.
		
		resultado = prueba.calcula(); // Asignamos los valores "prueba.calcula" a la variable "resultado".
		System.out.println(resultado); // Imprimimos en pantalla la variable "resultado".
	}
	
}

/* Desde una clase estatica creamos un objeto, desde el main asignamos como espacio de memoria "null"
   creamos el objeto "prueba" con la clase "Prueba". Volvemos a llamar a prueba.calcula y lo mostramos en pantalla */

