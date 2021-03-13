package bg.softuni.fundamentals.RegEX;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
Write a regular expression to match a valid phone number from Sofia.
 Print all valid phones on the console, separated by a comma and a space “, ”.
 •	It starts with "+359"
•	Then, it is followed by the area code (always 2)
•	After that, it’s followed by the number itself:
o	The number consists of 7 digits (separated in two groups of 3 and 4 digits respectively).
•	The different parts are separated by either a space or a hyphen ('-').
Match NONE of these
359-2-222-2222, +359/2/222/2222, +359-2 222 2222
+359 2-222-2222, +359-2-222-222, +359-2-222-22222

Match ALL of these
+359 2 222 2222
+359-2-222-2222

input : +359 2 222 2222,359-2-222-2222, +359/2/222/2222, +359-2 222 2222 +359 2-222-2222, +359-2-222-222, +359-2-222-22222 +359-2-222-2222
output: +359 2 222 2222, +359-2-222-2222
 */
public class MatchPhoneNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String expression = "\\+359([\\s -])2\\1\\d{3}\\1\\d{4}\\b";

        Pattern pattern = Pattern.compile(expression);
        Matcher matcher = pattern.matcher(scanner.nextLine());
        List<String> matched = new ArrayList<>();
        while (matcher.find()) {
            matched.add(matcher.group());
        }
        for (int i = 0; i < matched.size(); i++) {
            System.out.print(matched.get(i));
            if (i < matched.size()-1) {
                System.out.print(", ");
            }
        }
    }
}
