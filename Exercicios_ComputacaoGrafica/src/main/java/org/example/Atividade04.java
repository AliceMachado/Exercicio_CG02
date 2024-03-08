package org.example;

import java.util.Scanner;

public class Atividade04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o comprimento da corda em metros: ");
        double comprimento = scanner.nextDouble();

        System.out.println("Insira o ângulo inicial em graus: ");
        double anguloInicial = scanner.nextDouble();
        double anguloInicialRadiano = Math.toRadians(anguloInicial);

        double velocidadeAngularI = 0; // Velocidade angular inicial (rad/s)
        double gravidade = 9.8; //Força gravitacional

        System.out.println("Insira o incremento de tempo em segundos: ");
        double intervaloTempo = scanner.nextDouble();

        System.out.println("Qual vai ser o tempo total em segundos: ");
        double totalTime = scanner.nextDouble();

        double anguloFinal = rungeKutta(anguloInicialRadiano, velocidadeAngularI, intervaloTempo, totalTime, comprimento, gravidade);
        System.out.printf("Posição angular final do pêndulo: %.2f graus",Math.toDegrees(anguloFinal));

        scanner.close();
    }

    //Função com o método Runge–Kutta clássico de quarta ordem
    public static double rungeKutta(double anguloInicialRadiano, double velocidadeAngularI, double intervaloTempo, double totalTime, double comprimento, double gravidade) {
        double angulo = anguloInicialRadiano;
        double velocidadeAngular = velocidadeAngularI;
        double tempo=intervaloTempo;

        while (tempo < totalTime) {
            double k1Angulo = intervaloTempo * velocidadeAngular;
            double k1Velocidade = intervaloTempo * (-gravidade / comprimento * Math.sin(angulo));

            double k2Angulo = intervaloTempo * (velocidadeAngular + 0.5 * k1Velocidade);
            double k2Velocidade = intervaloTempo * (-gravidade / comprimento * Math.sin(angulo + 0.5 * k1Angulo));

            double k3Angulo = intervaloTempo * (velocidadeAngular + 0.5 * k2Velocidade);
            double k3Velocidade = intervaloTempo * (-gravidade / comprimento * Math.sin(angulo + 0.5 * k2Angulo));

            double k4Angulo = intervaloTempo * (velocidadeAngular + k3Velocidade);
            double k4Velocidade = intervaloTempo * (-gravidade / comprimento * Math.sin(angulo + k3Angulo));

            angulo += (k1Angulo + 2 * k2Angulo + 2 * k3Angulo + k4Angulo) / 6;
            velocidadeAngular += (k1Velocidade + 2 * k2Velocidade + 2 * k3Velocidade + k4Velocidade) / 6;

            System.out.printf("Tempo: %.2f s, Pêndulo na posição angular: %.2f graus\n",tempo,Math.toDegrees(angulo));

            tempo += intervaloTempo;
        }

        return angulo;
    }
}