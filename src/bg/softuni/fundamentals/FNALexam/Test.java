package bg.softuni.fundamentals.FNALexam;

public class Test {
    public static void main(String[] args) {
            String input ="@###Brea0D@###";
            String productGroup = "";
            int countDigits = 0;
            for (int j = 0; j < input.length(); j++) {
                if (Character.isDigit(input.charAt(j))) {
                    countDigits++;
                    productGroup += input.charAt(j);
                }
            }
                if (countDigits == 0) {
                    productGroup = "00";
                }
                System.out.printf("Product group: %s%n", productGroup);
            }
        }



