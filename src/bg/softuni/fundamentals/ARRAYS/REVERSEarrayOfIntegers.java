package bg.softuni.fundamentals.ARRAYS;

import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.Scanner;

public class REVERSEarrayOfIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
     //   String[] line = scanner.nextLine().split(" ");
      //  int[] numbers = new int[line.length];
     //   for (int i = 0; i < numbers.length; i++) {//с първия фор-цикъл прочитаме масива
     //       numbers[i] = Integer.parseInt(line[i]);
  //      }
        //с този фор-цикъл разменяме огледално променливите в масива, затова въртим до средата,
        // иначе ще го превъртим в първоначален вид
        int[]numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(element -> Integer.parseInt(element)).toArray();
        for (int i = 0; i < numbers.length/2 ; i++) {
            int swapIndex = numbers.length - 1 - i;//разместваме първа с последна стойност на ИНДЕКСИТЕ на масива
            //запазваме в една променлива първоначалната стойност на i-я елемент в масива
            //swap променливата пази първоначалната стойност на i-я елемент, това е oldNumber
            //при това решение имаме inplace масив, иначе може да си направим втори масив, който да съхранява обърнатите стойности
            //във втория случай, обаче това ще ни отнеме още толкова памет, което може да е условие в задачата!!!
            int swap = numbers[i];
            numbers[i] = numbers[swapIndex];
            numbers[swapIndex] = swap;
        }
            //последния фор-цикъл извежда обърнатия масив
        for (int i = 0; i < numbers.length ; i++) {
            System.out.print(numbers[i]+" ");
        }

        }
    }

