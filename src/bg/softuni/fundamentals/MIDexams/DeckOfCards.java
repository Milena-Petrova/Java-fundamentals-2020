package bg.softuni.fundamentals.MIDexams;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DeckOfCards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> deckOfCard = readList(scanner.nextLine());
        int input = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= input; i++) {
            String command = scanner.nextLine();
            String[] token = command.split(", ");
            switch (token[0]) {
                case "Add":
                    addCard(deckOfCard, token[1]);
                    break;
                case "Remove":
                    removeCard(deckOfCard, token[1]);
                    break;
                case "Remove At":
                    removeAtIndex(deckOfCard, Integer.parseInt(token[1]));
                    break;
                case "Insert":
                    insertCard(deckOfCard, Integer.parseInt(token[1]), token[2]);
                    break;
            }
        }
        printList(deckOfCard);
    }


    private static void printList(List<String>list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
            if (i < list.size() - 1) {
                System.out.print(", ");
            }
        }
    }

    private static void insertCard(List<String>list, int index, String cardName){
        if(0<=index&&index<list.size()) {
            if (!list.contains(cardName)) {
                list.add(index,cardName);
                System.out.println("Card successfully bought");
            }else{
                System.out.println("Card is already bought");
            }
        }else{
            System.out.println("Index out of range");
        }
    }

private static void removeAtIndex(List<String>list, int index){
        if(0<=index&&index<list.size()) {
            list.remove(index);
            System.out.println("Card successfully sold");
        }else{
            System.out.println("Index out of range");
        }
}
    private static void removeCard(List<String>list, String cardName){
        if(list.contains(cardName)) {
            list.remove(cardName);
            System.out.println("Card successfully sold");
        }else{
            System.out.println("Card not found");
        }
    }

    private static void addCard(List<String>list, String cardName){
        if(list.contains(cardName)) {
            System.out.println("Card is already bought");
        }else{
            System.out.println("Card successfully bought");
            list.add(cardName);
        }
    }
    public static List<String> readList(String line) {
        String[] lineAsStrings = line.split(", ");
        List<String> elements = new ArrayList<>();
        //чете с краткия foreach
        for (String s : lineAsStrings) {
            elements.add(s);
        }
        return elements;
    }
}
