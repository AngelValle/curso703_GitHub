package curso.ejemplos.mostrarnumeromayor;

public class NumeroOrdenados {
	
	private byte numeromayor1 = 0;
	private byte numeromayor2 = 0;
	private byte numeromayor3 = 0;
	
	
	public NumeroOrdenados(byte numeromayor1, byte numeromayor2, byte numeromayor3) {
		this.numeromayor1 = numeromayor1;
		this.numeromayor2 = numeromayor2;
		this.numeromayor3 = numeromayor3;
	}
	
	public void mostrar() {
		System.out.println("Numero Mayor 1: " +this.numeromayor1);
		System.out.println("Numero Mayor 2: " +this.numeromayor2);
		System.out.println("Numero Mayor 3: " +this.numeromayor3);		
	}
}
