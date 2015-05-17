package curso.ejemplos.arrays;

public class ContarCaracterEnCadena {

	
	public static void main(String[] args) {
		int contador = 0;
		
		for(int i=0; i<args.length-1;i++) {
			
			for(int i2=0; i2<args[i].length();i2++) {
				
				char caracter = args[args.length-1].charAt(0);
				if(args[i].charAt(i2)==caracter) {
					contador++;
				}
			}
		}
	System.out.println(contador);
	}
}