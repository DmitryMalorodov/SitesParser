package main.model;

import main.data.Resources;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Helper {

    public static String getCurrentData() {
        return new SimpleDateFormat("dd/MM/yyyy").format(new Date());
    }

    public static String typeServiceName() {
        List<String> serviceNames = Resources.getNames();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Enter name of a service: " + serviceNames);
            String service = reader.readLine().toUpperCase();
            while (!serviceNames.contains(service)) {
                System.out.println("Not correct service name. Examples: " + serviceNames);
                service = reader.readLine().toUpperCase();
            }
            return service;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
