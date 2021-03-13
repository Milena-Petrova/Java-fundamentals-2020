package bg.softuni.fundamentals.LABS;

import java.util.Scanner;

public class TheatrePromo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String day = scanner.nextLine().toLowerCase();//convert input data into lower or upper case to avoid mistakes
        int age = Integer.parseInt(scanner.nextLine());
        int price;
        switch (day) {
            case "weekday":
                if (0 <= age && age <= 18) {
                    price = 12;
                } else if (18 < age && age <= 64) {
                    price = 18;
                } else if (64 < age && age <= 122) {
                    price = 12;
                } else {
                    price = -1;
                }
                break;
            case "weekend":
                if (0 <= age && age <= 18) {
                    price = 15;
                } else if (18 < age && age <= 64) {
                    price = 20;
                } else if (64 < age && age <= 122) {
                    price = 15;
                } else {
                    price = -1;
                }
                break;
            case "holiday":
                if (0 <= age && age <= 18) {
                    price = 5;
                } else if (18 < age && age <= 64) {
                    price = 12;
                } else if (64 < age && age <= 122) {
                    price = 10;
                } else {
                    price = -1;
                }
                break;
            default:
                price = -1;
                break;
        }
        if (price != -1) {
            System.out.printf("%d$", price);
        } else {
            System.out.println("Error!");
        }
    }
}
