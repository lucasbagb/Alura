package aula_6;

public class ValorInvalidoException extends RuntimeException {
	
	ValorInvalidoException(double valor){
		super("Valor inválido: "+valor);
	}

	private static final long serialVersionUID = -2106899130222556006L;

}
