package bg.softuni.fundamentals.LISTS;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MergingLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> firstList = readArray(scanner);
        List<Integer> secondList = readArray(scanner);

        List<Integer>mergedList = new ArrayList<>();//общият списък, който ще извеждаме на конзолата
        int indexFirst = 0;
        int indexSecond = 0;
        //докато индексите съществуват в съответните листове, добавяме елементи в новия лист
        while (indexFirst<firstList.size()||indexSecond<secondList.size()){
            if(indexFirst<firstList.size()) {
                mergedList.add(firstList.get(indexFirst));
            }
            if(indexSecond< secondList.size()) {
                mergedList.add(secondList.get(indexSecond));
            }
           indexFirst++;
           indexSecond++;
        }
        for (int integer : mergedList) {
            System.out.print(integer+" ");
        }
    }
    private static List<Integer> readArray(Scanner scanner) {
        String line = scanner.nextLine();
        String[] lineAsSting = line.split("\\s+");
        List<Integer> numbers = new ArrayList<>();
        for (String s : lineAsSting) {
            int num = Integer.parseInt(s);
            numbers.add(num);
        }
        return numbers;
    }
}
