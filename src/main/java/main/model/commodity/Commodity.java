package main.model.commodity;

import java.util.List;

public class Commodity {
    private static final CommodityParse parser = new CommodityParse();

    public void run() {
        List<String> names = parser.getNames();
        List<String> prices = parser.getPrices();
        List<String> dayDiffs = parser.getDayDiffs();
        List<String> dayDiffsPercents = parser.getDayDiffsPercents();

        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i) + ", price = " + prices.get(i));
            System.out.println("Day difference = " + dayDiffs.get(i));
            System.out.println("Day difference percents = " + dayDiffsPercents.get(i));
            System.out.println();
        }
    }
}
