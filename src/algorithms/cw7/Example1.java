package algorithms.cw7;

import static java.io.ObjectInputFilter.merge;

public class Example1 {
    public static int[] mergeSort(int[] array) {
        int[] temp;
        int[] currentSrc = array;
        int[] currentDes = new int[array.length];

        int size = 1;
        while (size < array.length) {
//            for (int i = 0; i < array.length; i += 2 * size) {
//                merge(currentSrc, i, currentSrc, i + size, currentDes, i, size);
//
//            }
            temp = currentSrc;
            currentSrc = currentDes;
            currentDes = temp;

            size = size * 2;
        }
        return currentSrc;
    }

    private static void merge(int[] src1, int src1Start, int[] src2, int src2Start, int dest, int destStart, int size) {
        int index1 = src1Start;
        int index2 = src2Start;

        int src1End = Math.min(src1Start + size, src1.length);
        int src2End = Math.min(src2Start + size, src2.length);

        if(src1Start + size > src1.length) {
            if(src1Start + size > src1.length) {
                if ( src1End - src1Start >= 0) {
                    System.arraycopy(src1, src1Start, dest, src1Start, src1End - src1Start);
                }
                return;
            }
            int iterationCount = src1End - src1Start + src2End - src2Start;

//            for (int i = destStart; i < destStart  + iterationCount; i++) {
//                if (index1 < src1End && (index2 >= src2End || src1[index1] < src2[index2])) {
//                    dest[i] = src1[index1];
//                    index1++;
//                } else {
//                    dest[i] = src2[index2];
//                    index2++;
//                }

            }
        }
        //private static String arrayToCopy(int[] array) {

        }
//    }

//    public static void main(String[] args) {
//        int[] array = {65, 4, 9, 8, 73, 21, 12, 30, 54, 10, 63, 18};
//    }

//}
//Mergsort
