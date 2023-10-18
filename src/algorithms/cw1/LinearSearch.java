package algorithms.cw1;

public class LinearSearch {
    public static void main(String[] args) {


        int[] array = new int[]{1, 4, 5, 12, 15, 22, 34, 67, 90 , 99, 123};

        System.out.println(linearSearch(array, 99));
    }
        public static int linearSearch ( int[] arr, int item){
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == item) {
                    return i;
                }

            }
            return -1;
        }

    }

