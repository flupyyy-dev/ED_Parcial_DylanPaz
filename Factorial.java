public class Factorial {

    public static long factorialIterativo(int n) {
        long res = 1;
        for (int i = 2; i <= n; i++) res *= i;
        return res;
    }

    public static long factorialRecursivo(int n) {
        if (n <= 1) return 1;
        return n * factorialRecursivo(n - 1);
    }
}