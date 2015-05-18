package curso.ejemplos.repasofull.exception;

import java.io.FileNotFoundException;

public class FicheroException extends FileNotFoundException {
	
	private static final long serialVersionUID = 1L;
	public static final String mensajepersonaexiste = "El archivo que intenta abrir ha originado un fallo(No existe o corrupto).";
	
	public FicheroException()
	{
		super(mensajepersonaexiste);
	}
}
