package org.example;
import java.util.Scanner;

public class Atividade02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira a velocidade do objeto no momento em que foi lançado em m/s");
        double velocidadeInicial = scanner.nextDouble();

        System.out.println("Insira o angulo de lançamento do objeto");
        double anguloLancamento = scanner.nextDouble();

        scanner.close();
        double[] resultados = calcularTrajetoria(velocidadeInicial, anguloLancamento);
        System.out.println("O objeto ficou no ar durante "+resultados[0]+" segundos, e percorreu "+Math.round(resultados[1])+" metros, até atingir o chão.");
    }

    //Função para calcular trajetória do projetil
    public static double[] calcularTrajetoria(double velocidadeInicial, double anguloLancamento) {
        double angulo = Math.toRadians(anguloLancamento);

        //Usando Seno e Cosseno para calcular as velocidades verticais e horizontais
        double velocidadeHorizontal = velocidadeInicial * Math.cos(angulo);
        double velocidadeVertical = velocidadeInicial * Math.sin(angulo);

        double gravidade = 9.8;//Força gravitacional

        double tempo = 0;
        double distancia = 0;
        double altura = 0;

        double[] resultados = new double[2];

        while (altura >= 0) {
            distancia = velocidadeHorizontal * tempo;
            altura = velocidadeVertical * tempo - 0.5 * gravidade * Math.pow(tempo, 2);

            if (altura < 0) {
                break;
            }

            System.out.println("Aos "+tempo+" segundos, o objeto percorreu uma distancia de "+Math.round(distancia)+" metros e está a "+Math.round(altura)+" metros de altura");

            tempo += 1;
        }
        resultados[0] = tempo;
        resultados[1] = distancia;
        return resultados;
    }
}