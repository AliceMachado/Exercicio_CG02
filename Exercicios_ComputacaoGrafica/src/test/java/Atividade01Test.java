import org.example.Atividade01;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Atividade01Test {
    @Test
    public void testCalcularTempoQueda() {
        double alturaInicial = 50;
        // Chamando o método calcularTempoQueda
        int tempo = Atividade01.quedaLivre(alturaInicial);

        assertEquals(3, tempo);
    }
}