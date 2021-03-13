package bg.softuni.fundamentals.LABS;

import java.util.Scanner;

public class OddDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int oddDigit = 0;//oddDigit
        int countOdd = 0;//number of odd digits
        while (countOdd < n) {
            oddDigit++;
            if (oddDigit % 2 == 1) {//if it's odd digit -> print and count it
                countOdd++;
                System.out.println(oddDigit);
                sum += oddDigit;
            }
        }
                System.out.printf("Sum: %d",sum);
        }
    }
