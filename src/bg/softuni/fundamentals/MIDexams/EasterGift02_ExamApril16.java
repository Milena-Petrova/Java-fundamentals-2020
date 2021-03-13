package bg.softuni.fundamentals.MIDexams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class EasterGift02_ExamApril16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[]lineOfStrings = line.split("\\s+");
        List<String> gifts = new ArrayList<>();
        for (String lineOfString : lineOfStrings) {
            gifts.add(lineOfString);
        }
        String input = scanner.nextLine();
        while (!input.equals("No Money")) {
            List<String> command = Arrays.stream(input.split("\\s+"))
                    .collect(Collectors.toList());
            String instructionWord = command.get(0);
            String gift = command.get(1);
            switch (instructionWord) {
                case "OutOfStock":
                    if (gifts.contains(gift)) {
                        for (int i = 0; i < gifts.size(); i++) {
                            String current = gifts.get(i);
                            if (gift.equals(current)) {
                                gifts.set(i, "None");
                            }
                        }
                    }
                    System.out.println();
                    break;
                case "Required":  //Required {gift} {index}
                    //indexOfCommand last --> (command.size()-1)
                    int indexToReplaceGifts = Integer.parseInt(command.get(2));
                    if (indexToReplaceGifts<gifts.size()&&indexToReplaceGifts>0) {
                        gifts.set(indexToReplaceGifts, gift);
                    }
                    System.out.println();
                    break;
                case "JustInCase":
                    gifts.set(gifts.size() - 1, gift);
                    break;
            }
            input = scanner.nextLine();
        }
        for (int i = 0; i < gifts.size(); i++) {
            gifts.remove("None");
        }
        for (String gift : gifts) {
            System.out.print(gift + " ");
        }
    }
}
