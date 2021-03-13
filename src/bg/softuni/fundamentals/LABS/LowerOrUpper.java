package bg.softuni.fundamentals.LABS;

import java.util.Scanner;

public class LowerOrUpper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       // String letter = scanner.nextLine();
        char letter = scanner.nextLine().charAt(0);
        if (Character.isLowerCase(letter)) {
            System.out.println("lower-case");
        } else {
            System.out.println("upper-case");
        }
    }
}

