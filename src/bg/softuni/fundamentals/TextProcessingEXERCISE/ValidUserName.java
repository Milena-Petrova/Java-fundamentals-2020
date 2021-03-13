package bg.softuni.fundamentals.TextProcessingEXERCISE;

import java.util.Scanner;
/*Write a program that reads user names on a single line (joined by ", ") and prints all valid usernames.
A valid username is:
•	Has length between 3 and 16 characters
•	Contains only letters, numbers, hyphens and underscores
sh, too_long_username, !lleg@l ch@rs, jeffbutt	------->   jeffbutt
Jeff, john45, ab, cd, peter-ivanov, @smith	------> Jeff
                                                    John45
                                                    peter-ivanov */
public class ValidUserName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] userName = scanner.nextLine().split(", ");
        for (String username : userName) {
            if(isValidUserName(username)){
                System.out.println(username);
            }
        }
    }
    private static boolean isValidUserName(String user){
        if(user.length()<3 || user.length()>16){
            return false;
        }
        for (int i = 0; i < user.length(); i++) {
            char symbol = user.charAt(i);
            if (!Character.isLetterOrDigit(symbol) && symbol != '-' && symbol != '_') {
                return false;
            }
        }
        return true;
    }
}
