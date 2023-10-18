package de.telran.baibak.iryna.homework3.task2;

import de.telran.baibak.iryna.cw1.Scanner;

import java.util.Random;

public class DetektorTest {
    public static void main(String[] args) {
        DayOfTheWeekDetector detector = new DayOfTheWeekDetectorIfVersion();
        System.out.println(detector.detectDayName(3));
        System.out.println(detector.detectDayName(new Random().nextInt(1, 8)));

    }
}
