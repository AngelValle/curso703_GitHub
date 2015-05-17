package curso.ejemplos.mostrarnumeromayor;

import curso.ejemplos.mostrarnumeromayor.PedirNumerosEjercicio1;

public class Ejercicio1 {

	public static void main(String[] args) {
		byte numero1 = 0;
		byte numero2 = 0;
		byte numero3 = 0;
		byte numeromayor1 = 0;
		byte numeromayor2 = 0;
		byte numeromayor3 = 0;
		NumeroOrdenados numerosordenados = null;
		
		// PEDIMOS LOS 3 NUMEROS ------------------------
		
		System.out.println("Introducir un numero: ");
		numero1 = PedirNumerosEjercicio1.pedirNumero();
		System.out.println("Introducir un numero: ");
		numero2 = PedirNumerosEjercicio1.pedirNumero();
		System.out.println("Introducir un numero: ");
		numero3 = PedirNumerosEjercicio1.pedirNumero();
		
		// RECOGEMOS LOS 3 NUMEROS y LOS ASIGANMOS DE MAYOR A MENOS------
		
		numeromayor1 = PedirNumerosEjercicio1.numeroMayor1(numero1, numero2, numero3);
		numeromayor2 = PedirNumerosEjercicio1.numeroMayor2(numero1, numero2, numero3);
		numeromayor3 = PedirNumerosEjercicio1.numeroMayor3(numero1, numero2, numero3);
		
		// CREAMOS UN OBJETO "numerosordenados" CON EL METODO CONSTRUCTOR DE LA CLASE "NumeroOrdenados".
		
		numerosordenados = new NumeroOrdenados(numeromayor1, numeromayor2, numeromayor3);
		
		// MOSTRAMOS POR PANTALLA
		
		System.out.println("El numero mayor es: " +numeromayor1);
		System.out.println("El objeto guardado 'numerosordenador' de mayor a menor:");
		numerosordenados.mostrar();
		System.out.println();
		
		if (numerosordenados instanceof NumeroOrdenados) {
			System.out.println("'numerosordenados' SI es una instancia de NumeroOrdenados");
		}
		else {
			System.out.println("'numerosordenados' NO es una instancia de NumeroOrdenados");
		}
		
	}
}
