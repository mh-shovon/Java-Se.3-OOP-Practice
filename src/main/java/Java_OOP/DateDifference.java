package Java_OOP;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDifference {
    public static void main(String[] args) throws ParseException {
        String thatDay1 = "15/02/1995 12:00:00 AM";
        //String thatDay2 = "07/11/1996 12:00:00 AM";
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyy hh:mm:ss aa");
        Date date1 = formatter.parse(thatDay1);
        //Date date2 = formatter.parse(thatDay2);
        Date date2 = new Date();
        long d = date2.getTime() - date1.getTime();
        long year = d / (1000L * 60 * 60 * 24 * 365);
        long day = d / (1000 * 60 * 60 * 24) % 365;
        long hour = (d / (1000 * 60 * 60)) % 24;
        long minutes = (d / (1000 * 60)) % 60;
        long second = (d / 1000) % 60;

        System.out.println("Year " + year);
        System.out.println("Day " + day);
        System.out.println("Hour " + hour);
        System.out.println("Minute " + minutes);
        System.out.println("Second " + second);
//        Year 25
//        Day 296
//        Hour 21
//        Minute 45
//        Second 58
    }
}
