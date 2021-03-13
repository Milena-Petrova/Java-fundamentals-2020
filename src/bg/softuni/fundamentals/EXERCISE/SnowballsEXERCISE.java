package bg.softuni.fundamentals.EXERCISE;

import java.util.Scanner;

public class SnowballsEXERCISE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());//number of snowballs

        int snowBallSnowMax=0;
        int snowballTimeMax=0 ;
        int snowballQualityMax=0;
        int snowballValueMax = 0;
        for (int i = 1; i <= input; i++) {
            int snowBallSnow = Integer.parseInt(scanner.nextLine());
            int snowballTime = Integer.parseInt(scanner.nextLine());
            int snowballQuality = Integer.parseInt(scanner.nextLine());
            int currentSnowballValue = (int) Math.pow((double) (snowBallSnow / snowballTime), (double) (snowballQuality));
            if (currentSnowballValue > snowballValueMax) {
                snowballValueMax = currentSnowballValue;
                snowBallSnowMax=snowBallSnow;
                snowballTimeMax=snowballTime ;
                snowballQualityMax=snowballQuality;
            }
        }
            System.out.printf("%d : %d = %d (%d)", snowBallSnowMax, snowballTimeMax, snowballValueMax, snowballQualityMax);
        }
    }
