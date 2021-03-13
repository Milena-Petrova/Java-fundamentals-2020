package bg.softuni.fundamentals.ARRAYS;

import java.util.Scanner;
//. A top integer is an integer which is bigger than all the elements to its right.
//1 4 3 2 --> 4 3 2
public class TOPintegerERCISEs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] line = scanner.nextLine().split(" ");
        int[] numbers = new int[line.length];

//с този цикъл четем входните данни
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(line[i]);
        }
        //с вложения цикъл обхождаме масива и сравняваме
        for (int i = 0; i < numbers.length; i++) {
            boolean isTopInteger = true;
            int currentNumber = numbers[i];
            //с този цикъл обхождаме числата след currentnumber-a, затова започва от i+1
            for (int j = i+1; j < numbers.length; j++) {
                if (currentNumber <= numbers[j]) {
                    isTopInteger = false;
                }
            }
            if (isTopInteger) {
                System.out.print(currentNumber + " ");
            }
        }
    }
}



