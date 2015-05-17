package curso.ejemplos.basicos;

public class Arrays {

	public static int[] array_de_enteros = new int[10];
	public static int[] array_de_enteros3 = {10, 15, 20};
	
	public static void main(String[] args) {
	
		for(int i=0; i<array_de_enteros3.length;i++) {
			int numero = 0;
			numero = array_de_enteros3[i];
			System.out.println(numero);
		}
	}
}
