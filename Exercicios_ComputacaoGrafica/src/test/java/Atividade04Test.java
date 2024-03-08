import org.example.Atividade04;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Atividade04Test {

    @Test
    public void testRungeKutta() {
        double anguloInicialRadiano = Math.toRadians(20);
        double velocidadeAngularI = 0;
        double intervaloTempo = 0.1;
        double totalTime = 10;
        double comprimento = 2;
        double gravidade = 9.8;

        double resultadoEsperado = -19.99;


        double anguloFinal = Atividade04.rungeKutta(anguloInicialRadiano, velocidadeAngularI, intervaloTempo, totalTime, comprimento, gravidade);
        anguloFinal = Math.toDegrees(anguloFinal);


        assertEquals(resultadoEsperado, anguloFinal, 0.01);
    }
}
