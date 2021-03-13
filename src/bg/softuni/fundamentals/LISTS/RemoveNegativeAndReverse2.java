package bg.softuni.fundamentals.LISTS;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class RemoveNegativeAndReverse2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[]numbersAsArray = line.split("\\s+");
        List<Integer>numbers = new ArrayList<>();
        for (String s : numbersAsArray) {
            int number = Integer.parseInt(s);
            numbers.add(number);
        }
        int i = 0;
        while (i<numbers.size()) {
            if (numbers.get(i) < 0) {
                numbers.remove(i);
            } else {
                i++;
            }
        }
        if(numbers.isEmpty()){
            System.out.println("empty");
        }
        Collections.reverse(numbers);
        for (Integer number : numbers) {
            System.out.print(number+" ");
        }
    }
}
