package algorithms_1210;

import java.util.List;

public class Window {
    /*Расписать подробно каждую строчку этого кода комментариями или самостоятельно реализовать решение задачи:
Дан массив положительных целых чисел и целевое число target. Необходимо найти самую короткую подпоследовательность
 чисел в массиве, сумма которых равна target. Верните эту самую короткую подпоследовательность.
     */
    public static void findShortestArray(List<Integer> arrayList, int targetSum){ // на вход подаем дин массив чисел, и целевое число target
        int leftBorder = 0;                       // первый и последний элемент массива равна нулю
        int rightBorder = 0;
        int sum = 0;                              // сумма элементов искомой последовательности 0

        int minLength = Integer.MAX_VALUE;        // минимальной длине массива присваиваем макс число Integer
        int answerLeftBorder = 0;                 // первый и последний элемент искомой последовательности
        int answerRightBorder = 0;

        while(rightBorder < arrayList.size()){    // до тех пор пока длина массива будет больше последнего элемента
            sum += arrayList.get(rightBorder);    // прибавляем к переменной sum каждый последний элемент массива, и присваиваем новое значение на каждой итерации
            while(sum >= targetSum){              // до тех пор пока сумма элементов массива sum будет больше или сравняется с целевым значением
                int windowLength = rightBorder - leftBorder + 1;       // длина искомой последовательности равна данной разнице
                if(windowLength < minLength && sum == targetSum) {     // если длина искомой последовательности меньше чем длина массива и сумма элементов массива равна целевому числу
                    answerLeftBorder = leftBorder;                    // то первому элементу искомой последовательности присваивается первый элемент массива
                    answerRightBorder = rightBorder;                   // то последнему элементу искомой последовательности присваивается последний элемент массива
                    minLength = windowLength;                         // и длина массива равна длине искомой последовательности
                }
                sum -= arrayList.get(leftBorder);               // до входа в цикл, sum присваиваем с вычитанием элемент массива начиная с первого
                leftBorder++;                                   // при присваивании, берем следующий элемент массива
            }
            rightBorder++;
        }

        if(minLength != Integer.MAX_VALUE){                   // если длина массива не равна максимальному значению Integer
            for(int i = answerLeftBorder; i <= answerRightBorder; i++) {   // то запускаем цикл фор, который будет работать, начиная с первого элемента
                                                                            // искомой последовательности, с шагом 1, и до последнего элемента
                System.out.println(arrayList.get(i));                 // в итоге на экран будет выведена данная последовательность
            }
        }

    }

    public static void main(String[] args) {
        List<Integer> arrayList = List.of(1, 1, 1, 2, 4, 5);

        findShortestArray(arrayList, 3);
    }
}
