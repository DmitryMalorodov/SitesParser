package main.model.currency;

import java.util.List;

/**
 * Класс фильтрации данных
 */
public class CurrencyFilter {

    public static List<Currency> filterByCurrency(String currencyForFilter, List<Currency> currencies) {
        return currencies.stream()
                .filter(x -> x.getCurrencyNames().contains(currencyForFilter.toUpperCase()))
                .toList();
    }
}
