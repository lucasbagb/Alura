package aula_4;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class EntradaDeUmArquivo {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
       
        Scanner entrada = new Scanner(System.in);
        String s = entrada.nextLine();
      
        System.out.println("Digite sua mensagem:");
        
       // String s = entrada.nextLine();
       // System.out.println(s);
        
        PrintStream saida = new PrintStream(new FileOutputStream("saida.txt"));
        saida.print(s);
    }
}