package bg.softuni.fundamentals.FNALexam;
/*
Examples of valid barcodes: @#FreshFisH@#, @###Brea0D@###, @##Che46sE@##, @##Che46sE@###
Examples of invalid barcodes: ##InvaliDiteM##, @InvalidIteM@, @#Invalid_IteM@#
product group ---> concatenating all the digits found in the barcode.
If there are no digits present in the barcode, the default product group is "00".
        */

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FancyBarcodesGroup2_04_20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());


        for (int i = 0; i < n; i++) {
            String barcode = scanner.nextLine();

            String expression = "^@#+[A-Z][A-Za-z0-9]{4,}[A-Z]@#+$";
            Pattern pattern = Pattern.compile(expression);
            Matcher matcher = pattern.matcher(barcode);

          if(matcher.find()) {
              String productGroup = sumDigits(barcode);
              System.out.printf("Product group: %s%n", productGroup);
          }else{
              System.out.println("Invalid barcode");}
            }
        }
    private static String sumDigits(String input) {
        String productGroup = "";int countDigits = 0;
        for (int j = 0; j < input.length(); j++) {
            if (Character.isDigit(input.charAt(j))) {
                countDigits++;
                productGroup += input.charAt(j);
            }
        }
        if (countDigits == 0) {
            productGroup = "00";
        }
        return productGroup;
    }
}
