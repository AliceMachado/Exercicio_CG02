package org.example;

import java.util.Scanner;

public class Atividade040 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar os parâmetros do pêndulo
        System.out.println("Digite a massa do objeto pendurado (em kg):");
        double massa = scanner.nextDouble();

        System.out.println("Digite o comprimento da corda (em metros):");
        double comprimento = scanner.nextDouble();

        double gravidade = 9.8;

        // Calcular o período do pêndulo
        double periodo = 2 * Math.PI * Math.sqrt(comprimento / gravidade);

        // Simular o movimento do pêndulo
        System.out.println("Digite o número de passos de tempo:");
        int numPassos = scanner.nextInt();

        System.out.println("Digite o intervalo de tempo entre os passos (em segundos):");
        double intervaloTempo = scanner.nextDouble();

        System.out.println("Tempo (s)\tPosição Angular (rad)");
        for (int i = 0; i <= numPassos; i++) {
            double tempo = i * intervaloTempo;
            double posicaoAngular = calcularPosicaoAngular(tempo, periodo, gravidade, comprimento, massa);
            System.out.println(tempo + "\t\t" + posicaoAngular);
        }

        scanner.close();
    }

    // Método para calcular a posição angular do pêndulo em um determinado tempo
    public static double calcularPosicaoAngular(double tempo, double periodo, double gravidade, double comprimento, double massa) {
        return Math.PI / 4 * Math.cos((2 * Math.PI / periodo) * tempo)* (gravidade / (comprimento / massa));
    }
}
