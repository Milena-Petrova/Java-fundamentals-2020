package bg.softuni.fundamentals.LISTS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
//4
// 1 2 3 4
public class ExampleReadStringLine {
    public static void main(String[] args) {
        //директно задаване на лист може да стане, както при масив
       // List<Integer>num=new ArrayList<>(Arrays.asList(1,2,3,4,5));
    //    int[]nums =new int[]{1,2,3,4,5};
//четем стринг, ако знаем, че листа ще е само на един ред подаден на конзолата
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = ParseLineOfNumbers(scanner);
        //чете с дългия фор цикъл
        /*for (int i = 0; i < numbersAsStrings.length ; i++) {
            int num = Integer.parseInt(numbersAsStrings[i]);
            numbers.add(num);//добавя текущо число в списъка

        }*/
        //AАко искаме само положителните числа в листа, хай-лесно да направим втори лист, който съдържа само положителните числа т входния лист
        List<Integer>nonNegativnmbers = new ArrayList<>();
        for (int number : numbers) {
            if(number>=0) {
                nonNegativnmbers.add(number);
            }
        }

        for (int number : nonNegativnmbers) {
            System.out.print(number+" ");
        }

       /* for (int num : numbers) {
            System.out.print(num + " ");
        }*/

    }

  //изведохме го в метод
    public static List<Integer> ParseLineOfNumbers(Scanner scanner) {
        String line = scanner.nextLine();
        String[]numbersAsStrings = line.split("\\s+");
        List<Integer>numbers = new ArrayList<>();
        //чете с краткия foreach
        for (String s : numbersAsStrings) {
            int number = Integer.parseInt(s);
            numbers.add(number);
        }
        return numbers;
    }
}
