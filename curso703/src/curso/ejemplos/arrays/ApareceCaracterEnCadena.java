package curso.ejemplos.arrays;

public class ApareceCaracterEnCadena {

	public static void main(String[] args) {
		
		boolean b_estaelcaracter = false;
		int contador = 0;
		String cadena = null;
		char caracter = 0;
		cadena = args[0];
		int longitud = cadena.length();
		caracter = args[1].charAt(0);
		
		do {
			if((cadena.charAt(contador)==caracter)) {
				b_estaelcaracter=true;
			}
			contador++;
		}while((b_estaelcaracter==false)||(contador==longitud));
		
		if(b_estaelcaracter==true) {
			System.out.println(b_estaelcaracter);
		}
		else {
			System.out.println(b_estaelcaracter);
		}
	}
}