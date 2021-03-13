package bg.softuni.fundamentals.LABS;

import java.io.PrintStream;
import java.util.Scanner;

public class CenturiesToMinutes {
    public static void main(String[] args) {
/*Write program to enter an integer number of centuries and convert it to years, days, hours and minutes.*/
        Scanner scanner = new Scanner(System.in);
        int centuries = Integer.parseInt(scanner.nextLine());
        //1 year -> 365.2422 days
        //i centure = 100 years; 1 day = 24 hours; 1 hour = 60 minutes

        int years = centuries*100;
        int days = (int)(365.2422*years);
        int hours = days*24;
        int minutes = hours*60;
        System.out.printf("%d centuries = %d years = %d days = %d hours = %d minutes",centuries,years,days,hours,minutes);
    }
}
