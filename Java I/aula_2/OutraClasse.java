package aula_2;

/*
class outraClasse {
	public static void main (String[] args){
		for (int i = 150; i < 300; i++){
			System.out.println(i);
		}
	}
} 
*/

/*
class outraClasse {
	public static void main (String[] args){
		int soma = 0;
		for (int i = 1; i <= 1000; i++){
			soma += i;
		}
		System.out.println(soma);
	}
}
*/

/*
class outraClasse {
	public static void main (String[] args){
		for (int i = 1; i < 100; i++){
			if ((i % 3) == 0){
				System.out.println(i);
			}
		}
	}
}
*/

/*
public class outraClasse {
	public static void main (String[] args){
		double somaFatoriais = 1;
		for(int fatoriais = 1; fatoriais <= 10; fatoriais++){

			for(int decremento = fatoriais - 1; decremento >= 1; decremento--){
				somaFatoriais *= decremento;
			}
		System.out.println("O valor do fatorial de "+fatoriais+"! é igual a "+somaFatoriais*fatoriais);
		}
	}
}
*/

/*
public class OutraClasse {
	public static void main (String[] args){
		Double somaFatoriais = (double) 1;
		for(int fatoriais = 1; fatoriais <= 10000000; fatoriais++){
			somaFatoriais *= fatoriais;
			System.out.println("O valor do fatorial de "+fatoriais+"! é igual a "+somaFatoriais);
		}
	}
}
*/

public class OutraClasse {
	public static void main(String[] args) {
		int x = 13;

		while (x != 1) {
			if (x % 2 == 0) {

				x = x / 2;
				System.out.print(x + " >");

			} else {

				x = (3 * x) + 1;
				System.out.print(" " + x);

			}
		}
	}
}