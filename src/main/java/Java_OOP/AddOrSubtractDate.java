package Java_OOP;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class AddOrSubtractDate {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println("Today is : " + date);

        Calendar calender = Calendar.getInstance();
        calender.setTime(date);

        calender.add(Calendar.YEAR,1);
        calender.add(Calendar.DATE,1);
        calender.add(Calendar.MONTH,4);

        System.out.println("New date is : " + calender.getTime());
    }
}
