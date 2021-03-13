package bg.softuni.fundamentals.EXERCISE;

import java.util.Scanner;

public class SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startYield = Integer.parseInt(scanner.nextLine());//начален добив

        int totalExtractAmount=0;
        int days=0;
        while (startYield>=100){
            int dayYield = startYield-26;
            totalExtractAmount +=dayYield;
            days++;
            startYield-=10;
        }
        if(totalExtractAmount>26) {
            totalExtractAmount = totalExtractAmount - 26;
        }
        System.out.println(days);
        System.out.println(totalExtractAmount);
    }
}
