package curso.ejemplos.login;

import java.util.Scanner;

public class MetodosLogin {

	
	public static byte pedirNota() {
		byte nota = 0;
		Scanner scnota = new Scanner(System.in);
		nota = scnota.nextByte();
		if((nota!=0)&&(nota!=1)&&(nota!=2)&&(nota!=3)&&(nota!=4)&&(nota!=5)&&(nota!=6)&&(nota!=7)&(nota!=8)&&(nota!=9)&&(nota!=10)){
			System.out.println("Nota no valida.\nPor favor ingrese una nota de '0' a '10'");
			nota = pedirNota();
		}
		return nota;
	}
	public static String pedirPasswd() {
		String passwd = null;
		Scanner scpasswd = new Scanner(System.in);
		passwd = scpasswd.next();
		if(passwd.isEmpty()) {
			System.out.println("La contraseña no puede estar vacia");
			pedirPasswd();
		}
		return passwd;
	}
	public static String pedirName() {
		String name = null;
		Scanner scname = new Scanner(System.in);
		name = scname.next();
		if(name.isEmpty()) {
			System.out.println("El nombre no puede estar vacio");
			pedirName();
		}
		return name;
	}

	public static boolean esPasswdLarga (String passwd) {
		boolean longitud = false;
		
		if(passwd.length() < 8) {
			longitud = false;
		}
		if(passwd.length() >= 8) {
			longitud = true;
		}
	return longitud;
	}
	public static boolean esPasswdBuena(boolean eslargo,boolean esmayuscula,boolean esminuscula,boolean esnumerico) {
		boolean espasswdbuena = false;
		
		if(!(eslargo)||!(esmayuscula)||!(esnumerico)||!(esminuscula)) {
			if (!eslargo) { System.out.println("La contraseña NO CONTIENE 8 CARACTERES");}
			if (!esmayuscula) { System.out.println("La contraseña NO CONTIENE MAYUSCULAS");}
			if (!esminuscula) { System.out.println("La contraseña NO CONTIENE MINUSCULAS");}
			if (!esnumerico) { System.out.println("La contraseña NO CONTIENE NUMEROS");}
			System.out.println("\nPor favor vuelve a ingresarla.");
//			Contrasenia.main(args);
			espasswdbuena = false;
		}
		else if ((eslargo)&&(esmayuscula)&&(esnumerico)&&(esminuscula)) {
			espasswdbuena = true;
		}
		return espasswdbuena;
	}
	
	
// METODOS DE COMPROBACION CON "DO WHILE" 
	public static boolean esNumerico(String passwd) {  
		boolean numerico = false;
		int i=0;
		
		do {
			if (Character.isDigit(passwd.charAt(i))) {
				numerico = true;
			}
			else {
				numerico = false;
			}
		i++;
		}while(numerico==false);
	return numerico;
	}
	
	public static boolean esMayuscula(String passwd) {
		boolean mayuscula = false;
		int i=0;
		
		do {
			if (Character.isUpperCase(passwd.charAt(i))) {
				mayuscula = true;
			}
			else {
				mayuscula = false;
			}
		i++;
		}while(mayuscula==false);
	return mayuscula;
	}
	
	public static boolean esMinuscula(String passwd) {
		boolean minuscula = false;
		int i=0;
		
		do {
			if (Character.isLowerCase(passwd.charAt(i))) {
				minuscula = true;
			}
			else {
				minuscula = false;
			}
		i++;
		}while(minuscula==false);
	return minuscula;
	}


// METODOS DE COMPROBACION CON "FOR" 
	

	
//	public static boolean esNumerico(String passwd) {  
//		int passwdlength = 0;
//		boolean numerico = false;
//		passwdlength = passwd.length();
//		
//			for (int i=0; (i<passwdlength)&&(numerico==false); i++) {
//				if (Character.isDigit(passwd.charAt(i))) {
//					numerico = true;
//				}
//				else {
//					numerico = false;
//				}
//			}
//	return numerico;
//	}
//	
//	public static boolean esMayuscula(String passwd) {
//		int passwdlength = 0;
//		boolean mayuscula = false;
//		passwdlength = passwd.length();
//			for (int i=0; (i<passwdlength)&&(mayuscula==false); i++) {
//				if (Character.isUpperCase(passwd.charAt(i))) {
//					mayuscula = true;
//				}
//				else {
//					mayuscula = false;
//				}
//			}
//	return mayuscula;
//	}
//	
//	public static boolean esMinuscula(String passwd) {
//		int passwdlength = 0;
//		boolean minuscula = false;
//		passwdlength = passwd.length();
//			for (int i=0; (i<passwdlength)&&(minuscula==false); i++) {
//				if (Character.isLowerCase(passwd.charAt(i))) {
//					minuscula = true;
//				}
//				else {
//					minuscula = false;
//				}
//			}
//	return minuscula;
//	}
}