package de.telran.baibak.iryna.cw3;

public class OverloadTest {
    // перегрузка - это одинаковое название, но разная сигнатура
    // разные параметры
    static double sum(double first, int second) {
        // модификатор, static final не входит в сигнатуру
        //переименование метода входит
        //название параметров не влияет на сигнатуру
        //type - влияет
        /// сигнатура это имя метода плюс типы входных параметров в порядке объявления
        return first + second;
    }
    static double sum(int first2, double second2) {
        return first2 + second2;
    }
}
