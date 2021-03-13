package bg.softuni.fundamentals.METHODS;

import java.util.Scanner;

//input -> 3
//1
//1 2
//1 2 3
//1 2
//1
public class PrintingTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= input ; i++) {
        printLine(i);
            System.out.println();
        }
        for (int i = input-1 ; i >=1 ; i--) {
            printLine(i);
            System.out.println();
        }
    }
    public static void printLine(int maksNum){
        for (int i = 1; i <= maksNum ; i++) {
            System.out.print(i+" ");
        }
    }

}
