package bg.softuni.fundamentals.MIDexams;

import java.util.Scanner;

public class ArrayModifier02_JULY_midExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String lineOfNumbers = scanner.nextLine();
        int[] array = parseArray(lineOfNumbers);//Ползваме си метод за четене и парсване на масива
        String line = scanner.nextLine();
        while (!line.equals("end")) {
        String[]commandAndParameters = line.split(" ");
        switch (commandAndParameters[0]){
            case "swap":
                swap(array,Integer.parseInt(commandAndParameters[1]),Integer.parseInt(commandAndParameters[2]));
                break;
            case "multiply":
                multiply(array,Integer.parseInt(commandAndParameters[1]),Integer.parseInt(commandAndParameters[2]));
                break;
            case "decrease":
                decrease(array);
                break;
        //    default:
         //       System.out.println("Unknown comand"+line);
      //          break;
        }

            line = scanner.nextLine();
        }
        String separator = ", ";
        printArray(separator, array);
    }
    private static void decrease(int[] array) {//Метод за намаляне на елементите с 1
        for (int i = 0; i < array.length ; i++) {
            array[i]--;
        }
    }
//метод за умножение на елементите
    private static void multiply(int[] array, int indexA, int indexB) {
    array[indexA]=array[indexA]*array[indexB];
    }

    // метод за размяна на индексите
    private static void swap(int[] array, int indexA, int indexB) {
        int old = array[indexA];
        array[indexA]=array[indexB];
        array[indexB]=old;
    }
//метод за печатане на масива
    private static void printArray(String separator, int[] array) {
        for (int i = 0; i < array.length ; i++) {
            System.out.print(array[i]);
            if(i< array.length-1){//за да не ни печата последната запетая или разделител
                System.out.print(separator);
            }
        }
        System.out.println();
    }

//метод за четене на масива
    private static int[] parseArray(String lineOfNumbers) {
        String[]numbersAsString = lineOfNumbers.split(" ");
        int[]array = new int[numbersAsString.length];
        for (int i = 0; i < numbersAsString.length ; i++) {
            array[i]=Integer.parseInt(numbersAsString[i]);
        }
        return array;
    }
}
