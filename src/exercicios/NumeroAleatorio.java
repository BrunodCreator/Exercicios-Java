import java.util.Random;

public class NumeroAleatorio {
    int numeroAleatorio = new Random().nextInt(100);
    int numeroDigitado = 0;
    int tentativa = 5;

    public void finalPrograma(int tentativa){
        if (tentativa == 0){
             System.out.println("Você não acertou o numero era:" + numeroAleatorio );

        }
    }

    int validaResposta(int numeroDigitado) {
        if (numeroDigitado > numeroAleatorio) {
            System.out.println("Chutou alto tente um valor menor");
            return 1;
        } else if (numeroDigitado < numeroAleatorio) {
            System.out.println("Chutou baixo tente um valor maior");
            return -1;
        } else {
            System.out.println("Parabens você acertou em cheio");
            return 0;
         }
    }
}


