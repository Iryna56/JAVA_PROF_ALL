package de.telran.baibak.iryna.homework6.task5;

import de.telran.baibak.iryna.cw1.Cat;

import java.util.ArrayList;
import java.util.List;

public class Products {


    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("мяч");
        list.add("скакалка");
        list.add("велосипед");
        list.add("карандаш");
        list.add("мяч");
        list.add("ручка");
        list.add("мяч");
        list.add("ножницы");
        list.add("тетрадь");
        list.add("мяч");
        System.out.println(list);
        removeBall(list);
        System.out.println(list);

    }
       public static void removeBall(List<String> list) {
        for (int i = 1; i < list.size(); i++) {
            if (list.contains("мяч")) {
                list.remove("мяч");
            }


    }

        }
    }

