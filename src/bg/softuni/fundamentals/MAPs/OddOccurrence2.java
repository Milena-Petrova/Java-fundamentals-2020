package bg.softuni.fundamentals.MAPs;

import java.util.*;

//?????????????НЕ мога да изведа резултата със запетайки
/*Write a program that extracts from a given sequence of words all elements that present in it odd number of times (case-insensitive).
•	Words are given in a single line, space separated.
•	Print the result elements in lowercase, in their order of appearance
input: 3 5 5 hi pi HO Hi 5 ho 3 hi pi
output: 5, hi
*/
public class OddOccurrence2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> numberOccurences = new LinkedHashMap<>();
        String[] line = scanner.nextLine().split(" ");
        //   double[]numbers = new double[line.length];
        for (int i = 0; i < line.length; i++) {
            String element = line[i].toLowerCase();

            //брой срещания на elementa
            Integer occurences = numberOccurences.get(element);
            if (occurences == null) {
                occurences = 0;
            }
            numberOccurences.put(element, occurences + 1);
        }
      for (Map.Entry<String, Integer> entry : numberOccurences.entrySet()) {
            if (entry.getValue() % 2 != 0) {
                System.out.print(entry.getKey());
                System.out.print(", ");
            }

        }
    }
}



