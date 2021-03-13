package bg.softuni.fundamentals.FNALexam;

import java.util.Scanner;

public class PasswordResetGroup2_04_20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();
        String command = scanner.nextLine();
        while (!command.equals("Done")){
            String[]token = command.split("\\s+");
            switch (token[0]){
                case "TakeOdd":
                    StringBuilder pass = new StringBuilder();
                    pass = oddCharacters(password);
                    System.out.println(pass);
                    password=pass.toString();
                    break;
                case "Cut":
                    int index = Integer.parseInt(token[1]);
                    int lenght = Integer.parseInt(token[2]);
                    StringBuilder cutPass = new StringBuilder(password);
                    cutPass = cutSubstring(cutPass,index,index+lenght);
                    System.out.println(cutPass);
                    password=cutPass.toString();
                    break;
                case "Substitute":
                    String substring = token[1];
                    String substitute = token[2];
                    if(password.contains(substring)){
                        String subPass=password.replaceAll(substring,substitute);
                        System.out.println(subPass);
                        password=subPass;
                    }else{
                        System.out.println("Nothing to replace!");
                    }
                    break;
            }
            command= scanner.nextLine();
        }
        System.out.printf("Your password is: %s",password);
    }

    private static StringBuilder cutSubstring(StringBuilder input,int startIndex,int endIndex) {
        input.replace(startIndex,endIndex,"");
        return input;
    }

    private static StringBuilder oddCharacters(String input) {
        StringBuilder pass = new StringBuilder(input.charAt(1));
        for (int i = 1; i <input.length() ; i+=2) {
                  pass.append(input.charAt(i));
        }
        return pass;
    }
}
