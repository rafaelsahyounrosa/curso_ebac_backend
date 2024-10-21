package bonus.modulo5;

public class Calculadora {

    /**
     * Executa a soma de dois números decimais.
     *
     * @param a Número 1
     * @param b Número 2
     * @return Soma dos números
     */
    public static double Soma(float a, float b) {
        return a + b;
    }


    /**
     * Executa a subtração de dois números decimais.
     *
     * @param a Número 1
     * @param b Número 2
     * @return Subtração dos números
     */
    public static double Subtrai(float a, float b) {
        return a - b;
    }

    /**
     * Executa a multiplicação de dois números decimais.
     *
     * @param a Número 1
     * @param b Número 2
     * @return Multiplicação dos números
     */
    public static double Multipica(float a, float b) {
        return a * b;
    }

    /**
     * Executa a divisão de dois números decimais. Caso o primeiro seja 0, retornamos 0, caso o segundo seja 0, estouramos um erro.
     *
     * @param a Número 1
     * @param b Número 2
     * @return Divisão dos dois números
     */
    public static double Divide(float a, float b) {

        if (a == 0)
            return 0;
        if (b == 0)
            throw new ArithmeticException("Divisão por 0");

        return a / b;
    }
}
