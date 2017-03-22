package aula_5;

public class Circulo implements AreaCalculavel {
	private double raio;

	@Override
	public double calculaArea() {
		return Math.PI * Math.pow(raio, 2);
	}

	public Circulo(double raio) {
		this.raio = raio;
	}
}
