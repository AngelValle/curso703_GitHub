package curso.ejemplos.repasofull;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import curso.ejemplos.repasofull.exception.DesbordamientoArrayException;
import curso.ejemplos.repasofull.exception.PersonaExisteException;

public class TestListaPersonas {
	
	public static ListaPersonas lp;
	public static Persona p;
	public static Persona[] array_persona = new Persona[10];
	
	
	@Before
	public void iniciarClase() throws PersonaExisteException, DesbordamientoArrayException 
	{
		lp = new ListaPersonas();
		p = new Persona("Angel",22);
		lp.insertarPersona(p);
	}
	
	@After
	public void finCLase()
	{
		lp = null;
		p = null;
	}
	
	@Test
	public void testListaPersonas() 
	{
		assertNotNull(new ListaPersonas());
	}

	@Test
	public void testGetListaPersonas()
	{
		assertTrue(lp.getListaPersonas().getClass()==array_persona.getClass());
	}

	@Test
	public void testBuscarPersonaString()
	{
		assertTrue(lp.buscarPersona("Angel").equals(p));
	}

	@Test
	public void testBuscarPersonaInt()
	{
		assertTrue(lp.buscarPersona(22).equals(p));
	}

//	@Test
//	public void testSerializar() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testDeserializar() {
//		fail("Not yet implemented");
//	}
//
	@Test
	public void testInsertarPersona() throws PersonaExisteException, DesbordamientoArrayException 
	{
		lp.insertarPersona(new Persona("Luis",23));
		assertTrue(lp.numeroPersonas()==2);
	}

	@Test
	public void testNumeroPersonas() 
	{
		assertTrue(lp.numeroPersonas()==1);
	}

	@Test
	public void testEstaLlena() throws PersonaExisteException, DesbordamientoArrayException {
		lp.insertarPersona(new Persona("Luis2",23));
		lp.insertarPersona(new Persona("Luis3",23));
		lp.insertarPersona(new Persona("Luis4",23));
		lp.insertarPersona(new Persona("Luis5",23));
		lp.insertarPersona(new Persona("Luis6",23));
		lp.insertarPersona(new Persona("Luis7",23));
		lp.insertarPersona(new Persona("Luis8",23));
		lp.insertarPersona(new Persona("Luis9",23));
		lp.insertarPersona(new Persona("Luis10",23));
		assertTrue(lp.estaLlena()==true);
	}

	@Test
	public void testEliminarPersona() {
		lp.eliminarPersona("Angel");
		assertTrue(lp.numeroPersonas()==0);
	}

	@Test
	public void testLimpiar() throws PersonaExisteException, DesbordamientoArrayException {
		lp.insertarPersona(new Persona("Luis2",23));
		lp.insertarPersona(new Persona("Luis3",23));
		lp.insertarPersona(new Persona("Luis4",23));
		lp.limpiar();
		assertTrue(lp.numeroPersonas()==0);
	}

}
