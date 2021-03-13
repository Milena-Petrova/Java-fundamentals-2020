package bg.softuni.fundamentals.METHODS;

import java.util.Scanner;

public class FaktorialDivisionEX {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOne = Integer.parseInt(scanner.nextLine());
        int numTwo = Integer.parseInt(scanner.nextLine());

        float result = calculateFactorial(numOne)/calculateFactorial(numTwo);
        System.out.printf("%.2f", result);

    }
  private static float calculateFactorial(int n){
        float factorial = 1;
        for (int i = 1; i <=n ; i++) {
            factorial*=i;
        }
        return factorial;
    }
}

