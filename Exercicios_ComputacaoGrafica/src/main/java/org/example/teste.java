package org.example;

import java.util.Scanner;

public class teste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o comprimento da corda em metros: ");
        double comprimento = scanner.nextDouble();

        System.out.println("Digite a aceleração devido à gravidade em m/s^2: ");
        double gravidade = scanner.nextDouble();

        System.out.println("Digite o ângulo inicial: ");
        double anguloInicial = scanner.nextDouble();
        double anguloRadiano = Math.toRadians(anguloInicial);

        System.out.println("Digite o tempo total de simulação em segundos: ");
        double tempoTotal = scanner.nextDouble();

        System.out.println("Digite o intervalo de tempo da simulação em segundos: ");
        double intervaloTempo = scanner.nextDouble();

        scanner.close();

        double angulo = anguloRadiano;
        double velocidadeAngularI = 0; // Velocidade angular inicial


        for (double t = 1; t <= tempoTotal; t += intervaloTempo) {
            // Equação de movimento do pêndulo
            double movimento = -(gravidade / comprimento) * Math.sin(angulo);
            velocidadeAngularI += movimento * t;
            angulo += velocidadeAngularI * t;
            System.out.println("Angulo antes: "+angulo);
            angulo = angulo % (2 * Math.PI);

            System.out.println("movimento: "+movimento);
            System.out.println("Velocidade angular: "+velocidadeAngularI);

            System.out.printf("Tempo: %.2f s, Ângulo: %.2f graus%n", t, Math.toDegrees(angulo));
        }

        System.out.println("O pêndulo parou de se mexer.");
    }
}