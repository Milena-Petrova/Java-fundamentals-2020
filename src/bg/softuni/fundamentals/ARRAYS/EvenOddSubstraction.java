package bg.softuni.fundamentals.ARRAYS;

import java.util.Scanner;

public class EvenOddSubstraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[]line = scanner.nextLine().split(" ");
        int[]numbers = new int[line.length];

        for (int i = 0; i < numbers.length ; i++) {
            numbers[i] = Integer.parseInt(line[i]);//стойността на числото е парсната стойност на стринговия елемент!!!
        }
        int evenSum=0;
        int oddSum=0;
        for (int number : numbers) {
            if(number%2==0){
                evenSum+=number;
            }else{
                oddSum+=number;
            }

        }
        System.out.println(evenSum-oddSum);
    }
}
