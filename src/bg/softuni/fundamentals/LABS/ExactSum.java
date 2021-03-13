package bg.softuni.fundamentals.LABS;

import java.math.BigDecimal;
import java.util.Scanner;

public class ExactSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());//брой числа, които ще се въвеждат

        BigDecimal sum = new BigDecimal(0);//ако е друго число, се подава като стринг в ""

        for (int i = 0; i < input; i++) {
            String number = scanner.nextLine();
            BigDecimal numberOfstring = new BigDecimal(number);
            sum = sum.add(numberOfstring);
        }
            System.out.println(sum);
        }
    }

