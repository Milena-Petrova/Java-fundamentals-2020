package bg.softuni.fundamentals.METHODS;

import java.util.Scanner;

public class MultiplyEvenOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());
        System.out.println(getMultiplyEvensumToOddsum(input));
    }
    private static int getMultiplyEvensumToOddsum(int number) {
    int evenSum = getEvenSum(number);
    int oddSum = getOddSum(number);
        return evenSum*oddSum;
    }
    private static int getEvenSum(int number) {
        int evenSum =0;
        while(Math.abs(number)>0){
         int digit = Math.abs(number%10);
         if(digit%2==0) {
             evenSum += digit;
         }
         number = number/10;
        }
        return evenSum;
    }
    private static int getOddSum(int number) {
        int oddSum = 0;
        while (Math.abs(number) > 0) {
            int digit = Math.abs(number % 10);
            if (digit % 2 == 1) {
                oddSum += digit;
            }
            number = number / 10;
        }
        return oddSum;
    }


}
