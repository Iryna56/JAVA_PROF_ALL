package de.telran.baibak.iryna.homework10.task2;

import java.util.*;

public class Newspaper {
    public static void main(String[] args) {
        List<Ad> adList = new ArrayList<>();
        adList.add(new Ad(10, "JHGF", "cat", "gogol", 2021));
        adList.add(new Ad(11, "jhgjgd", "dog", "ivanov", 2022));
        adList.add(new Ad(3, "nvdshc", "sheep", "petrov", 2019));
        adList.add(new Ad(5, "oiwuro", "red", "sidorov", 2019));
        adList.add(new Ad(17, "nbzvd", "white", "pupkin", 2018));
        adList.add(new Ad(19, "jhbf", "black", "bulgakov", 2022));
        adList.add(new Ad(7, "lak", "blue", "shevchenko", 2017));
        adList.add(new Ad(18, "o3iue", "yellow", "dostoevski", 2018));
        adList.add(new Ad(13, "zmnx", "grey", "tolstoy", 2016));
        adList.add(new Ad(11, "o3i", "brown", "lermontov", 2016));

        Comparator<Ad> sortList = new FullComparatorAds();
        Collections.sort(adList, sortList);
        System.out.println(adList);








    }
}
