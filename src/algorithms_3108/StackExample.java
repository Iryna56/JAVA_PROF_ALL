package algorithms_3108;

public class StackExample {
    public static void main(String[] args) {
        int result = recursiveMethod(7);
        System.out.println("Result: " + result);
    }
// рекурсивный метод
    public static int recursiveMethod(int n) {
        if(n == 0) {
            return 0;
        } else {
            int recursiveResult = recursiveMethod(n - 1);
            int result = n * recursiveResult;
            return result;
        }
    }
    // итерационный метод
    public static int methodA(int n) {
        int x = n + 1;
        int y = methodB(x);
        return y;
    }
    public static int methodB(int m) {
        int z = m * 2;
        return z;
    }
}
