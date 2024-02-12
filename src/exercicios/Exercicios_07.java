package exercicios;

import java.util.Scanner;

public class Exercicios_07 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite uma frase, vou verificar a quantidade de espaços presente");
		String frase = scanner.nextLine();
		int contadorEspacos = 0;
		
		for (int i = 0; i < frase.length(); i++) {
			if (frase.charAt(i) == ' ') {
				contadorEspacos++;
			}
			
		}
		System.out.println("quantidade de espaços em branco: " + contadorEspacos);
	}
}
