package bg.softuni.fundamentals.RegEX;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String regex = "[A-Z][a-z]+";
        String text = "HelloWorldHh regular expressions at the le3cture number " +
                "7 at java fundamentals course at SoftUni in 2020.";

        Pattern pat = Pattern.compile(regex);
        Matcher match = pat.matcher(text);

        while(match.find()){// търси, докато намериш съвпадения и ми ги печатай
            System.out.println(match.group(0));
            String r = match.replaceAll("kkk");
            System.out.println(r);
        }
    /*    System.out.println(text);
     String replace = text.replaceAll(regex,"***");*/
      //  System.out.println(replace);
    }
}
