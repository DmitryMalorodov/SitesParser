package main.controller;

import main.data.Resources;
import main.model.Connector;
import main.model.Helper;
import main.model.commodity.Commodity;
import main.model.currency.CurrencyPrint;

/**
 * Класс для управления с какого сайта будем запускать парсинг и подключение к нему
 */
public class Manager {

    public void manage(Resources resource) {
        switch (resource) {
            case CURRENCY -> {
                Connector.connect(Resources.CURRENCY.getUrl());
                new CurrencyPrint().run(Helper.keyboardIn());
            }
            case COMMODITY -> {
                Connector.connect(Resources.COMMODITY.getUrl());
                new Commodity().run();
            }
        }
    }
}
