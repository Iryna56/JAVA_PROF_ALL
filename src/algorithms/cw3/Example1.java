package algorithms.cw3;

public class Example1 {
    public static void main(String[] args) {

        System.out.println(multiFor(6,3));
    }
    public static int multi(int a, int b) {
        return a * b;
    }
    public static int multiFor(int a, int b) {
        int result = 0;
        for (int i = 0; i < b; i++) {
            result += a;
        }
        return result;
    }
    public static int multiRec(int a, int b) {
        if(b == 0) {
            return 0;
        }
        return multiRec(a, b-1) + a;
    }
}

