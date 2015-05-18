package curso.ejemplos.basicos;

public class EqualString {

	public static void main(String[] args) {
		String palabra1 = null;
		String palabra2 = null;
		palabra1 = new String ("A");
		System.out.println("Palabra1: " +palabra1);
		palabra2 = new String ("A");
		System.out.println("Palabra2: " +palabra2);
		
		
		
		if(palabra1 == palabra2) {
			System.out.println("Las dos palabras son iguales.");
		}
		else {
			System.out.println("Las dos palabras son distintas.");
		}
		
		
		if(palabra1.equals(palabra2)) {
			System.out.println("Las dos palabras son iguales.");
		}
		else {
			System.out.println("Las dos palabras son distintas.");
		}
		
		
		
	}

}
