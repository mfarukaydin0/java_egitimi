package basics;

import java.util.Date;
import java.text.SimpleDateFormat;

public class DateTime {
    public static void main(String[] args) {

        // getting the current date and time
        Date date = new Date();
        System.out.println("Current date and time: " + date.toString());

        // formatting the date using SimpleDateFormat
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        System.out.println("Formatted date: " + formatter.format(date));
    }
}