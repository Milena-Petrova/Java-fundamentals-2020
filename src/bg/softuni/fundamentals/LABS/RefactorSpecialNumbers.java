package bg.softuni.fundamentals.LABS;

import java.util.Scanner;

public class RefactorSpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());
            for (int i = 1; i <= input; i++) {
            int number = i;
            int sumDigits=0;
            while (number > 0) {
                sumDigits += number % 10;
                number = number / 10;
            }
            if((sumDigits == 5) || (sumDigits == 7) || (sumDigits == 11)){
                    System.out.printf("%d -> True%n", i);
                }else{
                System.out.printf("%d -> False%n",i);
            }
        }

    }
}
