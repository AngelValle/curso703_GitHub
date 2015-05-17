package curso.ejemplos.arrays;

public class EsMayorDeEdad {

	public static void main(String[] args) {
		int edad = 0;
		int mayoredad = 18;
		edad = Integer.parseInt(args[0]);
		
		if(edad<mayoredad) {
			System.out.println("Eres menor de edad.");
		}
		else {
			System.out.println("Eres mayor de edad.");
		}
		
	}

}
