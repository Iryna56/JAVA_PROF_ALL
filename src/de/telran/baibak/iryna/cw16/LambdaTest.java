package de.telran.baibak.iryna.cw16;

import java.util.function.Consumer;
import java.util.function.Function;

public class LambdaTest {

    //Иммутабельность - неизменяемое состояние, мы не можем извне поменять метод,
    // purity - нет состояния, если мы вызовем метод несколько раз, то он вернет одно и то же значение
    // тело метода должно быть изолировано извне
    public static void main(String[] args) {


        Consumer<Object> printer = o -> {
            System.out.println(o);
        };


        int v = 1;
        Func func = x -> x + 1; // f = (x) -> x + 1;
        //func create





    }

    //    Func func = new Func() {
//        @Override
//        public int apply(int x) {
//
//            return x + 1;
//        }
//    };
    Func func1 = LambdaTest::increment;
    Func func2 = LambdaTest::decrement;

    private static int increment(int x) {
        return x + 1;
    }

    private static int decrement(int x) {
        return x - 1;
    }

    static int comboFunc(Func func1, Func func2, int param) {
        if (param > 3) {
            return func1.apply(param);
        } else {
            return func2.apply(param);
        }
    }

    Function<Integer, Integer> customFunc = (Integer x) -> x + 3;


}
