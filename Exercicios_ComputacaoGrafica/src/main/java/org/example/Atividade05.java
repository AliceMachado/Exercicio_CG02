package org.example;

import java.util.Scanner;

public class Atividade05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o raio da trajetória circular em metros:");
        double raio = scanner.nextDouble();

        System.out.println("Insira a velocidade angular em rad/s:");
        double velocidadeAngular = scanner.nextDouble();

        double[] velocidadesFinais = movimentoCircular(raio,velocidadeAngular);

        System.out.println("Velocidade tangencial: " + velocidadesFinais[0] + " m/s");
        System.out.println("Aceleração centrípeta: " + velocidadesFinais[1] + " m/s^2");

        scanner.close();
    }

    // Função para calcular a velocidade tangencial e a aceleração centripeta
    public static double[] movimentoCircular(double raio, double velocidadeAngular) {
        // criando array para armazenar os valores
        double[] valores = new double[2];

        // Calculando a velocidade tangencial
        double velocidadeTangencial = raio * velocidadeAngular;
        valores[0] = velocidadeTangencial;

        // Calculando a aceleração centrípeta
        double aceleracaoCentripeta = Math.pow(velocidadeAngular, 2) * raio;
        valores[1] = aceleracaoCentripeta;

        return valores;
    }
}
