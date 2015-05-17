package curso.ejemplos.arrays;

public class MostrarPalabraMasLarga {
	
	public static void main(String[] args) {
		String straux = null;
		int lengthaux = 0;
		int posicionaux = 0;
		
		
		straux = args[0];
		lengthaux = straux.length();
		posicionaux = 0;
		
		for(int i=0; i<args.length;i++) {
			if(args[i].length()>lengthaux) {
				straux = args[i];
				lengthaux = straux.length();
				posicionaux = i;
			}
		}
	System.out.println("Palabra mas grande: "+straux);
	System.out.println("Caracteres de la palabra: "+lengthaux);
	System.out.println("La posicion de la palabra es: "+posicionaux);
	}
}
