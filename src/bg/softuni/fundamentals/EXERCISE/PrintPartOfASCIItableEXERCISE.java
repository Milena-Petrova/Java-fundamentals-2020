package bg.softuni.fundamentals.EXERCISE;

import java.util.Scanner;

public class PrintPartOfASCIItableEXERCISE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*парсване на число и прочитането му като символ в аски код
        int input = Integer.parseInt(scanner.nextLine());
        char a = (char)input;
        */
        char numOne = (char)Integer.parseInt(scanner.nextLine());
        char numTwo = (char)Integer.parseInt(scanner.nextLine());

        for (int i = numOne; i <= numTwo; i++) {
            System.out.print(numOne+" ");
            numOne++;
        }

    }
}
