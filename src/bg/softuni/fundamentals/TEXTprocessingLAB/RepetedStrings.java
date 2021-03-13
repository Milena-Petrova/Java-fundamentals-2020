package bg.softuni.fundamentals.TEXTprocessingLAB;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RepetedStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words = scanner.nextLine().split(" ");

        List<String>repeatedWords = new ArrayList<>();
        for (int i = 0; i < words.length ; i++) {
         //   String repeat = repeat(words[i], words[i].length());
            // System.out.print(repeat);
            repeatedWords.add(repeat(words[i], words[i].length() ));
        }
        System.out.println(String.join("",repeatedWords));
    }
//count --> number of repetitions per word
    private static String repeat(String word, int count) {
        String[] repeatedArray = new String[count];
        for (int i = 0; i < count; i++) {
            repeatedArray[i] = word;
        }
        return String.join("", repeatedArray);
    }
}

