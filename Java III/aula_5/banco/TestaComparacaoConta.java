package aula_5.banco;

import aula_3.banco.conta.Conta;
import aula_3.banco.conta.ContaCorrente;

public class TestaComparacaoConta {

	public static void main(String[] args) {
		Conta c = new ContaCorrente();
		Conta cc = new ContaCorrente();
		
		c.setNumero(123);
		cc.setNumero(123);
		
		c.setTitular("julin");
		cc.setTitular("luquin");
		
		System.out.println(c == cc);
		System.out.println(c.equals(cc));

	}

}
