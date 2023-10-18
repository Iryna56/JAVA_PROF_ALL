package algorithms_3108;

public class FibonacciDirectRecursion {
    public static int fibonacciDirectRecursion(int n) {
        if(n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacciDirectRecursion(n-1) + fibonacciDirectRecursion(n - 2);
        }
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println("Fibonacci(" + n + ") using direct recursion: " + fibonacciDirectRecursion(n));
    }
}
