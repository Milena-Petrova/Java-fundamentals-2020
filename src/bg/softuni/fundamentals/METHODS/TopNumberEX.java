package bg.softuni.fundamentals.METHODS;

import java.util.Scanner;

public class TopNumberEX {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= n; i++) {
            if (checkIfConsistOdddigit(i) && checkSumDigitsDivideToEight(i)) {
                System.out.println(i);
            }
        }
    }

    private static boolean checkSumDigitsDivideToEight(int num) {
        int sumDigits = 0;
            while (num > 0) {
                sumDigits += num % 10;
                num /= 10;
            }
            if (sumDigits % 8 == 0) {
                return true;
            }
        return false;
    }

    private static boolean checkIfConsistOdddigit(int num) {
            int countOdd = 0;
            while (num > 0) {
                if ((num % 10)%2 == 1) {
                    countOdd++;
                }
                num /= 10;
            }
            if (countOdd >= 1) {
                return true;
            }
        return false;
    }
}






