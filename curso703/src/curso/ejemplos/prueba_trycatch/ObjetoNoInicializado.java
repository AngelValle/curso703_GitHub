package curso.ejemplos.prueba_trycatch;

public class ObjetoNoInicializado extends NullPointerException {

	private static final long serialVersionUID = 1L;

	public ObjetoNoInicializado (String error)
	{
		super(error);
	}
}