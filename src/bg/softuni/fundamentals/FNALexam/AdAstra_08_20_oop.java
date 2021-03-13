package bg.softuni.fundamentals.FNALexam;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AdAstra_08_20_oop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();

        String regex = "(\\||#)(?<item>[A-Z a-z]+)\\1(?<date>[0-9]{2}[/][0-9]{2}[/][0-9]{2})\\1(?<calories>\\d{1,})\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(line);

        List<Item> foods = new ArrayList<>();
        int sum = 0;
        while (matcher.find()) {
            String food = matcher.group("item");
            String date = matcher.group("date");
            int calory = Integer.parseInt(matcher.group("calories"));
            Item f = new Item(food, date, calory);
            foods.add(f);
            sum+=calory;
        }
        System.out.printf("You have food to last you for: %d days!%n",sum/2000);
        for (Item food : foods) {
            System.out.printf("Item: %s, Best before: %s, Nutrition: %d%n", food.getItemName(), food.getDate(), food.getCalorie());
        }
    }
    public static class Item{
        String itemName;
        String date;
        int calorie;

        public Item(String itemName, String date, int calorie) {
            this.itemName = itemName;
            this.date = date;
            this.calorie = calorie;
        }
        public String getItemName() {
            return itemName;
        }
        public String getDate() {
            return date;
        }
        public int getCalorie() {
            return calorie;
        }
    }
}
