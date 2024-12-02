package main.data;

public enum Resources {
    CURRENCY("https://ru.investing.com/currencies/live-currency-cross-rates"),
    COMMODITY("https://tradingeconomics.com/commodities");

    Resources(String url) {
        this.url = url;
    }

    private final String url;

    public String getUrl() {
        return url;
    }
}
