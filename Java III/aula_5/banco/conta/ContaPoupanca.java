package aula_5.banco.conta;

public class ContaPoupanca extends Conta implements Comparable<ContaPoupanca> {

	@Override
	public void atualiza(double taxa) {
		this.saldo += this.saldo * taxa * 3;
	}

	@Override
	public void deposita(double valor) {
		this.saldo += valor - 0.10;
	}

	@Override
	public int compareTo(ContaPoupanca outraConta) {
		return this.getNumero() - outraConta.getNumero();
	}
}
