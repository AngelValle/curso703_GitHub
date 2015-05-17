package curso.ejemplos.pasodeparametrosporvaloryreferencia;

public class SumarEdadPorParametro {
	
	static Persona persona1 = new Persona("Angel", 18);
	static Persona persona2 = null;
	static int edadasumar = 10;
	
	public static void main(String[] args) {
		
		persona2 = Persona.nuevaPersonaIncrementoEdad(persona1, edadasumar);
		
		System.out.println(persona1);
		System.out.println(persona2);
		
		Persona.mismaPersonaIncrementoEdadStatic(persona1, edadasumar);
		
		System.out.println(persona1);
		
		persona1.mismaPersonaIncrementoEdadNoStatic(edadasumar);
		
		System.out.println(persona1);
		
	}

}
