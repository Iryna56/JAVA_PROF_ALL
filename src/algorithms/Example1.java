package algorithms;

public class Example1 {
    public static void main(String[] args) {
        System.out.println(isPrime2(19));
        for (int i = 0; i < 500; i++) {
            System.out.println(i + " : " + isPrime(i));

        }
    }
    public static boolean isPrime2(int number) {
        if(number < 2) {
            return false;
        }
        if (number % 2 == 0) {
            return number == 2;
        }
        if(number % 3 == 0) {
            return number == 3;
        }

        for (int i = 5; i * i <= number ; i++) {
            if(number % i == 0 || (i + 2) == 0) {
                return false;
            }

        }
        return true;
    }
    public static boolean isPrime(int number) {
        if(number < 2) return false;

        for (int i = 2; i * i <= number ; i += 6) {
            if(number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
