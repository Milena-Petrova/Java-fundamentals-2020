package bg.softuni.fundamentals.METHODS;

import java.util.Scanner;

public class GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        switch (input) {
            case "int":
                int first = Integer.parseInt(scanner.nextLine());
                int second = Integer.parseInt(scanner.nextLine());
                System.out.println(getMax(first, second));
                break;
            case "char":
                char one = scanner.nextLine().charAt(0);
                char two = scanner.next().charAt(0);
                System.out.println(getMax(one,two));
                break;
            case "string":
                String firstLine = scanner.nextLine();
                String secondLine = scanner.nextLine();
                System.out.println(getMax(firstLine,secondLine));
                break;
        }
    }

    private static int getMax(int first, int second) {
        if (first >= second) {
            return first;
        }
        return second;
    }
    private static char getMax(char one, char two) {
        if (one >= two) {
            return one;
        }
        return two;
    }
    private static String getMax(String first, String second){
        if(first.compareTo(second)>=0){
            return first;
        }
        return second;
    }
}
