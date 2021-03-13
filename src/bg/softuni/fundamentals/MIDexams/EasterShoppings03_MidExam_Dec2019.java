package bg.softuni.fundamentals.MIDexams;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/*•	"Include {shop}":
o	Add the shop at the end of your list.
•	"Visit {first/last} {numberOfShops}"
o	Remove either the "first" or the "last" number of shops from your list,
depending on the input. If you have less shops on your list than the given number,
skip this command.
•	"Prefer {shopIndex1} {shopIndex2}":
o	If both of the shop indexes exist in your list, take the shops that are on them
and change their places.
•	"Place {shop} {shopIndex}"
o	Insert the shop after the given index, only if the resulted index exists.
In the end print the manipulated list in the following format:
"Shops left:
{shop1} {shop2}… {shopn}"*/

public class EasterShoppings03_MidExam_Dec2019 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> shops = readLineOfShops(scanner.nextLine());
        //int countOfCommands = Integer.parseInt(scanner.nextLine());
        int countOfCommands =Integer.parseInt(scanner.nextLine());
if(0<countOfCommands&&countOfCommands<=100) {
    for (int i = 0; i < countOfCommands; i++) {
        String[] command = scanner.nextLine().split("\\s+");
        //command[1]-->shop ; command[2]-->number/index
        switch (command[0]) {
            case "Include":
                includeShop(shops, command[1]);
                break;
            case "Visit":
                if (command[1].equals("first")) {
                    visitFirstNumberOfShops(shops, command[1], Integer.parseInt(command[2]));
                }
                if (command[1].equals("last")) {
                    visitLastNumberOfShops(shops, command[1], Integer.parseInt(command[2]));
                }
                break;
            case "Prefer":
                preferShop(shops, Integer.parseInt(command[1]), Integer.parseInt(command[2]));
                break;
            case "Place":
                placeShop(shops, command[1], Integer.parseInt(command[2]));
                break;
        }
    }
}

        System.out.println("Shops left:");
        for (String shop : shops) {
            System.out.print(shop + " ");
        }
    }
    private static void placeShop(List<String> shops, String command, int number) {
        if ((number+1) < shops.size() && number >=0) {
            shops.add((number+1),command);
        }
    }
    private static void preferShop(List<String>shops,int shopIndex1,int shopIndex2){
        if(0<=shopIndex1&&shopIndex1<shops.size()&&0<=shopIndex2&&shopIndex2<shops.size()){
            int old = shopIndex1;
            String oldS = shops.get(old);
            shops.set(shopIndex1,shops.get(shopIndex2));
            shops.set(shopIndex2, oldS);
        }
    }

    private static void visitLastNumberOfShops(List<String> shops, String command, int number) {
        if (0<=number && number <= shops.size()) {
            int left = shops.size()-number;
            int right = shops.size()-1;
            for (int i = left; i <= right; i++) {
                shops.remove(i);
                right--;
                i--;
            }
        }
    }
    private static void visitFirstNumberOfShops(List<String> shops, String command, int number) {
        if (0<=number && number <= shops.size()) {
            for (int i = number-1; i >= 0; i--) {
                shops.remove(i);
            }
        }
    }
    private static void includeShop(List<String> shops, String shop) {
        shops.add(shop);
    }
    public static List<String> readLineOfShops(String line) {
        String[] lineAsStrings = line.split("\\s+");
        List<String> elements = new ArrayList<>();
        //чете с краткия foreach
        for (String s : lineAsStrings) {
            elements.add(s);
        }
        return elements;
    }
}
