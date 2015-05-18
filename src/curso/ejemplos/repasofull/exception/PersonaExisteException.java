package curso.ejemplos.repasofull.exception;

public class PersonaExisteException extends Exception {

	private static final long serialVersionUID = 1L;
	
	public static final String mensajepersonaexiste= "La persona que intenta introducir ya se encuentra en la base de datos.";
	
	public PersonaExisteException() 
	{
		super(mensajepersonaexiste);
	}
}
