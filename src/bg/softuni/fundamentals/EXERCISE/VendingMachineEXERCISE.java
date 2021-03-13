package bg.softuni.fundamentals.EXERCISE;

import java.util.Scanner;
//Your vending machine only works with 0.1, 0.2, 0.5, 1, and 2 coins
//"Nuts", "Water", "Crisps", "Soda", "Coke".
//The prices are: 2.0, 0.7, 1.5, 0.8, 1.0
public class VendingMachineEXERCISE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        double money = 0;
        while (!input.equals("Start")) {
            double currentInput = Double.parseDouble(input);
            if (currentInput == 0.1 || currentInput == 0.2 || currentInput == 0.5 || currentInput == 1 || currentInput == 2) {
                money += currentInput;
            } else {
                System.out.printf("Cannot accept %.2f%n", currentInput);
            }
            input = scanner.nextLine();
        }
        input = scanner.nextLine();
        while (!input.equals("End")) {
            //  amount+=price;
            switch (input) {
                case "Nuts":
                    if (money >= 2.0) {
                        money -= 2.0;
                        System.out.println("Purchased Nuts");
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Water":
                    if (money >= 0.7) {
                        money -= 0.7;
                        System.out.println("Purchased Water");
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Crisps":
                    if (money >= 1.5) {
                        money -= 1.5;
                        System.out.println("Purchased Crisps");
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Soda":
                    if (money >= 0.8) {
                        money -= 0.8;
                        System.out.println("Purchased Soda");
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Coke":
                    if (money >= 1.0) {
                        money -= 1.0;
                        System.out.println("Purchased Coke");
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                default:
                    System.out.println("Invalid product");
                    break;
            }
            input = scanner.nextLine();
        }
            System.out.printf("Change: %.2f",money);
        }

    }
