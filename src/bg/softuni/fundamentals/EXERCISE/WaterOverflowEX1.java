package bg.softuni.fundamentals.EXERCISE;

import java.util.Scanner;

public class WaterOverflowEX1 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = Integer.parseInt(scanner.nextLine());
            int totalLitres=0;
        for (int i = 0; i < n ; i++) {
            int currentLitters = Integer.parseInt(scanner.nextLine());
            if (totalLitres + currentLitters > 255) {
                System.out.println("Insufficient capacity!");
            } else {
                totalLitres += currentLitters;
            }
        }
            System.out.println(totalLitres);
        }
    }
