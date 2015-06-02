package curso.ejemplos.matches;

import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.junit.internal.matchers.TypeSafeMatcher;

import curso.ejemplos.repasofull.*;

public class EsMayorDeEdad extends TypeSafeMatcher<Persona> {
	
	int edad = 0;
	String esmayordedad = null;
	
	@Override
	public void describeTo(Description descripcion) //En este método, describo el resultado esperado de la comprobación
	{
		descripcion.appendText("Resultato esperado: Objeto tiene +=18 |SI| : -18 |NO|\n");
		descripcion.appendText("Obtenido alumno: " + edad + "\n¿Es mayor de edad? " + esmayordedad);
	}

	protected void describeMismatchSafely(Persona persona, Description mismatchDescription) 
	{
		mismatchDescription.appendText( persona.getNombre() +" tiene " + persona.getEdad() +" ");
	}
	
	
	@Override
	public boolean matchesSafely(Persona persona) //En este otro método, describo el resultado en caso de que la comprobación de falso
	{
		boolean b_esmayor = false;
		//NOTA: ESTE ALUMNO, ES EL PRIMER PARÁMETRO DE LA LLAMADA
		//Assert.assertThat(alumno, (new EsAlumnoSobresaliente()));
		//Y DEL QUE VAMOS A COMPROBAR SU ESTADO
		
		edad = persona.getEdad();
		if (edad >= 18)
		{
			b_esmayor = true;
		}
		else
		{
			b_esmayor = false;
		}
		
		return b_esmayor;
	}
	
	//@Factory
	public static Matcher<Persona> alumnoMayorDeEdad ()
	{
		return new EsMayorDeEdad();
	}

}
