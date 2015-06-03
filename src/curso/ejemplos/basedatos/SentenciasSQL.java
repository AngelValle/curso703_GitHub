package curso.ejemplos.basedatos;

import java.sql.ResultSet;
import java.sql.Statement;

public class SentenciasSQL {
	
	public static ResultSet consultaSueldo(Statement stmt) throws Exception
	{
		ResultSet rset = stmt.executeQuery("SELECT * FROM HR.employees WHERE HR.employees.salary > 3000 order by salary DESC");
		return rset;
	}
	
	public static final String CONSULT_EMPLEADOS_SALARY_MAS_3000 = "SELECT * FROM HR.employees WHERE HR.employees.salary > 3000 order by salary DESC";
	
}
