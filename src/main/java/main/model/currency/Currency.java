package main.model.currency;

import java.util.List;

/**
 * Класс для парсинга с сайта ru.investing.com и вывода информации
 */
public class Currency {
    private static final CurrencyParser parser = new CurrencyParser();

    public void run() {
        List<String> bids = parser.getBids();
        List<String> asks = parser.getAsks();
        List<String> exchangeNames = parser.getExchangeNames();
        List<String> differences = parser.getDifferences();
        List<String> percents = parser.getPercents();

        for (int i = 0; i < bids.size(); i++) {
            System.out.println(exchangeNames.get(i));
            System.out.println("Bid = " + bids.get(i) + ", Ask = " + asks.get(i));
            System.out.println("Dif = " + differences.get(i) + ", Per = " + percents.get(i));
            System.out.println();
        }
    }
}
