package bg.softuni.fundamentals.METHODS;

import java.util.Scanner;

public class Calculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int numberOne = Integer.parseInt(scanner.nextLine());
        int numberTwo = Integer.parseInt(scanner.nextLine());
        switch (input){
            case "add": sum(numberOne,numberTwo);
                break;
            case "multiply":  multiply(numberOne,numberTwo);
                break;
            case "subtract": subtract(numberOne,numberTwo);
                break;
            case  "divide":
                if(numberTwo!=0)
                div(numberOne,numberTwo);
                break;
        }
    }

    private static void div(int first, int second) {
        System.out.println(first/second);
    }

    private static void subtract(int first, int second) {
        System.out.println(first-second);
    }

    private static void multiply(int first, int second) {
        System.out.println(first*second);
    }

    private static void sum(int first, int second) {
        System.out.println(first+second);
    }
}
