package bg.softuni.fundamentals.ARRAYS;

import java.util.Scanner;

public class MaxSequenceOfequalelements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] elements = scanner.nextLine().split(" ");
        int countElementsMax = 0;//брои повтарящи се символи - максимална стойност
        int index = 0;// пази стойността на индекса , когато има последователни елементи
        int maxSequenceIndex= 0;// засича индекса на максималната последователност

        for (int i = 0; i < elements.length; i++) {//обхождаме масива
            int countElements = 0; //броим елемента
            for (int j = i; j < elements.length; j++) {//започваме да обхождаме от i-та стойност и сравняваме с останалите
                if (elements[i].equals(elements[j])){
                    countElements++;
                    index = i;
                    if (countElements > countElementsMax) {
                        countElementsMax = countElements;
                        maxSequenceIndex = index;
                    }
                } else {
                    break;
                }
            }
        }

        for (int i = 0; i < countElementsMax; i++) {//печатим максимално повтарящото се число
            System.out.print(elements[i+maxSequenceIndex] + " ");
        }
    }
}