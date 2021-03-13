package bg.softuni.fundamentals.MAPs;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Largest3Numbers {
    public static void main(String[] args) {
        //Read a list of integers and print largest 3 of them. If there are less than 3, print all of them.
        //Input	Output
        //10 30 15 20 50 5	---> 50 30 20
        //20 30 --> 30 20
        Scanner scanner = new Scanner(System.in);
       String[]line=scanner.nextLine().split(" ");
        Arrays.stream(line)
               .map(Integer::parseInt)
                .sorted(Comparator.reverseOrder())
                .limit(3)
                .collect(Collectors.toList())
                .forEach(l-> System.out.print(l+" "));
        /*
         Arrays.stream(line)
               .map(l->Integer.parseInt(l))
                .sorted((l1,l2) -> l2.compareTo(l1))
                .limit(3)
                .collect(Collectors.toList())
                .forEach(l-> System.out.print(l+" "));
         */

    }
}
