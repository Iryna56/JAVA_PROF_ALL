package algorithms.cw3;

public class Example4 {
    public static void main(String[] args) {
        System.out.println(incrFor(2, 3));
        System.out.println(incrRec(2, 3));
    }
    public static int incrFor(int a, int b) {
        int result = 1;
        for (int i = 0; i < b; i++) {
            result = result * a;
        } return result;
    }
    public static int incrRec(int a, int b) {
        if(b == 0) {
            return 1;
        }
        return incrRec(a, b-1) * a;
    }
}
