package curso.ejemplos.prueba_trycatch;

public class ErrorDesbordamientoArray extends ArrayIndexOutOfBoundsException {

	private static final long serialVersionUID = 1L;

	public ErrorDesbordamientoArray (String error)
	{
		super(error);
	}
}
