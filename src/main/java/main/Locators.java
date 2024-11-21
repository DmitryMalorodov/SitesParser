package main;

import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.List;
import java.util.stream.Collectors;

public class Locators extends Connect {
    private static final String bids = "//div[contains(@class, 'bid innerContainer')]";
    private static final String asks = "//div[contains(@class, 'ask innerContainer')]";
    private static final String exchangeNames = "//div[@class='topBox']/a";

    public List<String> getBids() {
        Elements elements = document.selectXpath(bids);
        return elements.stream().map(Element::text).collect(Collectors.toList());
    }

    public List<String> getAsks() {
        Elements elements = document.selectXpath(asks);
        return elements.stream().map(Element::text).collect(Collectors.toList());
    }

    public List<String> getExchangeNames() {
        Elements elements = document.selectXpath(exchangeNames);
        return elements.stream().map(Element::text).collect(Collectors.toList());
    }
}
