package main.controller;

import main.data.Resources;
import main.model.investing.Investing;

/**
 * Класс для управления с какого сайта будем запускать парсинг
 */
public class Manager {

    public void manage(Resources resource) {
        if (resource.equals(Resources.INVESTING)) {
            new Investing().run();
        }
    }
}
