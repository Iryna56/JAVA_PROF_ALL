package algorithms_2408;

public class BinarySearch {
    // has to return boxed integer in order to comfort to interface defined in the book
    private static Integer binarySearch(int[] array, int item) {
        int firstElement = 0;
        int lastElement = array.length - 1;

        while (firstElement <= lastElement) {
            int mid = (firstElement + lastElement) / 2;
            int guess = array[mid];
            if (guess == item) {
                return mid;
            }
            if (guess > item) {
                lastElement = mid - 1;
            } else {
                firstElement = mid + 1;
            }
        }

        return null;
    }

    public static void main(String[] args) {
        int[] myArray = {1, 3, 5, 7, 9};

        System.out.println(binarySearch(myArray, 5)); // 2
        System.out.println(binarySearch(myArray, -1)); // null
    }
}
