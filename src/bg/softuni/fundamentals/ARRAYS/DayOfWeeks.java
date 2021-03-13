package bg.softuni.fundamentals.ARRAYS;

import java.util.Scanner;

public class DayOfWeeks {
    public static void main(String[] args) {
        //   Scanner scanner = new Scanner(System.in); курсор върху scanner + CTRL+LAT+n
        //вкараваме скенера директно в променливата(използва се, ако няма да въвеждаме повече от конзолата
        String[] dayOfWeek = new String[]{"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        int day = new Scanner(System.in).nextInt();
        if (1 <= day && day <= 7) {
            System.out.println(dayOfWeek[day - 1]);
        }else {
            System.out.println("Invalid day!");
        }
    }
}
