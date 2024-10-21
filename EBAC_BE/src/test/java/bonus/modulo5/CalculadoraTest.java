package bonus.modulo5;

import static org.junit.Assert.*;
import org.junit.Test;

public class CalculadoraTest {

    @Test
    public void testSoma() {
        assertEquals(3.5F, Calculadora.Soma(1F, 2.5F), 0);
    }

    @Test
    public void testSubtracao() {
        assertEquals(-1.5F, Calculadora.Subtrai(1F, 2.5F), 0);
    }

    @Test
    public void testMultiplicacao() {
        assertEquals(3.75F, Calculadora.Multipica(1.5F, 2.5F), 0);
    }

    @Test
    public void testMultiplicacaoPorZero() {
        assertEquals(0, Calculadora.Multipica(1.5F, 0), 0);
        assertEquals(0, Calculadora.Multipica(0, 4.56F), 0);
    }

    @Test
    public void testDivisao() {
        assertEquals(2, Calculadora.Divide(10F, 5F), 0);
    }

    @Test
    public void testDivisaoDeZero() {
        assertEquals(0, Calculadora.Divide(0F, 5F), 0);
    }

    @Test(expected = ArithmeticException.class)
    public void testDivisaoPorZero() {
        assertEquals(0, Calculadora.Divide(10F, 0F), 0);
    }
}
