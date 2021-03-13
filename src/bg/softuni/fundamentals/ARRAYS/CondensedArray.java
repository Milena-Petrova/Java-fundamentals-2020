package bg.softuni.fundamentals.ARRAYS;

import java.util.Scanner;
/*
input: 5 0 4 1 2
output : 35
explane: 5 0 4 1 2  5+0 0+4 4+1 1+2
 5 4 5 3  5+4 4+5 5+3
 9 9 8  9+9 9+8
 18 17  18+17  35
 */
public class CondensedArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] lineOfNumbers = line.split(" ");
        int[] numbers = new int[lineOfNumbers.length];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(lineOfNumbers[i]);
        }
        for (int i = 0; i < numbers.length; i++) {
            int[]condensed = new int[numbers.length-1];
            for (int j = 0; i < condensed.length; j++) {
                condensed[j] = numbers[i] + numbers[i + 1];
            }
            numbers = condensed;
        }
     /*   while (numbers.length > 1) {
            //на всяка итерация получаваме масив, който е с един елемент по-малко от предодния
            int[] condensed = new int[numbers.length - 1];
            for (int i = 0; i < condensed.length; i++) {
                condensed[i] = numbers[i] + numbers[i + 1];
            }
            numbers = condensed;
        }*/
        System.out.print(numbers[0]);
    }
}

