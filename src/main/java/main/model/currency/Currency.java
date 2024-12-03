package main.model.currency;

public class Currency {
    private final String bids;
    private final String asks;
    private final String exchangeNames;
    private final String dayDiffs;
    private final String dayDifPercents;
    private final String difTime;
    private final String currentData;

    public Currency(String bids, String asks, String exchangeNames, String dayDiffs, String dayDifPercents, String difTime, String currentData) {
        this.bids = bids;
        this.asks = asks;
        this.exchangeNames = exchangeNames;
        this.dayDiffs = dayDiffs;
        this.dayDifPercents = dayDifPercents;
        this.difTime = difTime;
        this.currentData = currentData;
    }

    public String getBids() {
        return bids;
    }

    public String getAsks() {
        return asks;
    }

    public String getExchangeNames() {
        return exchangeNames;
    }

    public String getDayDiffs() {
        return dayDiffs;
    }

    public String getDayDifPercents() {
        return dayDifPercents;
    }

    public String getDifTime() {
        return difTime;
    }

    public String getCurrentData() {
        return currentData;
    }
}
