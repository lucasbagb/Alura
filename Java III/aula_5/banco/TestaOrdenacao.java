package aula_5.banco;

import java.util.ArrayList;
import java.util.Collections;

import aula_5.banco.conta.ContaPoupanca;

public class TestaOrdenacao {
	public static void main(String[] args) {
		ArrayList<ContaPoupanca> cp = new ArrayList<ContaPoupanca>();

		ContaPoupanca a = new ContaPoupanca();
		ContaPoupanca b = new ContaPoupanca();
		ContaPoupanca c = new ContaPoupanca();
		ContaPoupanca d = new ContaPoupanca();
		ContaPoupanca e = new ContaPoupanca();
		ContaPoupanca f = new ContaPoupanca();

		cp.add(a);
		cp.add(b);
		cp.add(c);
		cp.add(d);
		cp.add(e);
		cp.add(f);
		
		a.setNumero(1);
		b.setNumero(2);
		c.setNumero(123);
		d.setNumero(124);
		e.setNumero(125);
		f.setNumero(126);

		Collections.sort(cp);
		
		for (ContaPoupanca p : cp){
			System.out.println(p.getNumero());
		}
	}
}
