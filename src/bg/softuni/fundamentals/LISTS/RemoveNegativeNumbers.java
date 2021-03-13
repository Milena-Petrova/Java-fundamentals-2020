package bg.softuni.fundamentals.LISTS;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/*
0   1  2  3  4  ->  0  1  2  3  -> 0   1  2
13 -5 -6 10 42     13 -6 10 42     13 10 42
*/

public class RemoveNegativeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = ReadArrayList(scanner);
        int i = 0;
        while (i < list.size()) {
            //ако елемента <0 -> реможе ->продължава while цикъла без да се променя i
            if (list.get(i) < 0) {
                list.remove(i);
            } else {//ако е елемента >0 -> i се премества с една стъпка и продължаваме
                i++;
            }
        }
        for (int number : list) {
            System.out.print(number + " ");
        }
    }
        private static List<Integer> ReadArrayList (Scanner scanner){
            String line = scanner.nextLine();
            String[] array = line.split(" ");
            List<Integer> list = new ArrayList<>();
            for (String s : array) {
                int number = Integer.parseInt(s);
                list.add(number);
            }
            return list;
        }
    }

