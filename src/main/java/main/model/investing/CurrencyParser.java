package main.model.investing;

import main.model.Connector;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Класс реализации парсинга с сайта ru.investing.com
 */
public class CurrencyParser extends Connector {
    private static final String bids = "//div[contains(@class, 'bid innerContainer')]";
    private static final String asks = "//div[contains(@class, 'ask innerContainer')]";
    private static final String differences = "//div[@class='change genToolTip']/span[1]";
    private static final String percents = "//span[contains(@class, 'pcp')]";
    private static final String exchangeNames = "//div[@class='topBox']/a";

    public List<String> getBids() {
        Elements elements = document.selectXpath(bids);
        return elements.stream().map(Element::text).collect(Collectors.toList());
    }

    public List<String> getAsks() {
        Elements elements = document.selectXpath(asks);
        return elements.stream().map(Element::text).collect(Collectors.toList());
    }

    public List<String> getDifferences() {
        Elements elements = document.selectXpath(differences);
        return elements.stream().map(Element::text).collect(Collectors.toList());
    }

    public List<String> getPercents() {
        Elements elements = document.selectXpath(percents);
        return elements.stream().map(Element::text).collect(Collectors.toList());
    }

    public List<String> getExchangeNames() {
        Elements elements = document.selectXpath(exchangeNames);
        return elements.stream().map(Element::text).collect(Collectors.toList());
    }
}
