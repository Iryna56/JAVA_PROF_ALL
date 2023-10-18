package algorithms.homework1;

public class Example1 {
    public static void main(String[] args) {
        int[] arr = {3, 8, 16, 9, 167, 90};
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
            }
            System.out.println(max);

        }
    }

