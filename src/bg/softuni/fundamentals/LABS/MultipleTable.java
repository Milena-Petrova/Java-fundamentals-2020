package bg.softuni.fundamentals.LABS;

import java.util.Scanner;

public class MultipleTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int i = Integer.parseInt(scanner.nextLine());
        int multiplication;
        if (i > 10) {
            System.out.printf("%d X %d = %d%n", n, i, n * i);
        } else {
            while (i <= 10) {
                multiplication = n * i;
                System.out.printf("%d X %d = %d%n", n, i, multiplication);
                i++;
            }

        }
    }
}

