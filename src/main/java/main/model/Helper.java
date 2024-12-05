package main.model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Helper {

    public static String getCurrentData() {
        return new SimpleDateFormat("dd/MM/yyyy").format(new Date());
    }

    public static String keyboardIn() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Enter the name of a currency please...");
            String currency = reader.readLine();
            while (!currency.matches("[a-zA-Z]+")) {
                System.out.println("Incorrect currency name. Example: USD, RUB, EUR...");
                currency = reader.readLine();
            }
            return currency;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
