package aula_3.banco;

import aula_1.banco.conta.ContaCorrente;
import aula_1.banco.conta.Tributavel;

public class TestaTributavel {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente();
		cc.deposita(100);
		System.out.println(cc.calculaTributos());

		// testando polimorfismo:
		Tributavel t = cc;
		System.out.println(t.calculaTributos());
	}
}