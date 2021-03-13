package bg.softuni.fundamentals.LISTS;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/*On the first input line you are going to receive how many commands you are going to have. On the next lines you are going to receive some of the following inputs:
-	"{name} is going!"
-	"{name} is not going!"
If you receive the first type of input, you have to add the person if he/she is not in the list.
(If he/she is in the list print on the console: "{name} is already in the list!").
If you receive the second type of input, you have to remove the person if he/she is in the list.
(If not print: "{name} is not in the list!"). At the end print all guests.
 */

public class HousePartyEX {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());
        List<String> persons = new ArrayList<>();
        for (int i = 0; i <input ; i++) {
            String[]line = scanner.nextLine().split("\\s+");
            String name = line[0];
            if(line.length==3){
                if(!persons.contains(name)){
                    persons.add(name);
                }else{
                    System.out.printf("%s is already in the list!%n",name);
                }
            }if(line.length==4){
                if(persons.contains(name)){
                    persons.remove(name);
                }else{
                    System.out.printf("%s is not in the list!%n",name);
                }
            }
        }
        for (String person : persons) {
            System.out.println(person);
        }

    }
}
