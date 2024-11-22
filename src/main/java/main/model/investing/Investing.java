package main.model.investing;

import main.data.Resources;
import main.model.Connector;

import java.util.List;

/**
 * Класс для парсинга с сайта ru.investing.com
 */
public class Investing {
    private static final InvestParser parser = new InvestParser();

    public void run() {
        Connector.connect(Resources.INVESTING.getUrl());

        List<String> bids = parser.getBids();
        List<String> asks = parser.getAsks();
        List<String> exchangeNames = parser.getExchangeNames();
        List<String> differences = parser.getDifferences();
        List<String> percents = parser.getPercents();

        for (int i = 0; i < bids.size(); i++) {
            System.out.println(exchangeNames.get(i));
            System.out.println("Bid = " + bids.get(i) + ", Ask = " + asks.get(i));
            System.out.println("Dif = " + differences.get(i) + ", Per = " + percents.get(i));
        }
    }
}
