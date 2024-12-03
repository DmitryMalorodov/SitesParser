package main.model.currency;

import java.util.List;

/**
 * Класс для парсинга с сайта ru.investing.com и вывода информации
 */
public class CurrencyPrint {
    private static final CurrencyParser parser = new CurrencyParser();

    public void run(String currencyForFilter) {
        List<Currency> currencies = getFinalList(currencyForFilter);

        for (Currency currency : currencies) {
            System.out.println(currency.getExchangeNames() + ", " + currency.getCurrentData());
            System.out.println("Last dif time - " + currency.getDifTime());
            System.out.println("Bid = " + currency.getBids() + ", Ask = " + currency.getAsks());
            System.out.println("Dif = " + currency.getDayDiffs() + ", Per = " + currency.getDayDifPercents());
            System.out.println();
        }
    }

    private List<Currency> getFinalList(String currencyForFilter) {
        if (currencyForFilter.isEmpty()) {
            return parser.createListOfCurrencies();
        } else {
            return parser.createListOfCurrencies().stream()
                    .filter(x -> x.getExchangeNames().contains(currencyForFilter))
                    .toList();
        }
    }
}
