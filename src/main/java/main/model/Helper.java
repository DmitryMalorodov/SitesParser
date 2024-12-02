package main.model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Helper {

    public static String getCurrentData() {
        return new SimpleDateFormat("dd/MM/yyyy").format(new Date());
    }
}
