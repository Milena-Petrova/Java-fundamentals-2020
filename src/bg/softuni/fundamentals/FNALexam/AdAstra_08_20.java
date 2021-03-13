package bg.softuni.fundamentals.FNALexam;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AdAstra_08_20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();

        String regex = "(\\||#)(?<item>[A-Z a-z]+)\\1(?<date>[0-9]{2}[/][0-9]{2}[/][0-9]{2})\\1(?<calories>\\d{1,})\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(line);
        List<String>foods = new ArrayList<>();

        int sum =0;
        while (matcher.find()) {
            String food = matcher.group("item");
            String date = matcher.group("date");
            int calory = Integer.parseInt(matcher.group("calories"));
           String f = String.format("Item: %s, Best before: %s, Nutrition: %d%n",food,date,calory);
           foods.add(f);
           sum+=calory;
        }
        int needDays = sum/2000;//you need 2000cal per day
        System.out.printf("You have food to last you for: %d days!%n",needDays);
        for (String s : foods) {
            System.out.print(s);
        }
    }
}

