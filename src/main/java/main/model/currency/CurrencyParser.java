package main.model.currency;

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
    private static final String dayDif = "//div[@class='change genToolTip']/span[1]";
    private static final String dayDifPercents = "//span[contains(@class, 'pcp')]";
    private static final String exchangeNames = "//div[@class='topBox']/a";
    private static final String difTime = "//div[@class='topBox']/span";

    public List<String> getBids() {
        Elements elements = document.selectXpath(bids);
        return elements.stream().map(Element::text).collect(Collectors.toList());
    }

    public List<String> getAsks() {
        Elements elements = document.selectXpath(asks);
        return elements.stream().map(Element::text).collect(Collectors.toList());
    }

    public List<String> getDayDiffs() {
        Elements elements = document.selectXpath(dayDif);
        return elements.stream().map(Element::text).collect(Collectors.toList());
    }

    public List<String> getDayDifPercents() {
        Elements elements = document.selectXpath(dayDifPercents);
        return elements.stream().map(Element::text).collect(Collectors.toList());
    }

    public List<String> getExchangeNames() {
        Elements elements = document.selectXpath(exchangeNames);
        return elements.stream().map(Element::text).collect(Collectors.toList());
    }

    public List<String> getDifTime() {
        Elements elements = document.selectXpath(difTime);
        return elements.stream().map(Element::text).collect(Collectors.toList());
    }
}
