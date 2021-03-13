package bg.softuni.fundamentals.OBJECTandCLASSES;

import java.math.BigInteger;
import java.util.Scanner;

public class SumBigNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger first  = new BigInteger(String.valueOf(scanner.nextBigInteger()));
        BigInteger second = new BigInteger(String.valueOf(scanner.nextBigInteger()));
        BigInteger sum =first.add(second);
        System.out.println(sum);
    }
}
