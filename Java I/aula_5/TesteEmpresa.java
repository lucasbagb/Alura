package aula_5;

public class TesteEmpresa {

	public static void main(String[] args) {

		Empresa indra = new Empresa();

		Funcionario hulius = new Funcionario();
		hulius.setRg("123456789");
		hulius.dept = "INDRA";
		hulius.dataEntrada.dia = 23;
		hulius.dataEntrada.mes = 02;
		hulius.dataEntrada.ano = 2017;
		hulius.setSalario(1710.80);

		Funcionario lucas = new Funcionario();
		lucas.setRg("987654321");
		lucas.dept = "INDRA";
		lucas.dataEntrada.dia = 24;
		lucas.dataEntrada.mes = 02;
		lucas.dataEntrada.ano = 2017;
		lucas.setSalario(28000);

		indra.funcionario = new Funcionario[2];

		indra.adicionar(hulius);
		indra.adicionar(lucas);

		indra.mostraEmpregrados();

		System.out.println(indra.contem(hulius) + "");
	}

}