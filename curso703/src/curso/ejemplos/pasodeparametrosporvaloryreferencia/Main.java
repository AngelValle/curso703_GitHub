package curso.ejemplos.pasodeparametrosporvaloryreferencia;

public class Main {
	
	static int [] array_de_numeros1 = {3,5,8};
	static int incremental = 2;
	
	public static void incrementar(int[] array, int incremental) {

		for(int i=0;i<array.length;i++) {
			array[i] = array[i]+incremental; 
		}
	}

	public static void main(String[] args) {
		incrementar(array_de_numeros1, incremental);
		
		System.out.println("Array final:");
		
		for(int i=0;i<array_de_numeros1.length;i++) {
			System.out.println(array_de_numeros1[i]);
		}
	}

}
