package de.telran.baibak.iryna.homework10.task2;


import java.util.Comparator;

public class FullComparatorAds implements Comparator<Ad> {


    @Override
    public int compare(Ad ad1, Ad ad2) {
        Comparator<Ad> comp = new YearAdsComparator()
                .thenComparing(new NameAdsComparator())
                .thenComparing(new AuthorAdsComparator())
                .thenComparing(new PriceAdsComparator())
                .thenComparing(new DescriptionAdsComparator());
        return comp.compare(ad1, ad2);
    }
}
