package bg.softuni.fundamentals.MIDexams;

import java.util.Scanner;

public class Bakery_Mid_Exam_07_Nov_2020 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amountOfBiscuitsPerDayPerWorker = scanner.nextInt();
        int countOfTheWorkers = scanner.nextInt();
        int amountOfCompetingFactory = scanner.nextInt();

        int countOfBiscuits = 0;

        for (int i = 1; i <= 30; i++) {
            int countOfBuscuitsPerDay = amountOfBiscuitsPerDayPerWorker * countOfTheWorkers;
            if (i % 3 == 0) {
                countOfBuscuitsPerDay = 75 * countOfBuscuitsPerDay / 100;

            }
            countOfBiscuits += countOfBuscuitsPerDay;
        }
        System.out.printf("You have produced %d biscuits for the past month.%n", countOfBiscuits);
        double diffPercentage = (double) (countOfBiscuits - amountOfCompetingFactory) * 100 / amountOfCompetingFactory;
        if (diffPercentage > 0) {
            System.out.printf("You produce %.2f percent more biscuits.",Math.abs(diffPercentage));
        } else if (diffPercentage < 0) {
            System.out.printf("You produce %.2f percent less biscuits.",Math.abs(diffPercentage));
        }
    }
}
