package main.model.commodity;

import main.model.Connector;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Класс реализации парсинга с сайта tradingeconomics.com
 */
public class CommodityParse extends Connector {
    private static final String commodityNames = "//td[@class='datatable-item-first']//b";
    private static final String prices = "//td[@class='datatable-item-first']//..//td[@id='p']";
    private static final String dayDif = "//td[@class='datatable-item-first']//..//td[@id='nch']";
    private static final String dayDifPercents = "//td[@class='datatable-item-first']//..//td[@id='pch']";
    private static final String difTime = "//td[@class='datatable-item-first']//..//td[@id='date']";

    public List<String> getNames() {
        Elements elements = document.selectXpath(commodityNames);
        return elements.stream().map(Element::text).collect(Collectors.toList());
    }

    public List<String> getPrices() {
        Elements elements = document.selectXpath(prices);
        return elements.stream().map(Element::text).collect(Collectors.toList());
    }

    public List<String> getDayDiffs() {
        Elements elements = document.selectXpath(dayDif);
        return elements.stream().map(Element::text).collect(Collectors.toList());
    }

    public List<String> getDayDiffsPercents() {
        Elements elements = document.selectXpath(dayDifPercents);
        return elements.stream().map(Element::text).collect(Collectors.toList());
    }

    public List<String> getDifTime() {
        Elements elements = document.selectXpath(difTime);
        return elements.stream().map(Element::text).collect(Collectors.toList());
    }
}
