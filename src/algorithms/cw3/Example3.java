package algorithms.cw3;

public class Example3 {
    public static void main(String[] args) {
        System.out.println(getSum1(5));
    }
    public static int getSumFor(int f) {
        int result = 0;
        for (int i = 0; i <= f; i++) {
            result *= i;
        } return result;
    }
    public static int getSum1(int f) {
        if(f <= 0) {
            return 0;
        }
        return getSum1(f-1) + f;
    }
}
