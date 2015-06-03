package curso.ejemplos.basedatos;

import java.util.*;

public class BaseDatos_DTO_DAO {
	
	public static void main(String[] args) throws Exception {
		
		List<DTO_Employees> arraylist = DAO_Employees.recuperarTodosDTO(); // Creamos ArrayList		
		System.out.println(arraylist);
	}
}