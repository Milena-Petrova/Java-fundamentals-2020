package bg.softuni.fundamentals;

import java.util.Scanner;

public class SpiseMustFlowFOR {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startYield = Integer.parseInt(scanner.nextLine());//начален добив
        int totalExtractAmount=0;
        int countDays = 0;
        for (int i = startYield; i >=100 ; i-=10) {
            int dayExtractAmount = i-26;
            totalExtractAmount+=dayExtractAmount;
            countDays++;
        }
        if(totalExtractAmount>26) {
            totalExtractAmount = totalExtractAmount - 26;
        }
        System.out.println(countDays+"\n"+totalExtractAmount);

    }
}

