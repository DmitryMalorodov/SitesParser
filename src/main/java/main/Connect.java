package main;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

public class Connect {
    private static final String url = "https://ru.investing.com/currencies/live-currency-cross-rates";
    protected Document document = setUp();

    public Document setUp() {
        try {
            return document = Jsoup.connect(url).get();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
