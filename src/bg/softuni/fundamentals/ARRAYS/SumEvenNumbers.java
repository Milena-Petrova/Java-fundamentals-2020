package bg.softuni.fundamentals.ARRAYS;

import java.util.Scanner;

public class SumEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String arrayAsString = scanner.nextLine();
        //split-ваме по спейсовете и получаваме стрингов масив без спейсове с брой елементи равен на вроя на числата
        String[] splitArrayAsStrings = arrayAsString.split(" ");
        //"\\s+" - при white space 1 или повече от един
      //  int n = scanner.nextInt(); <=> numberAsStrings.length
        //след като сме сплитнали стринговия масив, го "парсваме" в числов масив, с койт вече ще работим
        int[] arrayOfnumbers = new int[splitArrayAsStrings.length];
        int sum =0;
        for (int i = 0; i < arrayOfnumbers.length; i++) {
            arrayOfnumbers[i] = Integer.parseInt(splitArrayAsStrings[i]);//за всяка позиция в числовия масив съответства парсната позицията от split масивa
            if(arrayOfnumbers[i]%2==0){
                sum+= arrayOfnumbers[i];
            }
        }
            System.out.print(sum);
        }

    }

