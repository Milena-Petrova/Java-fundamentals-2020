package bg.softuni.fundamentals.METHODS;

import java.util.Scanner;

public class SmallestOfTheThreeNumbersEX {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());
        int thirdNumber = Integer.parseInt(scanner.nextLine());

        int smallerFirst = findSmallerNumber(firstNumber, secondNumber);
        int smallestNumber = findSmallerNumber(smallerFirst,thirdNumber);
        System.out.println(smallestNumber);
    }

    public static int findSmallerNumber(int a, int b) {
        if (a < b) {
            return a;
        }
        return b;
    }
}
