package bg.softuni.fundamentals.EXERCISE;

import java.util.Scanner;

public class SumOfCharsEXERCISE {
    public static void main(String[] args) {
        /*Write a program, which sums the ASCII codes of n characters.
Print the sum on the console.
*/
        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());
        int sum=0;
        for (int i = 0; i < input; i++) {
            char letter = scanner.nextLine().charAt(0);
                 sum+=letter;
        }
        System.out.printf("The sum equals: %d",sum);
    }
}
