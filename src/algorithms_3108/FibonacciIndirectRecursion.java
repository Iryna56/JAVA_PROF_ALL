package algorithms_3108;

public class FibonacciIndirectRecursion {
    public static int fibonacciA(int n) {
        if(n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacciB(n - 1) + fibonacciB(n - 2);
        }
    }
    public static int fibonacciB(int n) {
        if(n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacciA(n - 1) + fibonacciA(n - 2);
        }
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println("Fibonacci(" + n + ") using indirect recursion: " + fibonacciA(n));
    }
}
