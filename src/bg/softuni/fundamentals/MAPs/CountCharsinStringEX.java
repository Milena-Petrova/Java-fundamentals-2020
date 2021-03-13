package bg.softuni.fundamentals.MAPs;
/*
Write a program, which counts all characters in a string except space (' ').
Print all occurrences in the following format:
{char} -> {occurrences}

 */

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharsinStringEX {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Character, Integer> chars = new LinkedHashMap<>();
        String input = scanner.nextLine();
        for (char symbol : input.toCharArray()) {
            if (symbol != ' ') {
                if (chars.containsKey(symbol)) {
                    int count = chars.get(symbol);
                    chars.put(symbol, count + 1);
                } else {
                    chars.put(symbol, 1);
                }
            }
        }
        for (Map.Entry<Character, Integer> entry : chars.entrySet()) {
            System.out.println(entry.getKey()+" -> "+ entry.getValue());
        }

    }
}
