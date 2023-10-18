package de.telran.baibak.iryna.cw11StackQueue;


import java.util.List;
import java.util.Random;
import java.util.Stack;

public class StackMethods {
    public static void main(String[] args) {


        /*Стек класс является наследником вектора(вектор в свою очередь является интерфейсом, реализацией интерфейса лист, и наследником
        AbstractList
        push добавить элемент в конец списка
        pop  достать с конца
        peek  отвечает за то, чтобы не доставать а просто посмотреть
        empty проверить пуст стек или нет
        search  проверить на наличие обьекта
        size размер стека

        LIFO or FILO
        Используется для выполнения методов. Иногда используется вместо рекурсии



        РАЗНИЦА МЕЖДУ СТЕК И ОЧЕРЕДЬ
        Стек - LIFO, класс, потокобезопасный
        Queue -  добавление и удаление элементов с двух сторон, интерфейс, имеет не потокобезопасные реализации ArrayDeque and LinkedList

        * */


        Stack<Method> methods = new Stack<>();
        methods.push(new Method("main"));
        methods.push(new Method("add", List.of("value")));
        methods.push(new Method("contains", "boolean"));

        while (!methods.isEmpty()) {
            System.out.println(methods.pop());
        }

        Stack<Coin> coins = new Stack<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            coins.push(new Coin(random.nextInt(10)));
        }



        while (!coins.empty()) {
            Coin coin = coins.pop();
            System.out.println(coin);

            if (coin.number > 5) {
                coins.push(new Coin(2));
            }

        }

    }
}
