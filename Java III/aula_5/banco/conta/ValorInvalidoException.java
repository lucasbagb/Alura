package aula_5.banco.conta;

public class ValorInvalidoException extends RuntimeException {
	
	public ValorInvalidoException(double valor){
		super("Valor inv�lido: "+valor);
	}

	private static final long serialVersionUID = -2106899130222556006L;

}
