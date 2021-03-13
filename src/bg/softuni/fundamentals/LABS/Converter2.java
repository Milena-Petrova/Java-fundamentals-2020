package bg.softuni.fundamentals.LABS;

import java.util.Scanner;

public class Converter2 {//не печати до третия знак, както е по условие, има нужда от корекция на кода
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double input = Double.parseDouble(scanner.nextLine());
        int pennies = (int)(100*input);//penies
        double cents = 1.31*pennies;
        int wholeUsd = (int)(cents/100);
        int wholecents = (int)(cents*10%100);

        System.out.printf("%02d.%02d",wholeUsd,wholecents);

    }
}
