package bg.softuni.fundamentals.EXERCISE;

import java.util.Scanner;

public class LoginEXERCISE {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine();

        //Създаваме променлива, която съхранява паролата. По условие паролата е прочетен на обратно username
        // minus 1, because the length starts from '0' -> "name" 0 1 2 3 -> 4 букви, но i итерира от 0 до 3
        String passWord = "";
        String currentPass = "";
        for (int i = userName.length() - 1; i >= 0; i--) {
            passWord += userName.charAt(i);
        }

        int count = 0;
        for (int i = 0; i < 4; i++) {
            currentPass = scanner.nextLine();
            if (currentPass.equals(passWord)) {
                System.out.printf("User %s logged in.", userName);
                break;
            } else {
                if (count == 3) {
                    System.out.printf("User %s blocked!", userName);
                } else {
                    System.out.println("Incorrect password. Try again.");
                    count++;
                }
            }
        }
    }
}

