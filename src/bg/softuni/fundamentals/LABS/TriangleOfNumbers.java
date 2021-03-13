package bg.softuni.fundamentals.LABS;

import java.util.Scanner;

public class TriangleOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());
        int count=1;
        for (int i = 1; i <= input ; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(count + " ");
            }
            count++;
            System.out.println();
        }
    }
}
