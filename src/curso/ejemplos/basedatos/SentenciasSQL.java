package curso.ejemplos.basedatos;

import java.sql.ResultSet;
import java.sql.Statement;

public class SentenciasSQL {
	
	public static final ResultSet consultaSueldo(Statement stmt) throws Exception
	{
		ResultSet rset = stmt.executeQuery("SELECT * FROM HR.employees WHERE HR.employees.salary > 3000 order by salary DESC");
		return rset;
	}
	
}
