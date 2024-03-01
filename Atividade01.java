import java.util.Scanner;
public class Atividade01
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
    	System.out.println("Insira a altura do objeto");
		double altura = scan.nextDouble();
		scan.close();
		
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
                System.out.println("Altura do objeto depois de "+tempo+" segundos está à "+Math.round(posicao)+" metros do chão.");
			    System.out.println("Velocidade atual "+Math.round(velocidade)+" m/s");
			    System.out.println("");
            }else{
                System.out.println("O objeto atingiu o chão depois de "+tempo+" segundos na velocidade "+Math.round(velocidade)+" m/s");
            }
			
		}

		System.out.println("O objeto levou "+tempo+" segundos até o chão");

	}
}