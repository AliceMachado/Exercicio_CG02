import org.example.Atividade05;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Atividade05Test {
    @Test
    public void testMovimentoCircular() {
        double raio = 5.0;
        double velocidadeAngular = 2.0;

        double[] resultados = Atividade05.movimentoCircular(raio, velocidadeAngular);

        double velocidadeTangencialEsperada = 10;
        double aceleracaoCentripetaEsperada = 20;

        assertEquals(velocidadeTangencialEsperada, resultados[0], 0.001);
        assertEquals(aceleracaoCentripetaEsperada, resultados[1], 0.001);
    }
}