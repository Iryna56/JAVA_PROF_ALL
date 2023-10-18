package algorithms.cw3;

public class Example2 {
    public static void main(String[] args) {
        System.out.println(factorial1(3));
    }
    public static int factorial(int a) {
        int number = 1;
        for (int i = 1; i <= a; i++) {
            number *= i;

        }
        return number;
    }
        public static int factorial1(int a) {
            if (a == 0 || a == 1) {
                return 1;
            }
            return factorial1(a - 1) * a;
        }

    }

