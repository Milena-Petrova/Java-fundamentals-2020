package bg.softuni.fundamentals.LABS;

import java.util.Scanner;

public class Refactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //вход число n; изход n броя нечетни числа, започващи от 1
        int n = Integer.parseInt(sc.nextLine());
        int sum = 0;
        for (int i = 0; i < n; i++) {
            System.out.print(2 * i + 1);
            System.out.println();
            sum += (2*i+1);
        }
        System.out.printf("Sum: %d%n", sum);
    }
}
