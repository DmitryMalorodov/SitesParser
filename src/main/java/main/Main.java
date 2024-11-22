package main;

import main.controller.Manager;
import main.data.Resources;

public class Main {
    public static void main(String[] args) {
        new Manager().manage(Resources.INVESTING);
    }
}