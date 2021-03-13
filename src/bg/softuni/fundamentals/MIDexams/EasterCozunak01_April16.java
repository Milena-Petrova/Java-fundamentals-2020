package bg.softuni.fundamentals.MIDexams;

import java.util.Scanner;

public class EasterCozunak01_April16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        double floorPrice = Double.parseDouble(scanner.nextLine());
        double kozunakPrice = getCozunakPrice(floorPrice);
        int countCozunaks =0; int countColorEggs =0;
        while (budget>kozunakPrice) {
            budget -= kozunakPrice;
            countCozunaks++;
            countColorEggs += 3;
            if (countCozunaks % 3 == 0) {
                countColorEggs = countColorEggs - (countCozunaks - 2);
            }
        }
        System.out.printf("You made %d cozonacs! Now you have %d eggs and %.2fBGN left.",countCozunaks,countColorEggs,budget);
    }
    private static double getCozunakPrice(double floorPrice) {
        double eggsPrice = 0.75*floorPrice;
        double milkPrice = 1.25*floorPrice*0.25;//250ml
        double cozunakPrice = floorPrice+eggsPrice+milkPrice;
        return cozunakPrice;
    }
}
