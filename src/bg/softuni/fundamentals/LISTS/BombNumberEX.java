package bg.softuni.fundamentals.LISTS;
/*Write a program that reads sequence of numbers and special bomb number with a certain power.
Your task is to detonate every occurrence of the special bomb number and according to its power -
his neighbors from left and right. Detonations are performed from left to right and all detonated numbers disappear.
 Finally print the sum of the remaining elements in the sequence.
 1 2 2 4 2 2 2 9    ---------> output : 12
4 2
Special number is 4 with power 2. After detonation we left with the sequence [1, 2, 9] with sum 12.
 */

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BombNumberEX {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> input = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        int bombNumber = input.get(0);
        int power = input.get(1);
        while(numbers.contains(bombNumber)){
                int indexBomb = numbers.indexOf(bombNumber);

                int leftBound = Math.max(0, indexBomb - power);
                int rightBound = Math.min(indexBomb + power, numbers.size() - 1);

                for (int i = rightBound; i>=leftBound ; i--) {
                    numbers.remove(i);
                }
            }

            int sum =0;
            for (Integer number : numbers) {
                sum+=number;
            }
        System.out.print(sum);
        }
    }

