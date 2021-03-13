package bg.softuni.fundamentals.ARRAYS;

import java.util.Scanner;

public class EqualArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //прочитам двата реда входни данни и присвоявам стойностите им на два числови масива
        String first = scanner.nextLine();

        String[]firstLine = first.split(" ");
        int[] firstNumbers = new int[firstLine.length];
        for (int i = 0; i < firstNumbers.length; i++) {
            firstNumbers[i] = Integer.parseInt(firstLine[i]);
        }
        String second = scanner.nextLine();
        String[]secondLine = second.split(" ");
        int[] secondNumbers = new int[secondLine.length];
        for (int i = 0; i < secondNumbers.length ; i++) {
            secondNumbers[i] = Integer.parseInt(secondLine[i]);
        }
        //ако двата масива имат равен брой елементи->areEqual=true

        boolean areEqual = true;
        int difIndex =-1;          //следим на кой индекс се различават стойностите
    if(firstNumbers.length== secondNumbers.length){
        for (int i = 0; i < firstNumbers.length ; i++) {
            if (firstNumbers[i] != secondNumbers[i]) {
                //ако всеки съответен елемент от двата масива е с равна стйност -> areEqual =true, иначе е false
                //ако тзи проверка е изпълнена -> трябва да прекъснем цикъла
                areEqual = false;
                difIndex = i;
                break;
            }
        }
    }else{
        areEqual=false;
    }
    if(areEqual){  //ако са идентични-> обхождаме първия масив и сумраме всичк числа ->numbers е променливата
        int sum =0;
        for (int number: firstNumbers) {
            sum+=number;
        }
        System.out.printf("Arrays are identical. Sum: %d",sum);
    }else{
        System.out.printf("Arrays are not identical. Found difference at %d index.",difIndex);
    }

    }
}
