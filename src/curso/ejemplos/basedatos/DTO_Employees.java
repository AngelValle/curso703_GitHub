package curso.ejemplos.basedatos;


public class DTO_Employees {
	
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
	
	public DTO_Employees(String EMPLOYEE_ID, String FIRST_NAME, String LAST_NAME, String EMAIL, String PHONE_NUMBER,
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
		cadena = (
				"\n*\n*   Empleado:  nº"+this.EMPLOYEE_ID+"\n*\n"
				+"*  EMPLOYEE_ID: "+this.EMPLOYEE_ID+"\n"
				+"*  FIRST_NAME: "+this.FIRST_NAME+"\n"
				+"*  LAST_NAME: "+this.LAST_NAME+"\n"
				+"*  EMAIL: "+this.EMAIL+"\n"
				+"*  PHONE_NUMBER: "+this.PHONE_NUMBER+"\n"
				+"*  HIRE_DATE: "+this.HIRE_DATE+"\n"
				+"*  JOB_ID: "+this.JOB_ID+"\n"
				+"*  SALARY: "+this.SALARY+"\n"
				+"*  COMMISSION_PCT: "+this.COMMISSION_PCT+"\n"
				+"*  MANAGER_ID: "+this.MANAGER_ID+"\n"
				+"*  DEPARTMENT_ID: "+this.DEPARTMENT_ID+"\n"
				+"*******************************************");
		
		return cadena;
	}
	
	public String getEMPLOYEE_ID() {
		return EMPLOYEE_ID;
	}

	public void setEMPLOYEE_ID(String eMPLOYEE_ID) {
		EMPLOYEE_ID = eMPLOYEE_ID;
	}

	public String getFIRST_NAME() {
		return FIRST_NAME;
	}

	public void setFIRST_NAME(String fIRST_NAME) {
		FIRST_NAME = fIRST_NAME;
	}

	public String getLAST_NAME() {
		return LAST_NAME;
	}

	public void setLAST_NAME(String lAST_NAME) {
		LAST_NAME = lAST_NAME;
	}

	public String getEMAIL() {
		return EMAIL;
	}

	public void setEMAIL(String eMAIL) {
		EMAIL = eMAIL;
	}

	public String getPHONE_NUMBER() {
		return PHONE_NUMBER;
	}

	public void setPHONE_NUMBER(String pHONE_NUMBER) {
		PHONE_NUMBER = pHONE_NUMBER;
	}

	public String getHIRE_DATE() {
		return HIRE_DATE;
	}

	public void setHIRE_DATE(String hIRE_DATE) {
		HIRE_DATE = hIRE_DATE;
	}

	public String getJOB_ID() {
		return JOB_ID;
	}

	public void setJOB_ID(String jOB_ID) {
		JOB_ID = jOB_ID;
	}

	public String getSALARY() {
		return SALARY;
	}

	public void setSALARY(String sALARY) {
		SALARY = sALARY;
	}

	public String getCOMMISSION_PCT() {
		return COMMISSION_PCT;
	}

	public void setCOMMISSION_PCT(String cOMMISSION_PCT) {
		COMMISSION_PCT = cOMMISSION_PCT;
	}

	public String getMANAGER_ID() {
		return MANAGER_ID;
	}

	public void setMANAGER_ID(String mANAGER_ID) {
		MANAGER_ID = mANAGER_ID;
	}

	public String getDEPARTMENT_ID() {
		return DEPARTMENT_ID;
	}

	public void setDEPARTMENT_ID(String dEPARTMENT_ID) {
		DEPARTMENT_ID = dEPARTMENT_ID;
	}
}
