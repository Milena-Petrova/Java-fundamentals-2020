package bg.softuni.fundamentals.ARRAYS;

import java.util.Scanner;

public class READarray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String arrayAsString = scanner.nextLine();//входните данни са цял стринг
        String[] numberAsString = arrayAsString.split(" ");//разделяме го по спейсовете в стринг масив

        int[] arr = new int[numberAsString.length];//задаваме числов масив с размер = размера на входния стринг

        for (int i = 0; i < arr.length; i++) {//присвояваме стойностите на числовия масив=стойностите от стринговия
            arr[i] = Integer.parseInt(numberAsString[i]);//парсваме всеки стринг елемент към число
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
