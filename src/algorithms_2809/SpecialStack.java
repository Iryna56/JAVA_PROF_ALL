package algorithms_2809;

import java.util.Stack;

public class SpecialStack {
    private Stack<Integer> stack; // стек для хранения элементов
    private Stack<Integer> minStack; // стек для хранения текущего минимального элемента

    public SpecialStack() {
        stack = new Stack<Integer>();
        minStack = new Stack<Integer>();
    }

    // добавление элемента в стек
    public void push(int x) {
        stack.push(x);

        // если стек minStack пустой или добавленный элемент меньше текущего минимального элемента,
        // добавляем его в minStack
        if (minStack.isEmpty() || x <= minStack.peek()) {
            minStack.push(x);
        }
    }

    // удаление и возвращение верхнего элемента стека
    public int pop() {
        // если стек пустой, выбрасываем исключение
        if (stack.isEmpty()) {
            throw new IllegalStateException("Стек пуст");
        }

        int popValue = stack.pop();

        // если удаленный элемент является текущим минимальным элементом, удаляем его из minStack
        if (popValue == minStack.peek()) {
            minStack.pop();
        }

        return popValue;
    }

    // проверка, пустой ли стек
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    // возвращение текущего минимального элемента
    public int getMin() {
        // если стек пустой, выбрасываем исключение
        if (minStack.isEmpty()) {
            throw new IllegalStateException("Стек пуст");
        }

        return minStack.peek();
    }
}
