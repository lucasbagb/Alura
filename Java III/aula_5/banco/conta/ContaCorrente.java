package aula_5.banco.conta;

public class ContaCorrente extends Conta implements Tributavel {

	public ContaCorrente(int numero, String titular) {
		this.titular = titular;
		this.numero = numero;
	}

	@Override
	public void atualiza(double taxa) {
		this.saldo += this.saldo * taxa * 2;
	}

	@Override
	public double calculaTributos() {
		return this.getSaldo() * 0.01;
	}

}
