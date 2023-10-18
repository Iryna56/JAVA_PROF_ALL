package algorithms.homework3;

public class BinaryCurrent {
    public static void main(String[] args) {
        int result = getBinaryNumber(255);
        System.out.println(result);
    }

    public static int getBinaryNumber(int number) {
        int current = 0;
        while (number != 0) {
            if ((number & 1) == 1) {
                current++;
            }
            number = number >>> 1;
        }
        return current;
    }


}

