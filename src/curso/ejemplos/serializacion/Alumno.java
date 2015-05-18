package curso.ejemplos.serializacion;

import java.io.Serializable;

public class Alumno extends Persona implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int nota = 0;
	private tiponotas nombrenota = null;
	private enum tiponotas {SUSPENSO, SUFICIENTE, BIEN, NOTABLE, SOBRESALIENTE, NOTA_VALIDA_NO_ASIGNADA};
	
	public Alumno(String nombre, String passwd, int nota) {
		super (nombre, passwd);
		this.nota = nota;
		this.nombrenota = resolverNota();
		this.setNombre(resolverNombre());
	}
	public Alumno() {}
	
	@Override
	public String toString() {
		String cadena = null;
		cadena = ("Nombre: "+this.getNombre()+"\nContraseña: "+this.getPasswd()+"\nNota: "+this.nota+"\nNombre Nota: "+nombrenota);
		
		return cadena;
	}
	
	public String resolverNombre() {
		String nombreentrada = this.getNombre();
		String nombrefinal = null;
		String nombreminuscula = null;
		String primeraletra = null;
		
		primeraletra = nombreentrada.charAt(0)+"";
		primeraletra = primeraletra.toUpperCase();
		
		nombreminuscula = nombreentrada.toLowerCase();
		
		nombrefinal = primeraletra;
		
		for(int i=1;i<nombreentrada.length();i++) {
			nombrefinal = (nombrefinal+nombreminuscula.charAt(i));
		}		
		return nombrefinal;
	}
	
	private tiponotas resolverNota() {
		tiponotas nombrenota = null;
		switch (this.nota) {
		case 0:
		case 1:
		case 2:
		case 3:
		case 4: nombrenota = tiponotas.SUSPENSO;
			break;
		case 5: nombrenota = tiponotas.SUFICIENTE;
			break;
		case 6: 
		case 7: nombrenota = tiponotas.BIEN;
			break;
		case 8: nombrenota = tiponotas.NOTABLE;
			break;
		case 9:
		case 10: nombrenota = tiponotas.SOBRESALIENTE;
			break;
		default: nombrenota = tiponotas.NOTA_VALIDA_NO_ASIGNADA;
			break;
		}
		return nombrenota;
	}
	
	
	// METODOS GET Y SET.

	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}

	public tiponotas getNombrenota() {
		return nombrenota;
	}

	public void setNombrenota(tiponotas nombrenota) {
		this.nombrenota = nombrenota;
	}

	
	
	
}
