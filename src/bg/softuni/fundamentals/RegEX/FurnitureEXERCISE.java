package bg.softuni.fundamentals.RegEX;
/*
Until line "Purchase"---> input lines
the valid  format: ">>{furniture name}<<{price}!{quantity}"
The price can be a floating-point number or a whole number.
Store the names of the furniture and the total price.
At the end print each bought furniture on a separate line in the format:
"Bought furniture:
{1st name}
{2nd name}
Input:                      Output:
>>Sofa<<312.23!3            Bought furniture:
>>TV<<300!5                 Sofa
>Invalid<<!5                TV
Purchase	                Total money spend: 2436.69
…"
And on the last line print the following: "Total money spend: {spend money}" formatted to the second decimal point.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FurnitureEXERCISE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String regex = ">>(?<furniture>[A-Za-z]+)<<(?<price>\\d*\\.?\\d+)!(?<quantity>\\d+)";
        String input = scanner.nextLine();

        Pattern pattern = Pattern.compile(regex);

        List<String> furnitures = new ArrayList<>();
        double spentMoney =0;
        while(!input.equals("Purchase")){
            Matcher matcher = pattern.matcher(input);
            if (matcher.find()){
               spentMoney+= Double.parseDouble(matcher.group("price"))*Integer.parseInt(matcher.group("quantity"));
               furnitures.add(matcher.group("furniture"));
            }
            input = scanner.nextLine();
        }
        System.out.println("Bought furniture:");
        for (String furniture : furnitures) {
            System.out.println(furniture);
        }
        System.out.printf("Total money spend: %.2f",spentMoney);
    }
}
