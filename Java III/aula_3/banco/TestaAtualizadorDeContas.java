package aula_3.banco;

import aula_1.banco.conta.Conta;
import aula_1.banco.conta.ContaCorrente;
import aula_1.banco.conta.ContaPoupanca;
import aula_1.banco.sistema.AtualizadorDeContas;

public class TestaAtualizadorDeContas {

	public static void main(String[] args) {
		Conta c = new ContaCorrente();
		Conta cc = new ContaCorrente();
		Conta cp = new ContaPoupanca();

		c.deposita(1000);
		cc.deposita(1000);
		cp.deposita(1000);

		AtualizadorDeContas adc = new AtualizadorDeContas(0.01);

		adc.roda(c);
		adc.roda(cc);
		adc.roda(cp);

		System.out.println("Saldo Total: " + adc.getSaldoTotal());
	}

}
