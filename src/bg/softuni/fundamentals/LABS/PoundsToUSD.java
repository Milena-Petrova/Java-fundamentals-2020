package bg.softuni.fundamentals.LABS;

import java.math.BigDecimal;
import java.util.Scanner;

public class PoundsToUSD {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
           double input = Double.parseDouble(scanner.nextLine());//pounds, 1British pound = $1.31
            BigDecimal pound = new BigDecimal(input);
           // BigDecimal convert = new BigDecimal("1.31");
            BigDecimal usd = pound.multiply(BigDecimal.valueOf(1.31));
            double cash = usd.doubleValue();
           System.out.printf("%.3f",cash);
        }
    }

