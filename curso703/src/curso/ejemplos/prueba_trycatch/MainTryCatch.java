package curso.ejemplos.prueba_trycatch;

public class MainTryCatch {
	
	private static Persona[] array_de_persona = new Persona[4];
	private static Persona persona1 = new Persona(); 
	private static Persona persona2;
	
	public static void main(String[] args) throws ErrorDesbordamientoArray, ObjetoNoInicializado {
		try
		{
			System.out.println(persona2.getNombre());
			array_de_persona[0] = persona1;
			array_de_persona[1] = persona1;
			array_de_persona[2] = persona1;
			array_de_persona[3] = persona1;
			array_de_persona[4] = persona1;
		}
		catch(ArrayIndexOutOfBoundsException objectexception)
		{
			throw new ErrorDesbordamientoArray ("Error de desbordamiento en Array. Se ha superado el limite de bloques en Array.");
		}
		catch(NullPointerException objectexception)
		{
			throw new ObjetoNoInicializado ("Error de inicializacion, no se puede acceder al bloque de memoria.");
		}
	}
}
