package aula_6;

public class Empresa {

	private String nome;
	private String cnpj;
	private Funcionario[] funcionario;

	public Empresa(int num) {
		this.setFuncionarios(num);
	}

	private void setFuncionarios(int num) {
		this.funcionario = new Funcionario[num];
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	void adicionar(Funcionario neil) {
		for (int i = 0; i < this.funcionario.length; i++) {
			if (funcionario[i] == null) {
				funcionario[i] = neil;
				break;
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