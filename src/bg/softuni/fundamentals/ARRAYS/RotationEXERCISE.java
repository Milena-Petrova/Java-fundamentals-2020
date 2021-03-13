package bg.softuni.fundamentals.ARRAYS;

import java.util.Scanner;

public class RotationEXERCISE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String []array = scanner.nextLine().split(" ");
        int rotations = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i <rotations ; i++) {
            // в този цикъл си запазваме стойността на първия елемент
            //и също задаваме ротацията на елементите
            String firstElement = array[0];
            //shift left - с този цикъл местим наляво елементите, толкова пъти,
            // колкото ни е зададено с ротацията
            for (int j = 0; j < array.length-1 ; j++) {
                array[j]=array[j+1];
            }
            //add first element to last position
            array[array.length-1]= firstElement;
        }
        for (int i = 0; i < array.length ; i++) {
            System.out.print(array[i]+" ");
        }
    }
}