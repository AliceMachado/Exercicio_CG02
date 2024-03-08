import org.example.Atividade02;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Atividade02Test {
    @Test
    public void testCalcularTrajetoria() {
        double velocidadeInicial = 20.0;
        double anguloLancamento = 45.0;

        double[] resultados = Atividade02.calcularTrajetoria(velocidadeInicial, anguloLancamento);

        assertEquals(3, resultados[0], 0.01);
        assertEquals(42, resultados[1], 1);
    }
}