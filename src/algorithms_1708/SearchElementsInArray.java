package algorithms_1708;

public class SearchElementsInArray {
    // найти элемент в списке(массиве)
    /* ограничения: на вход идет только массив из целых положительных чисел
    работаем только с целыми положительными числами
    размер массива [1,10]
    время исполнения не более 1 секунды
    количество памяти?
    сортированный массив или нет?
     */
    /*для оценки алгоритма используется количество операций,
    которое алгоритм должен выполнить
     */
    /* текстовый алгоритм
    1. Получаем массив и искомое число
    2.Перебираем массив
    3.Если текущий элемент массив равен искомому, то возвращаем номер элемента в массиве
    4. Если массив закончился и не был найден элемент, то выводим
    Такого элемента нет в массиве
    Реализация на псевдокоде
    START
    READ array arr[], key k
    FOR i= 0 to end array do
    IF arr[i] = k THEN
       return true
    return false;
    END
     */
    public static void main(String[] args) {


    int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(searchElement(array, 15));
}

    public static int searchElement(int[] array, int item) {
        for (int i = 0; i < array.length; i++) {
            if(array[i] == item) {
                return item;
            }
        }
        return 0;
    }
}
