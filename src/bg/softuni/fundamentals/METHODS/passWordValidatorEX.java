package bg.softuni.fundamentals.METHODS;

import java.util.Scanner;

public class passWordValidatorEX {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();
        boolean ifConsist = checkIfConsist(password);
        boolean isHave = checkIfHaveTwoDigits(password);
        boolean isBetween = checkIfIsBetween(password);

        if(ifConsist&&isHave&&isBetween){
            System.out.println("Password is valid");
        }
        if(!isBetween){
            System.out.println("Password must be between 6 and 10 characters");}

        if(!ifConsist){
            System.out.println("Password must consist only of letters and digits");}
        if(!isHave)
            System.out.println("Password must have at least 2 digits");
        }



private static boolean checkIfIsBetween(String password){  //first check
        return password.length()>=6 && password.length() <=10;
}
private static boolean checkIfConsist(String password){//second chech weather symbols are only letters and digits
        for (int i = 0; i < password.length(); i++) {
            char symbol = password.charAt(i);
            boolean isLetter=Character.isLetter(symbol);
            boolean isDigit = Character.isDigit(symbol);
            if(!(isDigit || isLetter)){
                return false;
            }
        }
        return true;
    }
    private static boolean checkIfHaveTwoDigits(String password) {//third chech weather there are at least two digits
        int count = 0;
        for (int i = 0; i < password.length(); i++) {
            char symbol = password.charAt(i);
            if (Character.isDigit(symbol)) {
                count++;
            }
        }
        if (count < 2) {
            return false;
        } else {
            return true;
        }
    }

}