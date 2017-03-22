package aula_5;

public class TestaContas {
	public static void main(String[] args) {

		Conta c = new ContaCorrente();
		ContaCorrente cc = new ContaCorrente();

		c.deposita(1000);
		cc.deposita(1000);

		c.atualiza(0.01);
		cc.atualiza(0.01);

		System.out.printf("O saldo é: %.2f\n", cc.getSaldo());
		System.out.println(c.getSaldo());

	}
}