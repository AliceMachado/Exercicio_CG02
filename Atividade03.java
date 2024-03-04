import java.util.Scanner;

public class Atividade03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira a massa da primeira particula");
        double massa1 = scanner.nextDouble();

        System.out.println("Insira a velocidade da primeira particula em m/s");
        double velocidade1 = scanner.nextDouble();

        System.out.println("Insira a massa da segunda particula");
        double massa2 = scanner.nextDouble();

        System.out.println("Insira a velocidade da segunda particula em m/s");
        double velocidade2 = scanner.nextDouble();

        double V_FA = (massa1 * velocidade1 + massa2 * velocidade2) / (massa1 + massa2);
        double V_FB = (massa2 * velocidade2 + massa1 * velocidade1) / (massa1 + massa2);
        
        // Imprimindo as velocidades finais
        System.out.printf("Velocidade final da partícula 1: %.2f m/s", V_FA);
        System.out.println("");
        System.out.printf("Velocidade final da partícula 2: %.2f m/s", V_FB);
        
        scanner.close();
    }
}