package aula_4;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class ClasseMain {
	public static void main(String[] args) {
		
		System.out.println("Escreve");
//		try {
//			System.out.println(br.readLine());
//			br.close();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
		BufferedReader br;
		String linha = "" ;
		try {
			br = new BufferedReader(new InputStreamReader(new FileInputStream("arquivo.txt")));
			try {
				linha = br.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		System.out.println(linha);
			
	}
}
