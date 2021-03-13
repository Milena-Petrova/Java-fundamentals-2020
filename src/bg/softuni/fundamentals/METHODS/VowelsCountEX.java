package bg.softuni.fundamentals.METHODS;

import java.util.Scanner;
//Write a method that receives a single string and prints the count of the vowels.
// Use appropriate name for the method.
public class VowelsCountEX {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println(vowelsCount(name));
    }

    public static int vowelsCount(String input) {
        String convert = input.toLowerCase();
        int count = 0;
        for (int i = 0; i < convert.length(); i++) {
            if (convert.charAt(i) == 'a' || convert.charAt(i) == 'o' || convert.charAt(i) == 'u' || convert.charAt(i) == 'i' || convert.charAt(i) == 'e') {
                count++;
            }
        }
        return count;
    }
}


