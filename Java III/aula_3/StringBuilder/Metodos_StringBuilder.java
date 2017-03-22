package aula_3.StringBuilder;

public class Metodos_StringBuilder {

	public static void main(String[] args) {
		
	    StringBuilder buffer = new StringBuilder("João Silveira Batista");
	    System.out.printf(" buffer = %s\n tamanho = %d\n capacidade (%d (tamanho) + " +
				"16(valor inicial padrão)) = %d\n\n",
				buffer.toString(),buffer.length(),buffer.length(),buffer.capacity());
		
		//EXPANDE A CAPACIDADE P/ 75 CARACTERES
		buffer.ensureCapacity(75);
		System.out.printf("Nova Capacidade = %d\n\n", buffer.capacity());
		
		//REDEFINE O TAMANHO, NÃO APARECENDO OS CARACTERES 
		// SE O ARGUMENTO FOR MENOR QUE A QUANTIDADE DE CARACTERES ORIGINAL
		buffer.setLength(10);
		System.out.printf("Novo tamanho = %d\n buffer = %s\n",buffer.length(), 
				buffer.toString());
		
		StringBuilder buffer2 = new StringBuilder("Usando outros métodos StringBuilder");
		
		System.out.printf("buffer = %s\n", buffer2.toString());
		System.out.printf("Caractere index 0: %s\nCaractere index 4: " + 
				"%s\n\n",buffer2.charAt(0),buffer2.charAt(4));
		
		char[] charArray = new char[buffer2.length()];
		
		buffer2.getChars(0, buffer2.length(), charArray, 0);
		System.out.print("Os caracteres são: ");
		
		for(char c : charArray)
			System.out.print(c);
		
		buffer2.setCharAt(0, 'O');
		buffer2.setCharAt(4, 'P');
		
		System.out.printf("\n\nbuffer = %s", buffer2.toString());
		
		buffer2.reverse();
		System.out.printf("\n\nbuffer = %s\n", buffer2.toString());
	}
}