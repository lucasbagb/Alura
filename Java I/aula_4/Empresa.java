package aula_4;

/*
public class Empresa {

	String nome;
	String cnpj;
	
	Funcionario[] funcionario = new Funcionario[1000];
}
*/

/*
public class Empresa {

	String nome;
	String cnpj;

	Funcionario[] funcionario = new Funcionario[1000];

	void adicionar(Funcionario neil) {
		neil = new Funcionario();
		for (int i = 0; i < this.funcionario.length; i++) {
			if (funcionario[i] == null) {
				funcionario[i] = neil;
			}
		}
	}
}
*/

public class Empresa {

	String nome;
	String cnpj;

	Funcionario[] funcionario;

	void adicionar(Funcionario neil) {
		for (int i = 0; i < this.funcionario.length; i++) {
			if (funcionario[i] == null) {
				funcionario[i] = neil;
			}
		}
	}

	void mostraEmpregrados() {
		for (Funcionario f : this.funcionario) {
			f.mostra();
		}
	}

	void mostraTodasAsInformacoes() {
		System.out.println("Empresa: " + this.nome);
		System.out.println("CNPJ: " + this.cnpj);

		for (Funcionario f : this.funcionario) {
			f.mostra();
		}
	}

	boolean contem(Funcionario f) {
		boolean checking = false;

		for (Funcionario fu : this.funcionario) {
			if (fu == f) {
				checking = true;
			}
		}

		return checking;
	}
}