package org.example;
import java.util.Scanner;

public class Atividade03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira a massa da primeira particula em kg");
        double massa1 = scanner.nextDouble();

        System.out.println("Insira a velocidade da primeira particula em m/s");
        double velocidade1 = scanner.nextDouble();

        System.out.println("Insira a massa da segunda particula em kg");
        double massa2 = scanner.nextDouble();

        System.out.println("Insira a velocidade da segunda particula em m/s");
        double velocidade2 = scanner.nextDouble();

        double[] velocidadesFinais = calcularVelocidadesFinais(massa1, velocidade1, massa2, velocidade2);


        System.out.printf("Velocidade final da partícula 1: %.2f m/s \n", velocidadesFinais[0]);
        System.out.printf("Velocidade final da partícula 2: %.2f m/s \n", velocidadesFinais[1]);

        scanner.close();
    }

    // Função para calcular as velocidades finais após a colisão elastica
    public static double[] calcularVelocidadesFinais(double massa1, double velocidade1, double massa2, double velocidade2) {
        double[] velocidadesFinais = new double[2];

        velocidadesFinais[0] = (velocidade1 * (massa1 - massa2) + 2 * massa2 * velocidade2) / (massa1 + massa2);
        velocidadesFinais[1] = (velocidade2 * (massa2 - massa1) + 2 * massa1 * velocidade1) / (massa1 + massa2);

        return velocidadesFinais;
    }
}