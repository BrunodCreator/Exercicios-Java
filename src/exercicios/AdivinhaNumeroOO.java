import java.util.Scanner;

public class AdivinhaNumeroOO {
public static void main(String[] args){
    NumeroAleatorio numeroAleatorio = new NumeroAleatorio();
    Scanner sc = new Scanner(System.in);
    
    while (numeroAleatorio.tentativa > 0){
        System.out.println("Você tem " + numeroAleatorio.tentativa + " chances de acertar um número aleatório");
        System.out.println("Digite um número: ");
        numeroAleatorio.numeroDigitado = sc.nextInt();
        numeroAleatorio.validaResposta(numeroAleatorio.numeroDigitado);
        numeroAleatorio.tentativa--;
        numeroAleatorio.finalPrograma(numeroAleatorio.tentativa);
         }

        }
    }


