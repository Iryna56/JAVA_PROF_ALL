package de.telran.baibak.iryna.homework3.task3;

import java.util.Arrays;

public class EnumDayOfTheWeekDetector {
    public static void main(String[] args) {
        DayOfTheWeek[] dayOfTheWeeks = DayOfTheWeek.values();
        for (int i = 0; i < dayOfTheWeeks.length; i++) {
            System.out.print(dayOfTheWeeks[i].ordinal() + 1 + ".");
            System.out.println(dayOfTheWeeks[i]);
        }
        System.out.println(Arrays.toString(dayOfTheWeeks));
        System.out.print(DayOfTheWeek.MONDAY.name() + " ");
        System.out.print(DayOfTheWeek.TUESDAY.name() + " ");
        System.out.print(DayOfTheWeek.WEDNESDAY.name() + " ");
        System.out.print(DayOfTheWeek.THURSDAY.name() + " ");
        System.out.print(DayOfTheWeek.FRIDAY.name() + " ");
        System.out.print(DayOfTheWeek.SATURDAY.name() + " ");
        System.out.println(DayOfTheWeek.SUNDAY.name() + " ");
        String monday = DayOfTheWeek.MONDAY.toString();
        System.out.print(monday + " ");
        String tuesday = DayOfTheWeek.TUESDAY.toString();
        System.out.print(tuesday + " ");
        String wednesday = DayOfTheWeek.WEDNESDAY.toString();
        System.out.print(wednesday + " ");
        String thursday = DayOfTheWeek.THURSDAY.toString();
        System.out.print(thursday + " ");
        String friday = DayOfTheWeek.FRIDAY.toString();
        System.out.print(friday + " ");
        String saturday = DayOfTheWeek.SATURDAY.toString();
        System.out.print(saturday + " ");
        String sunday = DayOfTheWeek.SUNDAY.toString();
        System.out.print(sunday + " ");


    }

}
