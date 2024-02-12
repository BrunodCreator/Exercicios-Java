package exercicios;

import java.util.Scanner;

public class Exercicios_03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite uma frase que vou verificar se ela inicia com a letra 'a'");
		String fraseDigitada = scanner.nextLine();
		String fraseMinuscula = fraseDigitada.toLowerCase();
		
		if (fraseMinuscula.startsWith("a")) {
			System.out.println("A frase começa com A");
		} else {
			System.out.println("A frase não começa com A");
		}
	}
}
