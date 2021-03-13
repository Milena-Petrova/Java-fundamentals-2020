package bg.softuni.fundamentals.EXERCISE;

import java.util.Scanner;

public class TripleOFLetters2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());
        for (char i = 97; i < 97 + input ; i++) {
            for (char j = 97; j < 97 + input; j++) {
                for (int k = 97; k < 97 + input; k++) {
                    System.out.printf("%c%c%c%n",i,j,k);
                }
            }

        }
    }
}
