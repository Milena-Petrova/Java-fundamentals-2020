package bg.softuni.fundamentals.FNALexam;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
    There are several types of instructions, split by '|'
•	Move {number of letters}
o	Moves the first n letters to the back of the string.
•	Insert {index} {value}
o	Inserts the given value before the given index in the string.
•	ChangeAll {substring} {replacement}
o	Changes all occurrences of the given substring with the replacement text.
zzHe            ----> The decrypted message is: Hello
ChangeAll|z|l
Insert|2|o
Move|3
Decode

owyouh ----------> The decrypted message is: howareyou?
Move|2
Move|3
Insert|3|are
Insert|9|?
Decode
       */
public class TheImitationGame_08_20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder message = new StringBuilder(scanner.nextLine());
        String command = scanner.nextLine();

        while (!command.equals("Decode")){
          String[]token = command.split("\\|");
          switch (token[0]){
              case "Move":
                  int nLetters = Integer.parseInt(token[1]);
                  for (int i = 0; i < nLetters ; i++) {
                      message.append(message.charAt(0));
                      message.deleteCharAt(0);
                  }
                  break;
              case "Insert":
                  int index = Integer.parseInt(token[1]);
                  String value = token[2];
                      message.insert(index, value);
                  break;
              case "ChangeAll":
                  String substring = token[1];
                  String replacement = token[2];
                  String replacedMessage = message.toString().replace(substring, replacement);
                  message = new StringBuilder(replacedMessage);
                      break;
          }
          command = scanner.nextLine();
        }
        System.out.println("The decrypted message is: " + message);

    }
}
