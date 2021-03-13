package bg.softuni.fundamentals.LABS;

import java.util.Scanner;

public class ConvertMetersToKm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());
        double km =input/1000.0;

        System.out.printf("%.2f",km);
    }
}
