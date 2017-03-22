package aula_4;

public class AtualizadorDeContas {

	private double saldoTotal = 0;
	private double selic;

	public AtualizadorDeContas(double selic) {
		this.selic = selic;
	}

	public void roda(Conta c) {
		System.out.println("O saldo anterior � de: R$" + c.saldo);
		// this.saldoTotal -= c.saldo;
		c.atualiza(selic);
		System.out.println("O saldo atual � de: R$" + c.saldo);
		this.saldoTotal += c.saldo;
	}

	public double getSaldoTotal() {
		return saldoTotal;
	}
}