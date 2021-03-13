package bg.softuni.fundamentals.EXERCISE;

import java.util.Scanner;

public class Login2EXERCISE {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                String input = scanner.nextLine();//user

                //Създаваме променлива, която съхранява паролата. По условие паролата е прочетен на обратно username
                // minus 1, because the length starts from '0' -> "name" 0 1 2 3 -> 4 букви, но i итерира от 0 до 3
                String passWord = "";
                String currentPass = "";
                for (int i = input.length() - 1; i >= 0; i--) {
                    passWord += input.charAt(i);
                }
                int count = 0;
                while(count<4){
                    currentPass = scanner.nextLine();
                    if (currentPass.equals(passWord)) {
                        System.out.printf("User %s logged in.", input);
                        break;
                    } else if(count<3) {
                        System.out.println("Incorrect password. Try again.");
                    }
                    count++;
                    if(count==4) {
                        System.out.printf("User %s blocked!",input);
                    }

                }
            }
        }




