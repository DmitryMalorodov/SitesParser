package main;

import java.util.List;

public class Main {
    private static final Locators locators = new Locators();

    public static void main(String[] args) {
        List<String> bids = locators.getBids();
        List<String> asks = locators.getAsks();
        List<String> exchangeNames = locators.getExchangeNames();

        for (int i = 0; i < bids.size(); i++) {
            System.out.println(exchangeNames.get(i));
            System.out.println("Bid = " + bids.get(i) + ", Ask = " + asks.get(i));
        }
    }
}