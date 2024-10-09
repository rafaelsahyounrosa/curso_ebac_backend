package bonus;

import java.math.BigInteger;
import java.util.Arrays;

public class Fatorial {

    private static final int MAX_ELEMENTOS = 1001;
    private static final BigInteger[] elementos = new BigInteger[MAX_ELEMENTOS];


    public static BigInteger recursiveFatorial(int n) {

        if(n <= 1){
            return BigInteger.ONE;
        }

        return recursiveFatorial(n - 1).multiply(BigInteger.valueOf(n));
    }

    public static BigInteger recursiveFatorial2(int n) {

        if(elementos[n] == null){

            if (n <= 1){
                elementos[n] = BigInteger.valueOf(1);
            }
            else {

                elementos[n] = recursiveFatorial2(n - 1).multiply(BigInteger.valueOf(n));
            }
        }

        return elementos[n];
    }

    public static BigInteger recursiveFatorialOptimized(int n) {

        Arrays.fill(elementos, null);

        return recursiveFatorial2(n);
    }

    public static void main(String[] args) {

//        System.out.println(recursiveFatorial(1000));
//        System.out.println(recursiveFatorialOptimized(1000));
//        System.out.println(recursiveFatorial(1));
//        System.out.println(recursiveFatorial(3));
    }
}
