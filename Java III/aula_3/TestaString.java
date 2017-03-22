package aula_3;

public class TestaString {

	public static void main(String[] args) {
		String s = "fj11";
		String ss = s.replaceAll("1", "2");
		System.out.println(ss);
		
		// Como fazer para saber se uma String se encontra dentro de outra?
		System.out.println(s.contains("f"));
		
		// E para tirar os espaços em branco das pontas de uma String? 
		String sss = " a b c d ";
		System.out.println(sss.trim());
		
		// E para saber se uma String está vazia?
		System.out.println(s.isEmpty());
		
		// E para saber quantos caracteres tem uma String?
		System.out.println(s.length());
	}
}