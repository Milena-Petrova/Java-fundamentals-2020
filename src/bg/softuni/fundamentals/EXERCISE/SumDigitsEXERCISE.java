package bg.softuni.fundamentals.EXERCISE;

import java.util.Scanner;

public class SumDigitsEXERCISE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        //четем числото като стринг, целта е после да сумираме цифрите му
int sum =0;
        for (int i = 0; i <input.length() ; i++) {
            int num = (int)input.charAt(i)-48;
            sum+=num;
        }
        System.out.println(sum);

    }
}
