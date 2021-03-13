package bg.softuni.fundamentals.TEXTprocessingLAB;

import java.util.Scanner;

/*
a single string and on the first line prints all the digits, on the second – all the letters, and on the third –
all the other characters.
There will always be at least one digit, one letter and one other characters.
Input:
Agd#53Dfg^&4F53
Output:
53453
AgdDfgF
#^&
*/
public class DigitLetterOthers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] line = scanner.nextLine().toCharArray();
        StringBuilder digit = new StringBuilder();
        StringBuilder letter = new StringBuilder();
        StringBuilder other = new StringBuilder();
        for (char c : line) {
            if (Character.isDigit(c)) {
                digit.append(c);
            } else if (Character.isLetter(c)) {
                letter.append(c);
            } else {
                other.append(c);
            }
        }
        System.out.println(digit);
        System.out.println(letter);
        System.out.println(other);
    }
}
