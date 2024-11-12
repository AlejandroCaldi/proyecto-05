package es.santander.ascender.proyecto05;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class UtilidadesTest {

    private Utilidades cut = new Utilidades();

    @Test
    public void testArrayvalorMayor() {

        final double[] paraTestear = { -6, 1.3, 4.3, -5.9, 16.101 };
        double resultadoPrueba = cut.arrayValorMayor(paraTestear);
        assertTrue(resultadoPrueba == 16.101);
    }

    @Test
    public void testArrayvalorMenor() {
        final double[] paraTestear = { -6, 1.3, 4.3, -5.9, 16.101 };
        double resultadoPrueba = cut.arrayValorMenor(paraTestear);
        assertTrue(resultadoPrueba == -6);
    }

    @Test
    public void testNumeroRandom() {
        int limite = -20;
        int[] teste = cut.listaNumerosRandom(5, limite);
        for (int i = 0; i < teste.length; i++) {

            if (limite < 0)

            {
                assertTrue(teste[i] >= limite);
                assertTrue(teste[i]  >= 0);


            }
            else
            { assertTrue(teste[i] >= 0);
                assertTrue(teste[i] <= limite);
            }
           


        }

    }

}
