package bonus.modulo5;

import static org.junit.Assert.*;
import org.junit.Test;

public class FibonacciTest {

    @Test
    public void testFibonacci() {
        assertEquals(0, Fibonacci.encontraElementoPD(0));
        assertEquals(1, Fibonacci.encontraElementoPD(1));
        assertEquals(55, Fibonacci.encontraElementoPD(10));
        assertEquals(190392490709135L, Fibonacci.encontraElementoPD(70));
    }

    @Test
    public void testFibonacciCom0() {
        assertEquals(0, Fibonacci.encontraElementoPD(0));
    }

    @Test
    public void testFibonacciCom1() {
        assertEquals(1, Fibonacci.encontraElementoPD(1));
    }




}
