package bg.softuni.fundamentals.METHODS;

import java.util.Scanner;

/*Write a method that receives a single integer n and prints nxn matrix with that number.*/
public class NxNMatrixEX {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());
       printSquareMatrix(input);
    }
    private static void printSquareMatrix(int n){
        for (int i = 0; i <n ; i++) {
            System.out.println();
            for (int j = 0; j <n ; j++) {
                System.out.print(n+" ");
            }
        }
    }
}
