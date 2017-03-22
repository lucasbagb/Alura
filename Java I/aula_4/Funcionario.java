package aula_4;

public class Funcionario {
	String dept;
	double salario;
	Data dataEntrada = new Data();
	String rg;

	public void recebeAumento(double aumento) {
		this.salario += aumento;
	}

	public double calculaGanhoAnual() {
		double ganhoAnual = this.salario * 12;
		return ganhoAnual;
	}

	public void mostra() {
		System.out.println(this.dept);
		System.out.println(this.salario);
		System.out.println(this.dataEntrada.dia + "/" + this.dataEntrada.mes + "/" + this.dataEntrada.ano);
		System.out.println(this.rg);
	}
}
