import java.util.Scanner;

public class Atividade02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira a velocidade do objeto no momento em que foi lançado em m/s");
        double velocidadeInicial = scanner.nextDouble();

        System.out.println("Insira o angulo de lançamento do objeto");
        double anguloLancamento = scanner.nextDouble();

        double angulo = Math.toRadians(anguloLancamento);

        double velocidadeHorizontal = velocidadeInicial * Math.cos(angulo);
        double velocidadeVertical = velocidadeInicial * Math.sin(angulo);

        double gravidade = 9.8;

        double tempo = 0;
        double distancia = 0;
        double altura = 0;

        while (altura >= 0) {
            distancia = velocidadeHorizontal * tempo;
            altura = velocidadeVertical * tempo - 0.5 * gravidade * Math.pow(tempo, 2);


            if (altura < 0) {
                System.out.println("O objeto ficou no ar durante "+tempo+" segundos, e percorreu "+Math.round(distancia)+" metros, até atingir o chão.");
                break;
            }

            System.out.println("Aos "+tempo+" segundos, o objeto percorreu uma distancia de "+Math.round(distancia)+" metros e está a "+Math.round(altura)+" metros de altura");

            tempo += 1;
        }

        scanner.close();
    }
}
