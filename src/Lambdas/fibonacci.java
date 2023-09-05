package Lambdas;

public class fibonacci {
    public static long[] fibonacci(int n) {
        long fib[] = new long[n];
        fib[0] = 0;
        fib[1] = 1;
        for (int i = 2; i < n ; i++) {
            fib[i] = fib[i-1] + fib[i-2];
        }
        return fib;
    }

    public static void main(String[] args) {
        int n = 125;
        long[] fibSequence = fibonacci(n);
        System.out.printf("Os %d primeiros números da sequencia de Fibonacci são:\n ", n);
        for (long numeros: fibSequence) {
            System.out.print(numeros + ", ");
        }
    }
}
