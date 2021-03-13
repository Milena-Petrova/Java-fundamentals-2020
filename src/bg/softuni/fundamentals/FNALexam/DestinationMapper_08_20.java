package bg.softuni.fundamentals.FNALexam;
/*
You will be given a string representing some places on the map. You have to filter only the valid ones. A valid location is:
•	Surrounded by "=" or "/" on both sides (the first and the last symbols must match)
•	After the first "=" or "/" there should be only letters (the first must be upper-case)
•	The letters must be at least 3
Example: In the string "=Hawai=/Cyprus/=Invalid/invalid==i5valid=/I5valid/=i=" only the first two locations are valid.
After you have matched all the valid locations, you have to calculate travel points. They are calculated by summing the lengths of all the valid destinations
that you have found on the map. At the end, on the first line print the following: "Destinations: {destinations joined by ', '}".
On the second line print "Travel Points: {travel_points}".
INPUT:
=Hawai=/Cyprus/=Invalid/invalid==i5valid=/I5valid/=i=
OUTPUT:
Destinations: Hawai, Cyprus
Travel Points: 11
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DestinationMapper_08_20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();//destinations
        String expression = "(=|\\/)(?<destination>[A-Z][A-Za-z]{2,})\\1";//valid destinations pattern
        Pattern pattern = Pattern.compile(expression);
        Matcher matcher = pattern.matcher(input);
        List<String> destinations = new ArrayList<>();
        int sum =0;
        while (matcher.find()){
            int points = matcher.group("destination").length();
            sum+=points;
            destinations.add(matcher.group("destination"));
        }
        System.out.println("Destinations: "+String.join(", ",destinations));
        System.out.println("Travel Points: "+destinations.stream().mapToInt(l -> l.length()).sum());

      /*  System.out.print("Destinations: ");
        for (int i = 0; i < destinations.size() ; i++) {
            System.out.printf(destinations.get(i));
            if(i<destinations.size()-1){
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println("Travel Points: "+sum);*/
    }
}


