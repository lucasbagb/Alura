package aula_5.banco;

import aula_1.banco.conta.ValorInvalidoException;
import aula_1.banco.conta.Conta;
import aula_1.banco.conta.ContaCorrente;

public class TestaDeposita {
	public static void main(String[] args) {
		Conta cp = new ContaCorrente();
		try{
			cp.deposita(-100);
		} catch (ValorInvalidoException e){
			System.out.println(e);
		}
	}
}
