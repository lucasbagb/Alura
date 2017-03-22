package aula_5;

public abstract class Conta {
	protected double saldo;

	public double getSaldo() {
		return saldo;
	}

	public void deposita(double valor) {
		this.saldo += valor;
	}

	public void saca(double valor) {
		if (valor <= this.saldo) {
			this.saldo -= valor;
		} else {
			System.out.println("Valor de saque inválido!");
		}
	}

	public abstract void atualiza(
			double taxaSelic);/*
								 * { if (taxa >= 0.0){ this.saldo +=
								 * this.saldo*taxa; } else {
								 * System.out.println("Taxa inserida inválida!"
								 * ); } }
								 */

}