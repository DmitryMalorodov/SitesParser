package main.model.currency;

import java.util.List;

/**
 * Класс для вывода информации в консоль
 */
public class CurrencyPrint {
    private static final CurrencyParser parser = new CurrencyParser();

    public void run(String currencyForFilter) {
        List<Currency> currencies;
        if (!currencyForFilter.isEmpty()) {
            currencies = CurrencyFilter.filterByCurrency(currencyForFilter, parser.createListOfCurrencies());
        } else {
            currencies = parser.createListOfCurrencies();
        }

        for (Currency currency : currencies) {
            System.out.println(currency.getCurrencyNames() + ", " + currency.getCurrentData());
            System.out.println("Last dif time - " + currency.getDifTime());
            System.out.println("Bid = " + currency.getBids() + ", Ask = " + currency.getAsks());
            System.out.println("Dif = " + currency.getDayDiffs() + ", Per = " + currency.getDayDifPercents());
            System.out.println();
        }
    }
}
