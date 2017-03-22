package aula_2;

/*
class BalancoTrimestral {
	public static void main (String[] args){
		int gastosJaneiro = 15000;
		int gastosFevereiro = 23000;
		int gastosMarco = 17000;
		
		int gastosTrimestre = gastosJaneiro + gastosMarco + gastosFevereiro;
	}
}
*/

class BalancoTrimestral {
	public static void main(String[] args) {
		int gastosJaneiro = 15000;
		int gastosFevereiro = 23000;
		int gastosMarco = 17000;

		int gastosTrimestre = gastosJaneiro + gastosMarco + gastosFevereiro;

		System.out.println("Gastos trimestrais: R$" + gastosTrimestre);

		System.out.println("Valor da média mensal = R$" + gastosTrimestre / 3);
	}
}