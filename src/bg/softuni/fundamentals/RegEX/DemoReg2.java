package bg.softuni.fundamentals.RegEX;

public class DemoReg2 {
    public static void main(String[] args) {
        String text = "Hello regular expressions, this is l3cture number 7 in the java fundamentals course at softuni in 2020";

        StringBuilder currentNumberString = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            if(Character.isUpperCase(currentChar)){
                currentNumberString.append(currentChar);
            }
        }
    }
}