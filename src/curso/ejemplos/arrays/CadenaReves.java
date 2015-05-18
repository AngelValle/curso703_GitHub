package curso.ejemplos.arrays;

public class CadenaReves {
	
	static String cadenarecibida = null;
	static String cadenadevuelta = null;
	
	public static void main(String[] args) {
		cadenarecibida = args[0];
		cadenadevuelta = "";
		
		for(int i=cadenarecibida.length()-1;i<=cadenarecibida.length()&&(i!=-1);i--) {
			cadenadevuelta = cadenadevuelta+cadenarecibida.charAt(i);
		}
		System.out.println(cadenadevuelta);
	}

}
