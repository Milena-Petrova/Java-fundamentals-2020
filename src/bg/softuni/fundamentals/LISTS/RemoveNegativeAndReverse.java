package bg.softuni.fundamentals.LISTS;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class RemoveNegativeAndReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = ReadArrayList(scanner);
        List<Integer> nonNegativeList = new ArrayList<>();
        //обхожда входня лист и добавя само положителните в нов лист
        for (Integer integer : list) {
            if(integer>=0){
                nonNegativeList.add(integer);
            }
        }
        if(nonNegativeList.isEmpty()){//if(nonNegativeList.size()==0)
            System.out.println("empty");
        }
        Collections.reverse(nonNegativeList);
        for (int number : nonNegativeList) {
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
