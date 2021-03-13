package bg.softuni.fundamentals.LISTS;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//index:0 1 2 3 4 5                       0 1 2 3 4            0 1 2 3             0 1 2
//       8 2 2 4 8 16 --> 16 8 16 (2+2=4)->8 4 4 8 16 (4+4=8)-> 8 8 8 16 (8+8=16)->16 8 16
//3 3 6 1 --> 12 18 2 2 4 8 16
//5 4 2 1 1 4 --> 5 8 4
public class SumAdjacentEqualNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Double> number = ReadInputList(scanner);
        boolean search = true;
        while (search) {
            search = false;
            for (int i = 0; i < number.size() - 1; i++) {
                double current = number.get(i);
                double next = number.get(i + 1);
                if (current == next) {
                    number.remove(i);
                    number.set(i, current + next);
                    search = true;
                    break;
                }
            }
        }
        for (double num : number) {
            System.out.print(new DecimalFormat("0.#").format(num)+" ");
            //System.out.println(new DecimalFormat("0.####").format(mathPower(number, power)));
        }
    }
    private static List<Double> ReadInputList(Scanner scanner) {
        String line = scanner.nextLine();
        String[] array = line.split("\\s+");
        List<Double> numbers = new ArrayList<>();
        for (String s : array) {
            double number = Double.parseDouble(s);
            numbers.add(number);
        }
        return numbers;
    }
}

