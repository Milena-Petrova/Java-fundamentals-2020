package bg.softuni.fundamentals.LISTS;

import java.util.*;


/*Write a program to append several arrays of numbers.
	Arrays are separated by "|"
	Values are separated by spaces (" ", one or several)
	Order the arrays from the last to the first, and their values from left to right
1 2 3 |4 5 6 |  7  8	7 8 4 5 6 1 2 3*/
public class AppendArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> line = readAndSplitList(scanner.nextLine());
         Collections.reverse(line);
        //  List<String[]> list = new ArrayList<>();

        for (int i = 0; i < line.size(); i++) {
            String input = line.get(i);
            String[] current = input.split("\\s+");
            for (int j = 0; j < current.length; j++) {

               // if(!current[j].equals(""))
                System.out.print(current[j]+" ");
            }
        }
    }

        private static List<String> readAndSplitList(String line){
            List<String> strings = new ArrayList<>();
            String[] lineAsArray = line.split("\\|");
            for (String s : lineAsArray) {
                strings.add(s);
            }
            return strings;
        }
    }
