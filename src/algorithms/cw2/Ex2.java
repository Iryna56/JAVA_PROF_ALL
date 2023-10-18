package algorithms.cw2;
//0 1 1 2 3 5 8 13 21 34 55 89
public class Ex2 {

    int fib1 = 0;
    int fib2 = 1;
    public static long fibLoops(int index){
        int fib1 = -1;
        int fib2 = 1;
        for (int i = 0; i <= index; i++) {
            int sum = fib1 + fib2;
            fib1 = fib2;
            fib2 = sum;
        }
        return fib2;
        }

        public static long fibRec(final int index) {
        if (index < 0) {
            throw new IllegalArgumentException();
        }
        if(index == 0) {
            return 0;
        }
        return  index == 1 || index == 2 ? 1 : fibRec(index - 2) + fibRec(index -1);
        }

    public static void main(String[] args) {
        int n = 6;
        System.out.println(fibLoops(n));
        System.out.println(fibRec(n));

    }




    }



