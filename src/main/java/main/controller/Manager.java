package main.controller;

import main.data.Resources;
import main.model.investing.Currency;

/**
 * Класс для управления с какого сайта будем запускать парсинг
 */
public class Manager {

    public void manage(Resources resource) {
        if (resource.equals(Resources.CURRENCY)) {
            new Currency().run();
        }
    }
}
