package aula_5;

public class Teste {
	public static void main(String[] args) {
		AreaCalculavel a = new Retangulo(3, 2);
		System.out.println(a.calculaArea());

		AreaCalculavel b = new Circulo(5);
		System.out.println(b.calculaArea());
	}
}
