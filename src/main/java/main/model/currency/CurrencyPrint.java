package main.model.currency;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

/**
 * Класс для вывода информации в консоль
 */
public class CurrencyPrint {
    private static final CurrencyParser parser = new CurrencyParser();

    public void run() {
        String currencyForFilter = typeCurrencyName();

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

    private String typeCurrencyName() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Enter the name of a currency please...");
            String currency = reader.readLine();
            while (!currency.matches("[a-zA-Z]+")) {
                System.out.println("Incorrect currency name. Example: USD, RUB, EUR...");
                currency = reader.readLine();
            }
            return currency;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
