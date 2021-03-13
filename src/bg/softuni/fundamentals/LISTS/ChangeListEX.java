package bg.softuni.fundamentals.LISTS;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*Write a program, which reads a list of integers from the console and receives commands,
 which manipulate the list. Your program may receive the following commands:
•	Delete {element} - delete all elements in the array, which are equal to the given element
•	Insert {element} {position} - insert element at the given position
You should stop the program when you receive the command "end". */
public class ChangeListEX {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] numbersAsStrings = line.split("\\s+");
        List<Integer> numbers = new ArrayList<>();
        for (String numbersAsString : numbersAsStrings) {
            int number = Integer.parseInt(numbersAsString);
            numbers.add(number);
        }
        String input = scanner.nextLine();
        while (!input.equals("end")) {
            String[] tokens = input.split("\\s+");
            switch (tokens[0]) {
                case "Delete":
                    int elementToDelete = Integer.parseInt(tokens[1]);
                    while (numbers.contains(Integer.valueOf(elementToDelete))){
                        numbers.remove(Integer.valueOf(elementToDelete));
                    }
                    break;
                case "Insert":
                    int elementToAdd = Integer.parseInt(tokens[1]);
                    int index = Integer.parseInt(tokens[2]);
                    if(index<numbers.size()){
                    numbers.add(index,elementToAdd);
                    }
                    break;

            }
            input = scanner.nextLine();
        }
        for (Integer number : numbers) {
            System.out.print(number + " ");
        }
    }
}

