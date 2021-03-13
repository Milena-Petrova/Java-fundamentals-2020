package bg.softuni.fundamentals.FNALexam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Emoji_int {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        int a = calculateThreshold(line);

        Pattern pattern = Pattern.compile("(?<name>([*]{2})[A-Z][a-z]{2,}([*]{2})|([:]{2})[A-Z][a-z]{2,}([:]{2}))");

        Matcher matcher = pattern.matcher(line);

        List<String> findEmojis = new ArrayList<>();

        while (matcher.find()) {
            findEmojis.add(matcher.group());
        }
        System.out.printf("Cool threshold: %d%n", a);
        System.out.printf("%d emojis found in the text. The cool ones are:%n", findEmojis.size());
        for (String emoji : findEmojis) {
            int emojiSum = calculateEmojiAsciSum(emoji);
            if (emojiSum >= a) {
                System.out.println(emoji);
            }
        }
    }

    private static int calculateEmojiAsciSum(String emoji) {
        int sum = 0;
        for (int i = 0; i < emoji.length(); i++) {
            sum += emoji.charAt(i);
        }
        return sum;
    }

    public static int calculateThreshold(String line) {
        int coolThreshold = 1;
        for (int i = 2; i < line.length()-2; i++) {
            char digit = line.charAt(i);
            if (Character.isDigit(line.charAt(i))) {
                coolThreshold *= digit-'0';
            }
        }
        return coolThreshold;
    }
}


