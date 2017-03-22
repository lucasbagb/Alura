package aula_3.banco.sistema;

import aula_1.banco.conta.Conta;

public class AtualizadorDeContas {

	private double saldoTotal = 0;
	private double selic;

	public AtualizadorDeContas(double selic) {
		this.selic = selic;
	}

	public void roda(Conta c) {
		System.out.println("O saldo anterior � de: R$" + c.getSaldo());
		// this.saldoTotal -= c.saldo;
		c.atualiza(selic);
		System.out.println("O saldo atual � de: R$" + c.getSaldo());
		this.saldoTotal += c.getSaldo();
	}

	public double getSaldoTotal() {
		return saldoTotal;
	}
}