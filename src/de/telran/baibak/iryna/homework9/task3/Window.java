package de.telran.baibak.iryna.homework9.task3;

import java.util.Objects;

public class Window {
   private int weight;
   private int width;
   private int height;
   private String type;

    public Window(int weight, int width, int height, String type) {
        this.weight = weight;
        this.width = width;
        this.height = height;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Window{" +
                "weight=" + weight +
                ", width=" + width +
                ", height=" + height +
                ", type='" + type + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Window window = (Window) o;
        return weight == window.weight && width == window.width && height == window.height && Objects.equals(type, window.type);
    }

    @Override
    public int hashCode() {

        return Objects.hash(weight, width, height, type);
    }
}
