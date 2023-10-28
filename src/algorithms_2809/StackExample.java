package algorithms_2809;

import java.util.Arrays;

public class StackExample {
    private int top;        // место, куда мы положим следующий(новый) элемент
    private Integer[] array; // массив в котором хранятся данные
    private int size;       // храним количество элементов в стеке
    private int capacity;    // вместимость стека
    private static final int DEFAULT_CAPACITY = 10; // статическая константа

    public StackExample() {
        int top = 0;
        array = new Integer[DEFAULT_CAPACITY];
        size = 0;
    }

    public void push(int elm) {  //добавление элемента в стек
        if (size >= capacity) {// проверка, не переполнен ли стек
            increaseCapacity();  // если переполнен, то добавляем место
        }

        array[top++] = elm;      //в новое место кладем новый элемент elm, увеличивая размер на один
        size++;
    }
    public Integer pop() {   // удаление элемента
        if (size == 0) {    // если размер равен нулю, возвращаем null
            return null;
        }
        Integer answer = array[--top];  // сначала уменьшаем на единицу, а потом передаем значение
        array[top] = null;              // обнуляем обьект
        size--;                          // уменьшаем размер на единицу
        return answer;                   // возвращаем
    }
    private void increaseCapacity() {
        capacity *= 2;
        array = Arrays.copyOf(array, capacity);   // создание нового массива и копирование в новый массив старого массива
    }
}
