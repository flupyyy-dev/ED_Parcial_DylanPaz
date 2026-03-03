public class Fibonacci {

    public static long fibonacciIterativo(int n) {
        if (n <= 0) return 0;
        if (n == 1) return 1;

        long a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            long c = a + b;
            a = b;
            b = c;
        }
        return b;
    }

    // SIN memoización (así lo pide la rúbrica)
    public static long fibonacciRecursivo(int n) {
        if (n <= 0) return 0;
        if (n == 1) return 1;
        return fibonacciRecursivo(n - 1) + fibonacciRecursivo(n - 2);
    }
}