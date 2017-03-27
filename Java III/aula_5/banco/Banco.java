package aula_5.banco;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import aula_5.banco.conta.Conta;
import aula_5.banco.conta.ContaCorrente;
import aula_5.banco.conta.ContaPoupanca;

public class Banco {
	
	List<Conta> contas = new LinkedList<>();
	Conta cc = new ContaCorrente(0, null);
	Conta cp = new ContaPoupanca();
	
	private Map<String, Conta> relacaoContas = new HashMap<>();
		
	void adiciona(Conta c){
		relacaoContas.put(c.getTitular(), c);
		contas.add(c);
	}
	
	public Conta pega(int x){
		Conta conta = contas.get(x);
		return conta;
	}
	
	public int pegaQuantidadeDeContas(){
		return contas.size();
	}
	
	public Conta buscaPorNome(String nome){
		return relacaoContas.get(nome);
	}

}
