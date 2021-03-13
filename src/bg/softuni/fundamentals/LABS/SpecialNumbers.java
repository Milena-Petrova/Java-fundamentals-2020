package bg.softuni.fundamentals.LABS;

import java.util.Scanner;

public class SpecialNumbers {
    public static void main(String[] args) {
        /*A number is special when its sum of digits is 5, 7 or 11.
        Write a program to read an integer n and for all numbers in the range 1…n to print the number
         and if it is special or not (True / False).
         */
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            int num = i;
            int sumOfDigits =0;
            //num%10 ->last digit;
            while (num>0){
                sumOfDigits+=num%10;
                num=num/10;
            }
            if(sumOfDigits==5||sumOfDigits==7||sumOfDigits==11){
                System.out.println(i+" -> True");
            }else{
                System.out.println(i+" -> False");
            }
        }

    }
}
