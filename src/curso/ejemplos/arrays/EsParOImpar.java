package curso.ejemplos.arrays;

public class EsParOImpar {

	public static void main(String[] args) {
		int numero = 0;
		boolean espar = false;
		
		numero = Integer.parseInt(args[0]); //Metodo estatico de la clase "INTEGER" que convierte "String" a "int"
		numero = numero%2;
		
		if(numero==0) {
			espar = true;
		}
	System.out.println(espar);
	}
}
