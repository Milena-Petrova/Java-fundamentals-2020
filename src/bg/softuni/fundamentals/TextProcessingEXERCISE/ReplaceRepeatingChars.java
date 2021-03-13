package bg.softuni.fundamentals.TextProcessingEXERCISE;

import java.util.Scanner;
/*Write a program that reads a string from the console and replaces any sequence of the same letters with a single corresponding letter.
aaaaabbbbbcdddeeeedssaa	----> abcdedsa
qqqwerqwecccwd	---->  qwerqwecwd
 */
public class ReplaceRepeatingChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        StringBuilder sb = new StringBuilder();

        char firstChar = line.charAt(0);
        sb.append(firstChar);

        for (int i = 0; i <line.length() ; i++) {
            char current = line.charAt(i);
            if(firstChar!=current){
                sb.append(current);
                firstChar =current;
            }
        }
        System.out.println(sb);
    }
}
