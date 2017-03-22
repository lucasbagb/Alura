package aula_3;

public class TesteFuncionario {

	public static void main(String[] args) {
		Funcionario julio = new Funcionario();

		julio.rg = "123456789";
		julio.dept = "INDRA";
		julio.dataEntrada.dia = 23;
		julio.dataEntrada.mes = 02;
		julio.dataEntrada.ano = 2017;
		julio.salario = 1710.80;
		julio.recebeAumento(1.99);

		// julio.mostra();
		// System.out.println("O sálario anual de Julio é de:
		// R$"+julio.calculaGanhoAnual());

		Funcionario lucas = new Funcionario();
		lucas.rg = "987654321";
		lucas.dept = "INDRA";
		lucas.dataEntrada.dia = 24;

		lucas.salario = julio.salario * 2;
		lucas.dataEntrada.mes = 02;
		lucas.dataEntrada.ano = 2017;

		Funcionario rulius = julio;

		if (rulius == julio) {
			System.out.println("iguais");
		} else {
			System.out.println("diferentes");
		}

	}

}