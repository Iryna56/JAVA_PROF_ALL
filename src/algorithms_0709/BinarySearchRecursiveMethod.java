package algorithms_0709;

public class BinarySearchRecursiveMethod {
    public static int search(int[] arr, int element,int leftBorder, int rightBorder ) {

        if (leftBorder > rightBorder)
            return -1;

            int middleIndex = (leftBorder + rightBorder) /2; //leftBorder + (rightBorder - leftBorder) / 2;

            if(element == arr[middleIndex])
                return middleIndex;
            if(arr[middleIndex] < element) {
                return search(arr, element, middleIndex + 1, rightBorder);
            } else {
                return search(arr, element, leftBorder, middleIndex - 1);
            }
        }

    }


