package aula_3;

public class Stringed {
	public static void main(String[] args) {
		
		// String aIndraNao = "Alura";
		// for (int i = 0; i < aIndraNao.length(); i++){
		// System.out.println(aIndraNao.charAt(i));
		// }

//		String a = "anotaram a data da maratona";
		String b = "Socorram-me, subi no ônibus em Marrocos";
//
//		for (int i = (a.length() - 1); i >= 0; i--) {
//			System.out.print(a.charAt(i));
//		}
//
//		System.out.println();
//
//		for (int i = (b.length() - 1); i >= 0; i--) {
//			System.out.print(b.charAt(i));
//		}

		String[] c = b.split(" ");
		int j = c.length;
		do{ 
			j--;
			System.out.print(c[j]+" ");
		} while (j > 0);
	}
}
