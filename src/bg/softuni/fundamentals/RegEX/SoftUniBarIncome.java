package bg.softuni.fundamentals.RegEX;
/*
Until you receive a line with text "end of shift" --> orders
Each valid order should have a customer, product, count and a price:
•	Valid customer's name should be surrounded by '%' and must start with a capital letter, followed by lower-case letters
•	Valid product contains any word character and must be surrounded by '<' and '>'
•	Valid count is an integer, surrounded by '|'
•	Valid price is any real number followed by '$'
The parts of a valid order should appear in the order given: customer, product, count and a price.
Between each part there can be other symbols, except ('|', '$', '%' and '.')
For each valid line print on the console: "{customerName}: {product} - {totalPrice}"
When you receive "end of shift" print the total amount of money for the day rounded to 2 decimal places in the following format: "Total income: {income}".
%George%<Croissant>|2|10.3$                 --> George: Croissant - 20.60
%Peter%<Gum>|1|1.3$                             Peter: Gum - 1.30
%Maria%<Cola>|1|2.4$                            Maria: Cola - 2.40
end of shift                                    Total income: 24.30

%InvalidName%<Croissant>|2|10.3$            --> Valid: Valid - 200.00
%Peter%<Gum>1.3$                                Total income: 200.00
%Maria%<Cola>|1|2.4
%Valid%<Valid>valid|10|valid20$
end of shift
 */

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SoftUniBarIncome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String regex = "%(?<name>[A-Z][a-z]+)%[^|$%.]*<(?<product>[A-Za-z]+)>[^|$%.]*\\|(?<quantity>\\d+)\\|[^|$%.]*?(?<price>\\d*\\.?\\d+)\\$";
        Pattern pattern = Pattern.compile(regex);
        double sum =0;
        while(!input.equals("end of shift")){
            Matcher matcher = pattern.matcher(input);
             double amount =0;
            while (matcher.find()){
            amount = Double.parseDouble(matcher.group("price"))*Double.parseDouble(matcher.group("quantity"));
            sum+=amount;
                System.out.printf("%s: %s - %.2f%n",matcher.group("name"),matcher.group("product"),amount);
            }
            input=scanner.nextLine();
        }
        System.out.printf("Total income: %.2f",sum);
    }
}
