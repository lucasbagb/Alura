package aula_6;

public class Funcionario {
	public String dept;
	private double salario;
	protected Data dataEntrada = new Data();
	private String rg;

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public double getSalario() {
		return salario;
	}

	public void setDataEntrada(Data dataEntrada) {
		this.dataEntrada = dataEntrada;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public Data getDataEntrada() {
		return dataEntrada;
	}

	public String getRg() {
		return rg;
	}

	public void recebeAumento(double aumento) {
		this.salario += aumento;
	}

	public double calculaGanhoAnual() {
		double ganhoAnual = this.salario * 12;
		return ganhoAnual;
	}

	public void mostra() {
		System.out.println("RG: " + this.rg);
		System.out.println("Departamento: " + this.dept);
		System.out
				.println("Admissão: " + this.dataEntrada.dia + "/" + this.dataEntrada.mes + "/" + this.dataEntrada.ano);
		System.out.println("Salário: " + this.salario);
	}

	public Funcionario(String rg) {
		super();
		this.rg = rg;
	}

}