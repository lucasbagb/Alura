package aula_5;

import java.util.TreeSet;

public class Ordena {
	public static void main(String[] args) {

		TreeSet<Integer> desordena = new TreeSet<Integer>();
		for (int i = 2; i < 1000; i++) {
			desordena.add(i);
		}

		TreeSet<Integer> ordena = (TreeSet<Integer>) desordena.descendingSet();

		System.out.println(ordena);
	}
}