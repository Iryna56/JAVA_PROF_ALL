package de.telran.baibak.iryna.cw11StackQueue;

public class Coin {
    @Override
    public String toString() {
        return "Coin{" +
                "number=" + number +
                '}';
    }

    int number;

    public Coin(int number) {
        this.number = number;
    }

    public Coin() {
    }
}
