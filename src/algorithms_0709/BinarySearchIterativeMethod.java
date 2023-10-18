package algorithms_0709;

public class BinarySearchIterativeMethod {
    public static int search(int[] arr, int element) {
        int leftBorder = 0;
        int rightBorder = arr.length - 1;
        while (leftBorder <= rightBorder) {
            int middleIndex = (leftBorder + rightBorder) /2; //leftBorder + (rightBorder - leftBorder) / 2;

            if(element == arr[middleIndex])
                return middleIndex;
            if(arr[middleIndex] < element) {
                leftBorder = middleIndex + 1;
            } else {
                rightBorder = middleIndex - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        int elm = 7;
        System.out.println(search(arr, 7));
    }
}
