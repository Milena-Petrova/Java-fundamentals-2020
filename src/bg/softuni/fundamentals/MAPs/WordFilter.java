package bg.softuni.fundamentals.MAPs;

import java.util.Arrays;
import java.util.Scanner;

public class WordFilter {
    public static void main(String[] args) {
       //Read an array of strings, take only words which length is even. Print each word on a new line.
        //kiwi orange banana apple --> kiwi
        //                             orange
        //                             banana
        //pizza cake pasta chips --> cake
        Scanner scanner = new Scanner(System.in);

        String[]line = Arrays.stream(scanner.nextLine().split("\\s+"))
                .filter(a->a.length()%2 ==0)
                .toArray(String[]::new);
        for (String s : line) {
            System.out.println(s);
        }
    }
}
