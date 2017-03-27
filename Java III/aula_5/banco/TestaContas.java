package aula_5.banco;

import aula_5.banco.conta.Conta;
import aula_5.banco.conta.ContaCorrente;

public class TestaContas {
	public static void main(String[] args) {

		Conta c = new ContaCorrente(0, null);
		ContaCorrente cc = new ContaCorrente(0, null);
		
		c.deposita(1000);
		cc.deposita(1000);

		c.atualiza(0.01);
		cc.atualiza(0.01);

		System.out.printf("O saldo é: %.2f\n", cc.getSaldo());
		System.out.println(c.getSaldo());

	}
}