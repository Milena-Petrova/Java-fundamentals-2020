package bg.softuni.fundamentals.MAPs;
/*Write a program that extracts from a given sequence of words all elements that present in it odd number of times (case-insensitive).
•	Words are given in a single line, space separated.
•	Print the result elements in lowercase, in their order of appearance
input: 3 5 5 hi pi HO Hi 5 ho 3 hi pi
output: 5, hi
*/

import java.util.*;

public class OddOccurrances {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] line = scanner.nextLine().split(" ");
        // Map<List<String>, Integer> elements = new LinkedHashMap<>();
        List<String> elements = new ArrayList<>();
        for (int i = 0; i < line.length; i++) {
            int count = 0;
            String current = line[i].toLowerCase();
            for (int j = 0; j < line.length; j++) {
                line[j] = line[j].toLowerCase();
                if (current.equals(line[j])) {
                    count++;
                }
            }
            if (count % 2 != 0) {
                // int occerance = count;
                if(!elements.contains(current)) {
                    elements.add(current);
                }
            }
        }
        for (int i = 0; i <elements.size() ; i++) {
            System.out.print(elements.get(i));
            if(i<elements.size()-1){
                System.out.print(", ");
            }
        }
    }
}



