package de.telran.baibak.iryna.homework10.task2;

import java.util.Comparator;

public class PriceAdsComparator implements Comparator<Ad> {
    @Override
    public int compare(Ad ad1, Ad ad2) {
        return ad1.getPrice() - ad2.getPrice();
    }
}
