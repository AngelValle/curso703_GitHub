package curso.ejemplos.arrays;

public class NotaEquivalente {

	static enum listanotas {SOBRESALIENTE,NOTABLE,BIEN,SUFICIENTE,INSUFICIENTE,NOTA_NO_VALIDA};
	static listanotas notacualificativa;
	
	public static void main(String[] args) {
		int nota = 0;
		
		nota = Integer.parseInt(args[0]);
		
		
		switch (nota) {
		case 10: notacualificativa = listanotas.SOBRESALIENTE;
			break;
		case 9: notacualificativa = listanotas.NOTABLE;
			break;
		case 8:
		case 7: notacualificativa = listanotas.BIEN;
			break;
		case 6:
		case 5: notacualificativa = listanotas.SUFICIENTE;
			break;
		case 4:
		case 3:
		case 2:
		case 1:
		case 0: notacualificativa = listanotas.INSUFICIENTE;
			break;
			
		default: notacualificativa = listanotas.NOTA_NO_VALIDA;
			break;
		}
	System.out.println(notacualificativa);
	}

}
