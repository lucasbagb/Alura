package aula_6;

public abstract class Conta {
	protected double saldo;

	public double getSaldo() {
		return saldo;
	}

	public void deposita(double valor) {
		if (valor > 0) {
			this.saldo += valor;
		} else
			throw new ValorInvalidoException(valor);
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