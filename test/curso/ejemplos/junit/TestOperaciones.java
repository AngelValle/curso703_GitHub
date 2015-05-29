package curso.ejemplos.junit;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestOperaciones {
	
	public static Operaciones tester;
	
	@BeforeClass
	public static void iniciaClase()
	{
		tester = new Operaciones();
	}
	
	@AfterClass
	public static void terminaClase()
	{
		tester = null;
		Runtime runtime = Runtime.getRuntime(); // Objeto RUNTIME 
		runtime.gc();
	}

	@Test
	public void testSuma() 
	{
		assertEquals("5 MAS 3 = 8",8,tester.suma(5, 3));
	}

	@Test
	public void testMultiplicacion() 
	{
		assertEquals("2 POR 4 = 8",8,tester.multiplicacion(2, 4));
	}

	@Test
	public void testDivision() 
	{
		assertEquals("10 ENTRE 2 = 5",5,tester.division(10, 2));
	}

	@Test
	public void testResta() 
	{
		assertEquals("10 MENOS 4 = 6",6,tester.resta(10, 4));
	}
	

}
