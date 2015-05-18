package curso.ejemplos.mostrarnumeromayor;

import java.util.Scanner;

public class PedirNumerosEjercicio1 {
	
	public static byte pedirNumero() {
		byte numero = 0;
		Scanner scnumero = new Scanner(System.in);
		numero = scnumero.nextByte();
		return numero;
	}
	
	public static byte numeroMayor1(byte numero1, byte numero2, byte numero3) {
		byte numeromayor1 = 0;
		
		if((numero1>numero2)&&(numero1>numero3)) {
			numeromayor1 = numero1;
		}
		
		else if((numero2>numero1)&&(numero2>numero3)) {
			numeromayor1 = numero2;
		}
		
		else if((numero3>numero1)&&(numero3>numero2)) {
			numeromayor1 = numero3;
		}
		
		return numeromayor1;
	}
	public static byte numeroMayor2(byte numero1, byte numero2, byte numero3) {
		byte numeromayor2 = 0;
		
		if((numero1>numero2)&&(numero1>numero3)) {
			if(numero2>numero3) {
				numeromayor2 = numero2;
			}
			else {
				numeromayor2 = numero3;
			}
		}
		
		else if((numero2>numero1)&&(numero2>numero3)) {
			if(numero1>numero3) {
				numeromayor2 = numero1;
			}
			else {
				numeromayor2 = numero3;
			}
		}
		
		else if((numero3>numero1)&&(numero3>numero2)) {
			if(numero2>numero1) {
				numeromayor2 = numero2;
			}
			else {
				numeromayor2 = numero1;
			}
		}
		return numeromayor2;
	}
	public static byte numeroMayor3(byte numero1, byte numero2, byte numero3) {
		byte numeromayor3 = 0;
		
		if((numero1>numero2)&&(numero1>numero3)) {
			if(numero2>numero3) {
				numeromayor3 = numero3;
			}
			else {
				numeromayor3 = numero2;
			}
		}
		
		else if((numero2>numero1)&&(numero2>numero3)) {
			if(numero1>numero3) {
				numeromayor3 = numero3;
			}
			else {
				numeromayor3 = numero1;
			}
		}
		
		else if((numero3>numero1)&&(numero3>numero2)) {
			if(numero2>numero1) {
				numeromayor3 = numero1;
			}
			else {
				numeromayor3 = numero2;
			}
		}
		return numeromayor3;
	}	

}
