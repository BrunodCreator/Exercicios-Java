package exercicios;

import java.util.Scanner;

public class Exercicios_04 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite um número:");
		double numero1 = scanner.nextInt();
		System.out.println("Digite outro número: ");
		int numero2 = scanner.nextInt();
		
		double soma = numero1 + numero2;
		double subtracao = numero1 - numero2;
		double multiplicacao = numero1 * numero2;
		double divisao = numero1 / numero2;
		
		if (numero2 == 0) {
			System.out.println("Não é possivel fazer divisão por 0");
		} else {
			System.out.println("A soma dos números e: " + soma + " a subtracao é: "+ subtracao +" a multiplicação é: "+ multiplicacao + " e a divisão é: "+ divisao);
		}
		
	}

}
