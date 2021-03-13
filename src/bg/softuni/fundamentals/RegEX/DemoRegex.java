package bg.softuni.fundamentals.RegEX;

public class DemoRegex {
    public static void main(String[] args) {
        //Hello regular expressions, this is l3cture
        // number 7 in the java fundamentals course at
        // softuni in 2020 ---> 3 7 20

        String text = "Hello regular expressions, this is l3cture number 7 in the java fundamentals course at softuni in 2020";

        StringBuilder currentNumberString = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            if (Character.isDigit(currentChar)) {
                currentNumberString.append(currentChar);
            } else if (currentNumberString.length() != 0) {
                System.out.println(currentNumberString);
                currentNumberString = new StringBuilder();//все едно го нулираме
            }
        }
        if(currentNumberString.length() !=0){
            System.out.println(currentNumberString);
        }
    }
}
