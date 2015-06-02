package curso.ejemplos.repasofull;

import static org.junit.Assert.*;

import org.hamcrest.core.*;
import org.junit.Before;
import org.junit.Test;

import curso.ejemplos.matches.EsMayorDeEdad;


public class TestPersona {
	
	public static Persona p1;
	public static Persona p2;
	public static Persona p3;
	public static Persona p4;
	
	@Before
	public void iniciarClase() 
	{
		p1 = new Persona("Angel",18);
		p2 = new Persona("Angel",23);
		p4 = new Persona("Angel",23);
	}

	
	
	@Test
	public void testPersona() 
	{
		assertNotNull(new Persona("Angel",8));
	}
	@Test
	public void testPersonaAssertThat() 
	{
		assertThat(p1, IsNull.notNullValue());
	}
	

	@Test
	public void testEqualsObject() 
	{
		assertFalse(p1.equals(p2));
	}
	@Test
	public void testEqualsObjectAssertThat() 
	{
		assertThat(p2, IsEqual.equalTo(p4));
	}
	
	
	@Test
	public void testCompareToAssertThat()
	{
		assertThat(p1.compareTo(p2), Is.is(p1.compareTo(p2)));
	}
	
	
	
	@Test
	public void testEsMayorDeEdadAssertThat()
	{
		assertThat(p1, Is.is(EsMayorDeEdad.alumnoMayorDeEdad()));
	}

}
