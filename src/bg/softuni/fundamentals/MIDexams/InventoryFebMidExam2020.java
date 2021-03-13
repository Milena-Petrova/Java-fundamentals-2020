package bg.softuni.fundamentals.MIDexams;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*You will receive a journal with some Collecting items, separated with ', ' (comma and space).
After that, until receiving "Craft!" you will be receiving different commands.
Commands (split by " - "):
•	"Collect - {item}" – Receiving this command, you should add the given item in your inventory. If the item already exists, you should skip this line.
•	"Drop - {item}" – You should remove the item from your inventory, if it exists.
•	"Combine Items - {oldItem}:{newItem}" – You should check if the old item exists, if so, add the new item after the old one. Otherwise, ignore the command.
•	"Renew – {item}" – If the given item exists, you should change its position and put it last in your inventory.
Input:
Iron, Sword
Drop - Bronze
Combine Items - Sword:Bow
Renew - Iron
Craft!
OUTPUT: Sword, Bow, Iron
*/
public class InventoryFebMidExam2020 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = readArrayList(scanner.nextLine());
        String command = scanner.nextLine();
        while (!command.equals("Craft!")){
            String[]line = command.split(" - ");
            String operation = line[0];
            String item = line[1];
            switch (operation){
                case "Collect":
                    if(!list.contains(item)) {
                        collectItem(list, item);
                    }
                    break;
                case "Drop":
                    if(list.contains(item)) {
                        dropItem(list, item);
                    }
                    break;
                case "Combine Items":
                    String[]operator = item.split(":");
                    String oldItem=operator[0];String newItem=operator[1];
                    if (list.contains(oldItem)) {
                        combineItems(list, oldItem, newItem);
                    }
                    break;
                case "Renew":
                    renewItem(list,item);
                default:
                    break;
            }
        command= scanner.nextLine();
        }
       printListArray(list);
    }

    private static void renewItem(List<String>list,String newItem) {
        if(list.contains(newItem)){
            list.remove(newItem);
            list.add(newItem);
        }
    }

    private static void combineItems(List<String>list,String oldItem,String newItem) {
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).equals(oldItem)) {
                    list.add(i+1, newItem);
                }
            }
    }

    private static void dropItem(List<String>list,String command){
            list.remove(command);
    }

    private static void collectItem(List<String>list,String command){
            list.add(command);
    }

    private static void printListArray(List<String> list) {
        for (int i = 0; i < list.size() ; i++) {
            System.out.print(list.get(i));
            if(i< list.size()-1){
                System.out.printf(", ");
            }
        }
    }


    private static List<String> readArrayList(String string) {
        String[]line = string.split(", ");
        List<String>list = new ArrayList<>();
        for (String s : line) {
            list.add(s);
        }
        return list;
    }
}
