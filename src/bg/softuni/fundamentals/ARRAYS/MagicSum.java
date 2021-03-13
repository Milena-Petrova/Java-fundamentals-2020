package bg.softuni.fundamentals.ARRAYS;

import java.util.Scanner;

public class MagicSum {
    public static void main(String[] args) {
        //Write a program, which prints all unique pairs in an array of integers whose sum is equal to a given number.
        //1 7 6 2 19 23 -> 1+7 = 8 ; 6+2 = 8
        //8
        Scanner scanner = new Scanner(System.in);
        String[] line = scanner.nextLine().split(" ");
        int number = Integer.parseInt(scanner.nextLine());
        int[] elements = new int[line.length];
        for (int i = 0; i < elements.length; i++) {
            elements[i] = Integer.parseInt(line[i]);
        }

        for (int i = 0; i < elements.length; i++) {
            for (int j = i+1; j < elements.length ; j++) {
                if(elements[i]+ elements[j]==number){
                    System.out.println(elements[i]+" "+elements[j]);
                }
            }
        }
    }
}


