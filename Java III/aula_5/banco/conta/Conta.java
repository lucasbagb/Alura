package aula_5.banco.conta;

public abstract class Conta {
	protected double saldo;
	protected int numero;
	protected String titular;

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
	
	public double getSaldo() {
		return saldo;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}


	public abstract void atualiza(double taxaSelic);
	/*
	* { if (taxa >= 0.0){ this.saldo +=
	* this.saldo*taxa; } else {
	* System.out.println("Taxa inserida inválida!"
	* ); } }
	*/
	
	@Override
	public String toString() {
		return "Este objeto é uma conta com saldo R$" + this.saldo;
	}
	
	@Override
	public boolean equals(Object obj) {
		Conta outraConta = (Conta) obj;
		return ((this.numero == outraConta.numero) && (this.titular.equals(outraConta.titular)));
	}

}