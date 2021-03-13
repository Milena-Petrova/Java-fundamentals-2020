package bg.softuni.fundamentals.FNALexam;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());
        String regex = "^([$%])[A-Z][a-z]{2,}\\1: (\\[)\\d+(\\]\\|)\\2\\d+\\3\\2\\d+\\3$";

        for (int i = 0; i < input ; i++) {
            String command = scanner.nextLine();
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(command);
            if(matcher.find()){
                System.out.println(matcher.group(2));
            }else{
                System.out.println("Valid message not found1");
            }

        }
    }
}
