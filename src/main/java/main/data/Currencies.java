package main.data;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public enum Currencies {
    RUB("RUB"),
    USD("USD"),
    EUR("EUR"),
    GBP("GBP"),
    JPY("JPY"),
    AUD("AUD"),
    TRY("TRY"),
    BTC("BTC"),
    ETH("ETH"),
    CHF("CHF"),
    CAD("CAD"),
    NZD("NZD"),
    BRL("BRL"),
    XAU("XAU"),
    XAG("XAG"),
    ALL("ALL", "Все валюты");

    Currencies(String name) {
        this.name = name;
    }

    Currencies(String name, String description) {
        this.name = name;
        this.description = description;
    }

    private final String name;
    private String description;

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public static List<String> getNames() {
        return Arrays.stream(values()).map(Currencies::getName).collect(Collectors.toList());
    }
}
