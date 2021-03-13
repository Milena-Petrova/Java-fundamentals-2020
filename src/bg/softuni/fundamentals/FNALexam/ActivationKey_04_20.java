package bg.softuni.fundamentals.FNALexam;
//abcdefghijklmnopqrstuvwxyz
//Slice>>>2>>>6
//Flip>>>Upper>>>3>>>14
//Flip>>>Lower>>>5>>>7
//Contains>>>def
//Contains>>>deF
//Generate

//output
//abghijklmnopqrstuvwxyz
//abgHIJKLMNOPQRstuvwxyz
//abgHIjkLMNOPQRstuvwxyz
//Substring not found!
//Substring not found!
//Your activation key is: abgHIjkLMNOPQRstuvwxyz

import java.util.Scanner;

public class ActivationKey_04_20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String command = scanner.nextLine();
        StringBuilder key = new StringBuilder(input);
        while (!command.equals("Generate")) {

            String[] token = command.split(">>>");

            switch (token[0]) {
                case "Contains":
                    if (key.toString().contains(token[1])) {
                        System.out.printf("%s contains %s%n", key, token[1]);
                    } else {
                        System.out.println("Substring not found!");
                    }
                    break;
                case "Flip":
                        int startIndex = Integer.parseInt(token[2]);
                        int endIndex = Integer.parseInt(token[3]);

                        String substr = key.substring(startIndex,endIndex);

                        if(token[1].equals("Upper")){
                         key = key.replace(startIndex,endIndex,substr.toUpperCase());
                            System.out.println(key);
                        }else if(token[1].equals("Lower")){
                         key = key.replace(startIndex,endIndex,substr.toLowerCase());
                            System.out.println(key);
                        }
                        break;
                case "Slice":
                    int index1 = Integer.parseInt(token[1]);
                    int index2 = Integer.parseInt(token[2]);
                    key = key.replace(index1, index2, "");
                    System.out.println(key);
                    break;
            }
            input = key.toString();
            command = scanner.nextLine();
        }
        System.out.printf("Your activation key is: %s",key);
    }
}

