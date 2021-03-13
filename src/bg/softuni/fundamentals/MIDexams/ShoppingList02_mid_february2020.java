package bg.softuni.fundamentals.MIDexams;
/*You will receive an initial list with groceries separated by "!".
After that you will be receiving 4 types of commands, until you receive "Go Shopping!"
•	Urgent {item} - add the item at the start of the list.
If the item already exists, skip this command.
•	Unnecessary {item} - remove the item with the given name, only if it exists in the list.
 Otherwise skip this command.
•	Correct {oldItem} {newItem} – if the item with the given old name exists, change its name with the new one.
If it doesn't exist, skip this command.
•	Rearrange {item} - if the grocery exists in the list, remove it from its current position
and add it at the end of the list.
*/
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShoppingList02_mid_february2020 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> shoppingList = readLineOfGroceries(scanner.nextLine());
        String command = scanner.nextLine();
        while (!command.equals("Go Shopping!")) {
            String[]token =command.split("\\s+");
            switch (token[0]) {
                case "Urgent":
                    addUrgentItem(shoppingList,token[1]);
                    break;
                case "Unnecessary":
                    removeUnnecessaryItem(shoppingList,token[1]);
                    break;
                case "Correct":
                    correctOldItem(shoppingList,token[1],token[2] );
                    break;
                case "Rearrange":
                    rearrangeItem(shoppingList,token[1]);
                    break;
            }
            command = scanner.nextLine();
        }
        for (int i = 0; i < shoppingList.size() ; i++) {
            System.out.print(shoppingList.get(i));
            if(i!= shoppingList.size()-1){
                System.out.print(", ");
            }
        }

    }
private static void rearrangeItem(List<String>list, String item){
        if(list.contains(item)){
                String old = list.get(list.indexOf(item));
                list.remove(item);
                list.add(old);
            }
        }

    private static void correctOldItem(List<String>list, String oldItem, String newItem){
        if(list.contains(oldItem)){
            int indexOldItem = list.indexOf(oldItem);
            list.set(indexOldItem,newItem);
        }
    }
    private static void removeUnnecessaryItem(List<String>list, String item){
        if(list.contains(item)){
            list.remove(item);
        }
    }
    private static void addUrgentItem(List<String>list, String item){
        if(!list.contains(item)){
            list.add(0,item);
        }
    }
    public static List<String> readLineOfGroceries(String line) {
        String[] lineAsStrings = line.split("\\!");
        List<String> elements = new ArrayList<>();
        //чете с краткия foreach
        for (String s : lineAsStrings) {
            elements.add(s);
        }
        return elements;
    }
}
