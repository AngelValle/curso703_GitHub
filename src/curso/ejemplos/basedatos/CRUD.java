package curso.ejemplos.basedatos;


public interface CRUD {
	
	 public abstract void create (DTO_Employees ObjectDTO) throws Exception;
	 public abstract DTO_Employees read (String Condicion) throws Exception;
	 public abstract void update (DTO_Employees ObjectDTO) throws Exception;
	 public abstract void delete (String Condicion) throws Exception;
	 public String getNombreDAO ();
	
}
