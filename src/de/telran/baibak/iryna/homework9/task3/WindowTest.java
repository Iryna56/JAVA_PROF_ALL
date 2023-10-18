package de.telran.baibak.iryna.homework9.task3;

import java.util.HashSet;
import java.util.Set;

public class WindowTest {
    public static void main(String[] args) {
        Set<Window> windows = new HashSet<>();
        windows.add(new Window(10, 12, 14, "прозрачный"));
        windows.add(new Window(10, 12, 14, "тонированный"));
        windows.add(new Window(10, 12, 14, "прозрачный"));
        windows.add(new Window(10, 13, 3, "тонированный"));


        for (Window window : windows) {
        }
        System.out.println(windows);
    }
}
