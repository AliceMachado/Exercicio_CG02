package org.example;

import java.util.Scanner;
public class Atividade01
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Insira a altura do objeto");
        double altura = scan.nextDouble();
        scan.close();

        int tempo = quedaLivre(altura);
        System.out.println("O objeto levou " + tempo + " segundos até o chão");
    }

    // Função que vai realizar o cálculo do tempo em queda livre
    public static int quedaLivre(double altura) {
        double posicao = altura;
        double velocidade = 0;
        double gravidade = 9.8;
        int tempo = 0;
        while (posicao > 0 ){
            velocidade = velocidade + gravidade;
            posicao = posicao - velocidade;
            if (posicao < 0){
                posicao = 0;
            }
            tempo++;

            if (posicao!=0){
                System.out.printf("Altura do objeto depois de "+tempo+" segundos está à posicao %.2f metros do chão. \n", posicao);
                System.out.printf("Velocidade atual %.2f m/s \n", velocidade);
            }else{
                System.out.printf("O objeto atingiu o chão depois de "+tempo+" segundos na velocidade %.2f m/s\n", velocidade);
            }

        }

        return tempo;
    }

}
