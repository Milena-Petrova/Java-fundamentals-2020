package bg.softuni.fundamentals.FNALexam;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MirrorWordsMap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();

        String expression = "(@|#)(?<firstWord>[A-Za-z]{3,})\\1\\1(?<secondWord>[A-Za-z]{3,})\\1";

        Pattern patternValid = Pattern.compile(expression);
        Matcher matcher = patternValid.matcher(line);

        Map<String, String> mirrors = new LinkedHashMap<>();

        int count = 0;
        while (matcher.find()) {
            count++;
            if (matcher.group("firstWord").equals(reversedWord(matcher.group("secondWord")))) {
                mirrors.putIfAbsent(matcher.group("firstWord"), matcher.group("secondWord"));
            }
        }
        if (count > 0) {
            System.out.printf("%d word pairs found!%n", count);
        } else {
            System.out.println("No word pairs found!");
        }
        if (!mirrors.isEmpty()) {
            System.out.printf("The mirror words are:%n");
            int i = 0;
            for (Map.Entry<String, String> entry : mirrors.entrySet()) {
                String s = entry.getKey() + " <=> " + entry.getValue();
                System.out.print(s);
                if (i < mirrors.size() - 1 && mirrors.size()>1) {
                    System.out.print(", ");
                }
                i++;
            }

        } else {
            System.out.println("No mirror words!");
        }
    }
    private static String reversedWord(String word) {
        StringBuilder reversed = new StringBuilder();
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed.append(word.charAt(i));
        }
        return reversed.toString();
    }
}



