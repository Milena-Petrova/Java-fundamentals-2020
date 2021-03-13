package bg.softuni.fundamentals.LISTS;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//1 2 3 4 5 --> 6 6 3
//1 2 3 4 --> 5 5
public class GaussTrick {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[]line = scanner.nextLine().split("\\s+");
        List<Integer>numbers = new ArrayList<>();
        for (String s : line) {
            int number = Integer.parseInt(s);
            numbers.add(number);
        }
        if(numbers.size()%2==0) {
            for (int i = 0; i <= numbers.size() / 2; i++) {
                int newNum = numbers.get(i) + numbers.get(numbers.size() - 1);
                numbers.set(i, newNum);
                numbers.remove(numbers.size() - 1);
            }
        }else{
            for (int i = 0; i <numbers.size()/2; i++) {
                int newNum = numbers.get(i) + numbers.get(numbers.size() - 1);
                numbers.set(i, newNum);
                numbers.remove(numbers.size() - 1);
            }
        }

        for (Integer number : numbers) {
            System.out.print(number+" ");
        }
    }
}
