package bg.softuni.fundamentals.RegEX;
/*
Write a program, which matches a date in the format “dd{separator}MMM{separator}yyyy”. Use named capturing groups in your regular expression.
Compose the Regular Expression
Every valid date has the following characteristics:
•	Always starts with two digits, followed by a separator
•	After that, it has one uppercase and two lowercase letters (e.g. Jan, Mar).
•	After that, it has a separator and exactly 4 digits (for the year).
•	The separator could be either of three things: a period (“.”), a hyphen (“-“) or a forward slash (“/”)
•	The separator needs to be the same for the whole date (e.g. 13.03.2016 is valid, 13.03/2016 is NOT). Use a group backreference to check for this.
INPUT: 13/Jul/1928, 10-Nov-1934, , 01/Jan-1951,f 25.Dec.1937 23/09/1973, 1/Feb/2016
OUTPUT:
Day: 13, Month: Jul, Year: 1928
Day: 10, Month: Nov, Year: 1934
Day: 25, Month: Dec, Year: 1937
 */
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchDates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String expression = "\\b(?<day>[0-9]{2})+([./-])(?<month>[A-Z][a-z]{2})\\2(?<year>\\d{4})\\b";
        String input = scanner.nextLine();

        Pattern pattern = Pattern.compile(expression);
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()){
            System.out.printf("Day: %s, Month: %s, Year: %s%n",matcher.group("day"),matcher.group("month"),matcher.group("year"));
        }
    }
}
