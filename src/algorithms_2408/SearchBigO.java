package algorithms_2408;

public class SearchBigO {
    /* Задача: Найдите сумму двух чисел
Научимся рассчитывать сложность алгоритма.

Определим константы:
1 единица времени на арифметические и логические операции
1 единица времени для операторов присваивания и возврата
*/
    public static int sum(int one, int two){
        int result = one + two;
        return result;
    }
    /* T(sum) = 2 + 1 = 3
    O(3) -> 3 is constant
    Time complexity=O(2)= O(1)
    Пример игнорирования констант
    4n^3 = O(n^3)
    n^2 + n = O(n^2)
    log2(n), log10(n) = O(log n)
     */

    //Найти сумму всех элементов массива
    //Рассчитать сложность алгоритма.
    public static int listSum(int[] array) {
        int result = 0;                           // cost=1, time=1
        for (int i = 0; i < array.length; i++) {  //cost=3, time=n + 1
            result = result + array[i];           //cost=2, time=n
        }
        return result;                            //cost=1, time=1
    }

}
