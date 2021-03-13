package bg.softuni.fundamentals.METHODS;

import java.util.Scanner;

public class PalindromeIntegersEX {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        while (!input.equals("END")) {
           // checkIfIsPalidrome(input);
                System.out.println(checkIfIsPalidrome(input));

            input = scanner.nextLine();
        }
    }
    public static boolean checkIfIsPalidrome(String input) {
     //   boolean isPalidrome=false;
        String[] line = input.split("");
        if(line.length==1){
            return true;
        }
        int[] array = new int[line.length];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(line[i]);
        }
        for (int i = 0; i < array.length / 2; i++) {
            if (array[i] != array[array.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }
}



