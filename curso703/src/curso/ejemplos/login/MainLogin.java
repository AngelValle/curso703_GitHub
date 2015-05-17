package curso.ejemplos.login;

public class MainLogin {
	
	public static void main(String[] args) {
		String passwd = null;
		String name	= null;
		byte nota = 0;
		Alumno alumno = null;
		
		boolean esminuscula = false;
		boolean esmayuscula = false;
		boolean esnumerico = false;
		boolean eslargo = false;
		boolean espasswdbuena = false;
		
		
		System.out.println("La contraseña debe incluir 8 caracteres, numeros, mayusculas y minusculas.");
		System.out.println();
		System.out.println("Ingresa un nombre de cuenta:");
		name = MetodosLogin.pedirName(); // Pedimos el nombre y lo guardamos en "name".
		System.out.println("Ingresa una contraseña de cuenta:");
		passwd = MetodosLogin.pedirPasswd(); // Pedimos la contraseña y lo guardamos en "passwd".
		
		eslargo		= MetodosLogin.esPasswdLarga(passwd);
		esmayuscula = MetodosLogin.esMayuscula(passwd);
		esminuscula = MetodosLogin.esMinuscula(passwd);
		esnumerico	= MetodosLogin.esNumerico(passwd);
		
		espasswdbuena = MetodosLogin.esPasswdBuena(eslargo, esmayuscula, esminuscula, esnumerico);
		
		if(espasswdbuena) {
			System.out.println("La contraseña cumple con los criterios de seguridad.\nPor favor, ingresa una nota:");
			nota = MetodosLogin.pedirNota();
			alumno = new Alumno(name, passwd, nota);
			System.out.println(alumno);
		}
		else {
			System.out.println("La contraseña introducida no cumple con los criterios de seguridad");
			MainLogin.main(args);
		}
	}
}
