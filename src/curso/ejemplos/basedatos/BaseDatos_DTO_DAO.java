package curso.ejemplos.basedatos;

import java.util.*;

public class BaseDatos_DTO_DAO {
	
	public static void main(String[] args) throws Exception {
		
		List<DTO_Employees> arraylist = new ArrayList<DTO_Employees>(); // Creamos ArrayList
		
		arraylist = DAO_Employees.recuperarTodosDTO();
		
		System.out.println(arraylist);
	}
}