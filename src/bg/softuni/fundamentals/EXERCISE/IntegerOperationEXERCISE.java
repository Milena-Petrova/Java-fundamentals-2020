package bg.softuni.fundamentals.EXERCISE;

import java.util.Scanner;

public class IntegerOperationEXERCISE {
    public static void main(String[] args) {
        /*Read four integer numbers.
        Add first to the second, divide (integer) the sum by the third number and multiply
        the result by the fourth number. Print the result.*/
        Scanner scanner = new Scanner(System.in);
        int inputFirst = Integer.parseInt(scanner.nextLine());
        int inputSecond = Integer.parseInt(scanner.nextLine());
        int inputThird = Integer.parseInt(scanner.nextLine());
        int inputForth = Integer.parseInt(scanner.nextLine());

        System.out.println( ((inputFirst+inputSecond)/inputThird)*inputForth );
    }
}
