package bg.softuni.fundamentals.MAPs;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Double,Integer> numberOccurences = new TreeMap<>();
        String[] line = scanner.nextLine().split(" ");
     //   double[]numbers = new double[line.length];
        for (int i = 0; i < line.length ; i++) {
            double number = Double.parseDouble(line[i]);
            //брой срещания на числото
            Integer occurences = numberOccurences.get(number);
             if(occurences==null) {
                 occurences = 0;
             }
             numberOccurences.put(number,occurences+1);
        }
        for (Map.Entry<Double, Integer> entry : numberOccurences.entrySet()) {
        //  System.out.println(entry.getKey()+" -> "+ entry.getValue());
            System.out.printf("%.0f -> %d%n",entry.getKey(),entry.getValue());
        }

    }
}
