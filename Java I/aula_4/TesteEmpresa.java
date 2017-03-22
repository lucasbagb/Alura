package aula_4;

/*
public class TesteEmpresa {

	public static void main(String[] args) {
		
		Empresa indra = new Empresa();
		
		Funcionario hulius = new Funcionario();
		
		hulius.rg = "123456789";
		hulius.dept = "INDRA";
		hulius.dataEntrada.dia = 23;
		hulius.dataEntrada.mes = 02;
		hulius.dataEntrada.ano = 2017;
		hulius.salario = 1710.80;
		
		Funcionario lucas = new Funcionario();
		lucas.rg = "987654321";
		lucas.dept = "INDRA";
		lucas.dataEntrada.dia = 24;

		lucas.salario = hulius.salario * 2;
		lucas.dataEntrada.mes = 02;
		lucas.dataEntrada.ano = 2017;
		
		indra.funcionario = new Funcionario[2];
		
		indra.adicionar(hulius);
		indra.adicionar(lucas);
		
		System.out.println(hulius+" "+lucas);

	}

}
*/

public class TesteEmpresa {

	public static void main(String[] args) {

		Empresa indra = new Empresa();

		Funcionario hulius = new Funcionario();

		hulius.rg = "123456789";
		hulius.dept = "INDRA";
		hulius.dataEntrada.dia = 23;
		hulius.dataEntrada.mes = 02;
		hulius.dataEntrada.ano = 2017;
		hulius.salario = 1710.80;

		Funcionario lucas = new Funcionario();
		lucas.rg = "987654321";
		lucas.dept = "INDRA";
		lucas.dataEntrada.dia = 24;

		lucas.salario = hulius.salario * 2;
		lucas.dataEntrada.mes = 02;
		lucas.dataEntrada.ano = 2017;

		indra.funcionario = new Funcionario[2];

		indra.adicionar(hulius);
		indra.adicionar(lucas);

		System.out.println(hulius + " " + lucas);

		indra.mostraEmpregrados();

	}

}