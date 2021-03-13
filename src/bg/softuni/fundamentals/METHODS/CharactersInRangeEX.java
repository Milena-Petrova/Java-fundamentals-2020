package bg.softuni.fundamentals.METHODS;

import java.util.Scanner;
/*Write a method that receives two characters
and prints on a single line all the characters in between them according to ASCII.*/
public class CharactersInRangeEX {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char first = scanner.nextLine().charAt(0);
        char second = scanner.nextLine().charAt(0);
printCharactersInrange(first,second);
    }

    public static void printCharactersInrange(char first, char second) {
        if (first < second) {
            for (char i = (char) (first + 1); i < second; i++) {
                System.out.print(i + " ");
            }
        } else {
            for (char i = (char) (second + 1); i < first; i++) {
                System.out.print(i + " ");
            }
        }
    }
}

