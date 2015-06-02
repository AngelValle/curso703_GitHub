package curso.ejemplos.basedatos;


public class Employees {
	
	private String EMPLOYEE_ID;
	private String FIRST_NAME;
	private String LAST_NAME;
	private	String EMAIL;
	private String PHONE_NUMBER;
	private String HIRE_DATE;
	private String JOB_ID;
	private String SALARY;
	private String COMMISSION_PCT;
	private String MANAGER_ID;
	private String DEPARTMENT_ID;
	
	public Employees(String EMPLOYEE_ID, String FIRST_NAME, String LAST_NAME, String EMAIL, String PHONE_NUMBER,
			String HIRE_DATE, String JOB_ID, String SALARY, String COMMISSION_PCT, String MANAGER_ID, String DEPARTMENT_ID)
	{
		this.EMPLOYEE_ID=EMPLOYEE_ID;
		this.FIRST_NAME=FIRST_NAME;
		this.LAST_NAME=LAST_NAME;
		this.EMAIL=EMAIL;
		this.PHONE_NUMBER=PHONE_NUMBER;
		this.HIRE_DATE=HIRE_DATE;
		this.JOB_ID=JOB_ID;
		this.SALARY=SALARY;
		this.COMMISSION_PCT=COMMISSION_PCT;
		this.MANAGER_ID=MANAGER_ID;
		this.DEPARTMENT_ID=DEPARTMENT_ID;
	}
	
	@Override
	public String toString() {
		String cadena = null;
		cadena = ("\nEMPLOYEE_ID: "+this.EMPLOYEE_ID
				+" : "+"FIRST_NAME: "+this.FIRST_NAME
//				+" : "+"LAST_NAME: "+this.LAST_NAME
//				+" : "+"EMAIL: "+this.EMAIL
//				+" : "+"PHONE_NUMBER: "+this.PHONE_NUMBER
//				+" : "+"HIRE_DATE: "+this.HIRE_DATE
//				+" : "+"JOB_ID: "+this.JOB_ID
				+" : "+"SALARY: "+this.SALARY);
//				+" : "+"COMMISSION_PCT: "+this.COMMISSION_PCT
//				+" : "+"MANAGER_ID: "+this.MANAGER_ID
//				+" : "+"DEPARTMENT_ID: "+this.DEPARTMENT_ID);
		
		return cadena;
	}
	
}
