package bg.softuni.fundamentals.FNALexam;

import java.util.Scanner;

public class SecretChat_10_04_20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String command = scanner.nextLine();

        StringBuilder decryptMessage = new StringBuilder(line);
        while (!command.equals("Reveal")) {
            String[] token = command.split(":\\|:");
            switch (token[0]) {
                case "InsertSpace":
                    decryptMessage = decryptMessage.insert(Integer.parseInt(token[1]), " ");
                    System.out.println(decryptMessage);
                    break;
                case "Reverse":
                    if (decryptMessage.toString().contains(token[1])) {
                        String cutLine = line.replaceFirst(token[1], "");
                        String reversed = reversedString(token[1]);
                        decryptMessage = new StringBuilder(cutLine).append(reversed);
                        System.out.println(decryptMessage);
                    } else {
                        System.out.println("error");
                    }
                    break;
                case "ChangeAll":
                    if (line.contains(token[1])) {
                        String change = line.replaceAll(token[1], token[2]);
                        decryptMessage = new StringBuilder(change);
                        System.out.println(decryptMessage);
                    }
                    break;
                default:
                    System.out.println("error");
                    break;
            }
            line = decryptMessage.toString();
            command = scanner.nextLine();
        }
        System.out.printf("You have a new text message: %s", line);
    }

    private static String reversedString(String line) {
        String reversed = "";
        for (int i = line.length() - 1; i >= 0; i--) {
            reversed += line.charAt(i);
        }
        return reversed;
    }
}