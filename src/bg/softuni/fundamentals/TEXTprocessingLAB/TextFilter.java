package bg.softuni.fundamentals.TEXTprocessingLAB;
/*
 All words of the ban list should be replaced with asterisks "*", equal to the word's length.
 The entries in the ban list will be separated by a comma and space ", ".
Input:
Linux, Windows
It is not Linux, it is GNU/Linux. Linux is merely the kernel, while GNU adds the functionality.
Therefore we owe it to them by calling the OS GNU/Linux! Sincerely, a Windows client
output:
It is not *****, it is GNU/*****. ***** is merely the kernel, while GNU adds the functionality.
Therefore we owe it to them by calling the OS GNU/*****! Sincerely, a ******* client
 */

import java.util.Scanner;

public class TextFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] banned = line.split(", ");
        String text = scanner.nextLine();//.split("[, . \\s+]+");

        for (String bannedWord : banned) {
           // String repeate = repeatedArray("*", bannedWord.length());
            text = text.replace(bannedWord,repeatedArray("*",bannedWord.length()));
        }
        System.out.println(text);
    }

    private static String repeatedArray(String replacement,int lenght) {
            String[] repeatedArray = new String[lenght];
            for (int i = 0; i < lenght; i++) {
                repeatedArray[i] = replacement;
            }
            return String.join("", repeatedArray);
        }
}


