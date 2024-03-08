import org.example.Atividade03;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Atividade03Test {
    @Test
    public void testCalcularVelocidadesFinais() {
        double massa1 = 10.0;
        double velocidade1 = 5.0;
        double massa2 = 10.0;
        double velocidade2 = 3.0;

        double[] velocidadesFinais = Atividade03.calcularVelocidadesFinais(massa1, velocidade1, massa2, velocidade2);

        double[] resultadoEsperado = {3, 5};

        assertArrayEquals(resultadoEsperado, velocidadesFinais, 0.01);
    }
}