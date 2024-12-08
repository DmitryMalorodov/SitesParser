package main.data;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public enum Resources {
    CURRENCY("CURRENCY", "https://ru.investing.com/currencies/live-currency-cross-rates"),
    COMMODITY("COMMODITY", "https://tradingeconomics.com/commodities");

    Resources(String name ,String url) {
        this.name = name;
        this.url = url;
    }

    private final String name;
    private final String url;

    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }

    public static List<String> getNames() {
        return Arrays.stream(values()).map(Resources::getName).collect(Collectors.toList());
    }
}
