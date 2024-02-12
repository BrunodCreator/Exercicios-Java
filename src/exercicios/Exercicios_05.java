package exercicios;

import java.util.Scanner;

public class Exercicios_05 {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Digite seu nome completo:");
	String nomeCompleto = scanner.nextLine();
	
	String[] partesNome = nomeCompleto.split(" ");
	
	String primeiroNome = partesNome[0];
	System.out.println("Primeiro nome: "+ primeiroNome);

	}

}
