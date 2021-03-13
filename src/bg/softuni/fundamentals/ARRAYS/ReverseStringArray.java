package bg.softuni.fundamentals.ARRAYS;

import java.util.Scanner;

public class ReverseStringArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] elements = line.split( " ");
  //read and swap values -> save old values elements -> reverse elemеnt positions
        for (int i = 0; i < elements.length/2 ; i++) {
        int oldIndex = elements.length-1-i;
        String old = elements[i];
        elements[i] = elements[oldIndex];
        elements[oldIndex]= old;
        }
      //  for (int i = 0; i < elements.length ; i++) {
     //       System.out.print(elements[i]+" ");
   //     }
        System.out.println(String.join(" ",elements));//печатане на стринг масива чрез join функцията
    }
}
