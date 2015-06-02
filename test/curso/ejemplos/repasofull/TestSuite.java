package curso.ejemplos.repasofull;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class) //LE DIGO A JUNIT QUE ESTO ES UNA SUITE

@Suite.SuiteClasses(  //LE INDICO LAS CLASES TEST A EJECUTAR
		{
			TestListaPersonas.class,
			TestPersona.class,
		}
)

public class TestSuite {
}

