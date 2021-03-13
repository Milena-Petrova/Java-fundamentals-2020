package bg.softuni.fundamentals.ARRAYS;

import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //   int n = Integer.parseInt(scanner.nextLine());
        int[] numbers = new int[4];
        for (int i = 0; i < numbers.length; i++) {//въвеждаме входните данните
            numbers[i] = scanner.nextInt();
        }
        for (int i = numbers.length-1; i >=0 ; i--) { //извеждаме/рпинтираме числата в обратен ред
            System.out.print(numbers[i]+" ");
        }
    }
}
