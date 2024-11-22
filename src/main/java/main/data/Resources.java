package main.data;

public enum Resources {
    INVESTING("https://ru.investing.com/currencies/live-currency-cross-rates");

    Resources(String url) {
        this.url = url;
    }

    private final String url;

    public String getUrl() {
        return url;
    }
}
