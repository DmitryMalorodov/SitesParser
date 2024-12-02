package main.model.commodity;

import main.model.Helper;

import java.util.List;

/**
 * Класс для парсинга с сайта tradingeconomics.com и вывода информации
 */
public class Commodity {
    private static final CommodityParse parser = new CommodityParse();

    private List<String> names;
    private List<String> prices;
    private List<String> dayDiffs;
    private List<String> dayDiffsPercents;
    private List<String> difTime;
    private String currentData;

    public void run() {
        init();

        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i) + ", " + currentData);
            System.out.println("Price = " + prices.get(i));
            System.out.println("Day difference = " + dayDiffs.get(i));
            System.out.println("Day difference percents = " + dayDiffsPercents.get(i));
            System.out.println("Last dif time = " + difTime.get(i));
            System.out.println();
        }
    }

    private void init() {
        names = parser.getNames();
        prices = parser.getPrices();
        dayDiffs = parser.getDayDiffs();
        dayDiffsPercents = parser.getDayDiffsPercents();
        difTime = parser.getDifTime();
        currentData = Helper.getCurrentData();
    }
}
