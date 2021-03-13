package bg.softuni.fundamentals.EXERCISE;

import java.util.Scanner;

public class DivisionEXERCISE {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                int n = Integer.parseInt(scanner.nextLine());
                int x;
                //n / 2, 3, 5
                if (n % 2 == 0) {
                    x = 2;
                    if (n % 3 == 0) {
                        x = 6;
                    }
                    if (n % 7 == 0) {
                        x = 7;
                    }
                    if (n % 5 == 0) {
                        x = 10;
                    }
                    System.out.printf("The number is divisible by %d", x);
                } else if (n % 3 == 0) {
                    x = 3;
                    if (n % 7 == 0) {
                        x = 7;
                    }
                    System.out.printf("The number is divisible by %d", x);
                } else if (n % 7 == 0) {
                    x = 7;
                    System.out.printf("The number is divisible by %d", x);
                } else {
                    System.out.println("Not divisible");
                }
            }
        }

