package main.model.currency;

import main.model.Helper;

import java.util.List;

/**
 * Класс для парсинга с сайта ru.investing.com и вывода информации
 */
public class Currency {
    private static final CurrencyParser parser = new CurrencyParser();

    private List<String> bids;
    private List<String> asks;
    private List<String> exchangeNames;
    private List<String> dayDiffs;
    private List<String> dayDifPercents;
    private List<String> difTime;
    private String currentData;

    public void run() {
        init();

        for (int i = 0; i < bids.size(); i++) {
            System.out.println(exchangeNames.get(i) + ", " + currentData);
            System.out.println("Last dif time - " + difTime.get(i));
            System.out.println("Bid = " + bids.get(i) + ", Ask = " + asks.get(i));
            System.out.println("Dif = " + dayDiffs.get(i) + ", Per = " + dayDifPercents.get(i));
            System.out.println();
        }
    }

    private void init() {
        bids = parser.getBids();
        asks = parser.getAsks();
        exchangeNames = parser.getExchangeNames();
        dayDiffs = parser.getDayDiffs();
        dayDifPercents = parser.getDayDifPercents();
        difTime = parser.getDifTime();
        currentData = Helper.getCurrentData();
    }
}
