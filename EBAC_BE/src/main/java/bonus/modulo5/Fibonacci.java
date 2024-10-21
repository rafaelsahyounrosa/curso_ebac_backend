package bonus.modulo5;

public class Fibonacci {

    private static final int MAX_ELEMENTOS = 100;
    private static final long[] elementosFibonacci = new long[MAX_ELEMENTOS];

    public static long encontraElementoPD(int n) {

        for(int i = 0; i < MAX_ELEMENTOS; i++) {
            elementosFibonacci[i] = -1;
        }

        return encontraElemento(n);
    }

    public static long encontraElemento(int n) {

        if(elementosFibonacci[n] == -1) {
            if(n <= 1){
                elementosFibonacci[n] = n;
            }
            else {
                elementosFibonacci[n] = encontraElemento(n - 1) + encontraElemento(n - 2);
            }
        }
        return elementosFibonacci[n];
    }

    public static void main(String[] args){

        int n = 1;

        System.out.println("Elemento: " + encontraElementoPD(n));
    }
}
