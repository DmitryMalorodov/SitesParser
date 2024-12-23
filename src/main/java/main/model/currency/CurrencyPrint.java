package main.model.currency;

import main.data.Currencies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

/**
 * Класс для ввода и вывода информации в консоль
 */
public class CurrencyPrint {
    private static final CurrencyParser parser = new CurrencyParser();

    public void run() {
        String currencyForFilter = typeCurrencyName();

        //подготовка данных к выводу
        List<Currency> currencies;
        if (!currencyForFilter.equals(Currencies.ALL.getName())) {
            currencies = CurrencyFilter.filterByCurrency(currencyForFilter, parser.createListOfCurrencies());
        } else {
            currencies = parser.createListOfCurrencies();
        }

        //вывод в консоль
        for (Currency currency : currencies) {
            System.out.println(currency.getCurrencyNames() + ", " + currency.getCurrentData());
            System.out.println("Last time of changes - " + currency.getDifTime());
            System.out.println("Bid = " + currency.getBids() + ", Ask = " + currency.getAsks());
            System.out.println("Dif = " + currency.getDayDiffs() + ", Per = " + currency.getDayDifPercents());
            System.out.println();
        }
    }

    //ввод в консоль имени валюты и валидация ввода
    private String typeCurrencyName() {
        List<String> currencyNames = Currencies.getNames();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Enter name of a currency or enter 'ALL' if have to see all currencies. " + currencyNames);
            String currency = reader.readLine().toUpperCase();
            while (!currencyNames.contains(currency)) {
                System.out.println("Not correct currency name. Examples: " + currencyNames);
                currency = reader.readLine().toUpperCase();
            }
            return currency;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
