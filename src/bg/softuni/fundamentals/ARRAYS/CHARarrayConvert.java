package bg.softuni.fundamentals.ARRAYS;

import java.util.Scanner;

public class CHARarrayConvert {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String arrayAsString = scanner.nextLine();
        char[] elements = arrayAsString.toCharArray();
        for (int i = 0; i < elements.length; i++) {
            elements[i] = arrayAsString.charAt(i);

            System.out.print(elements[i]);

        }
    }
}

