package bg.softuni.fundamentals.LISTS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/*You will be given numbers (list of integers) on the first input line. Until you receive "End" you will be given operations you have to apply on the list. The possible commands are:
•	Add {number} - add number at the end
•	Insert {number} {index} - insert number at given index
•	Remove {index} - remove that index
•	Shift left {count} - first number becomes last 'count' times
•	Shift right {count} - last number becomes first 'count' times
1 23 29 18 43 21 20  -----> output : 43 20 5 1 23 29 18
Add 5
Remove 5
Shift left 3
Shift left 1
End
*/
public class ListOperationsEX {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());
        String command = scanner.nextLine();
        while (!command.equals("End")) {
            String[] token = command.split("\\s+");
            switch (token[0]) {
                case "Add":
                    int numberToAdd = Integer.parseInt(token[1]);
                    numbers.add(numberToAdd);
                    break;
                case "Remove":
                    int indexToRemove = Integer.parseInt(token[1]);
                    if (0 <= indexToRemove && indexToRemove < numbers.size()) {
                        numbers.remove(indexToRemove);
                    } else {
                        System.out.println("Invalid index");
                    }
                    break;
                case "Insert":
                    int index = Integer.parseInt(token[2]);
                    int elementToAd = Integer.parseInt(token[1]);
                    if (0 <= index && index < numbers.size()) {
                        numbers.add(index, elementToAd);
                    } else {
                        System.out.println("Invalid index");
                    }
                    break;
                case "Shift":
                    int count = Integer.parseInt(token[2]);
                    String direction = token[1];
                    shift(numbers, direction, count);
                    break;
            }
            command = scanner.nextLine();
        }
        for (Integer number : numbers) {
            System.out.print(number+" ");
        }
    }

    private static void shift(List<Integer> numbers, String direction, int count) {
        switch (direction){
            case "left":
                for (int i = 0; i <count ; i++) {
                    int first = numbers.get(0);
                    numbers.remove(0);
                    numbers.add(first);
                }
                break;
            case "right":
                for (int i = 0; i <count ; i++) {
                    int last = numbers.get(numbers.size()-1);
                    numbers.remove(numbers.size()-1);
                    numbers.add(0,last);
                }
                break;
        }
    }
}