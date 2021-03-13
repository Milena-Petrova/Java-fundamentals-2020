package bg.softuni.fundamentals.METHODS;

import java.util.Scanner;

public class MiddleCharcters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
       // printMiddleSymbol(string);
        printMiddleChar(string);
    }
    public static void printMiddleChar(String input) {
        int lenght = input.length();
        char middle = input.charAt(lenght / 2);
        char middleEven = input.charAt((lenght / 2) - 1);
        if (lenght % 2 == 1) {
            System.out.println(middle);
        } else
            System.out.println(middleEven + "" + middle);
    }
   /* public static void printMiddleSymbol(String input) {
        char[] array = input.toCharArray();
        for (int i = 0; i < array.length; i++) {
            array[i] = input.charAt(i);
        }
        if (array.length % 2 == 1) {
            System.out.println(array[array.length / 2]);
        } else {
            System.out.println(array[(array.length - 1) / 2] + "" + array[array.length / 2]);
        }*/
    }





