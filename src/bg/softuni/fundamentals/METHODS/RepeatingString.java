package bg.softuni.fundamentals.METHODS;

import java.util.Scanner;

public class RepeatingString {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        int repetitions = Integer.parseInt(scanner.nextLine());

        System.out.println(printRepeatedLine(line,repetitions));
    }

    private static String printRepeatedLine(String s, int count) {
        String multipliedLine = "";
        for (int i = 1; i <=count ; i++) {
            multipliedLine+=s;
        }
       return multipliedLine;
    }
}
