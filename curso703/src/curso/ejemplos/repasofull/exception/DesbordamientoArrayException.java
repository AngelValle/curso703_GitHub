package curso.ejemplos.repasofull.exception;

import curso.ejemplos.repasofull.ListaPersonas;

public class DesbordamientoArrayException extends Exception{

	private static final long serialVersionUID = 1L;
	
	public static final String mensajedesbordamiento= "Numero de personas excecido. Máximo " + ListaPersonas.getCapacidad() + " personas";
	
	public DesbordamientoArrayException() 
	{
		super(mensajedesbordamiento);
	}
}
