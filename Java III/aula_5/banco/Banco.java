package aula_5.banco;

import java.util.LinkedList;
import java.util.List;

import aula_1.banco.conta.Conta;
import aula_1.banco.conta.ContaCorrente;
import aula_1.banco.conta.ContaPoupanca;

public class Banco {
	
	List<Conta> contas = new LinkedList<>();
	Conta cc = new ContaCorrente();
	Conta cp = new ContaPoupanca();
	
	//void adiciona(Conta c)
	//método Conta pega(int x) e outro int pegaQuantidadeDeContas()
	
	void adiciona(Conta c){
		contas.add(c);
	}
	
	public Conta pega(int x){
		Conta conta = contas.get(x);
		return conta;
	}
	
	public int pegaQuantidadeDeContas(){
		return contas.size();
	}

}
