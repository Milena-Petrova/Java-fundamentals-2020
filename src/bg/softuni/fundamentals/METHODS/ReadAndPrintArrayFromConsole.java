package bg.softuni.fundamentals.METHODS;

import java.util.Scanner;

public class ReadAndPrintArrayFromConsole {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//може да чете не от System.in,  а от файл...
        int[]firstArray = readArray(scanner);
        int[]secondArray = readArray(scanner);

        printArray(firstArray);
        System.out.println();
        printArray(secondArray);
    }
//метод за четене на int масив
    private static int[] readArray(Scanner scanner) {
        String line = scanner.nextLine();
        String[]numbersAsStrings=line.split(" ");
        int[]array = new int[numbersAsStrings.length];
        for (int i = 0; i < array.length ; i++) {
        array[i]= Integer.parseInt(numbersAsStrings[i]);
        }
        return array;
    }//метод за печатане на int масив
    static void printArray(int[]array){
        for (int number : array) {
            System.out.print(number+" ");
        }

    }
}

