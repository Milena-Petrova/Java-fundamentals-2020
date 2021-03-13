package bg.softuni.fundamentals.MIDexams;
/*Create a program that checks if you can save the money for the Disneyland’s journey.
You have a certain number of months for which you can collect the money.
At the end of each month, you save 25% of the cost of the journey.
At the beginning of every odd month (except the first one) you spent 16% of the money collected so far for clothes and shoes.
Every 4th (fourth) month at the beginning of the month your boss gives you а bonus. It is 25% of the money collected so far.
If you save enough money for the journey, calculate how much money will be left for the souvenirs. Then print the following:
"Bravo! You can go to Disneyland and you will have {money}lv. for souvenirs."
If the saved money is less you should calculate how much money you need more. Then print the following:
"Sorry. You need {money}lv. more."
Both numbers should be formatted to the 2nd decimal place.
*/

import java.util.Scanner;

public class DisneyJourneMidExam_Dec2019 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double neededMoney = Double.parseDouble(scanner.nextLine()); //needed money for the journey
        int monthsToSave = scanner.nextInt();//months to save money
        double savedMoneyPerMonth = 25 * neededMoney / 100;//25% може да спестява всеки месец от тази сума
        double sumSaved = 0;
        for (int i = 1; i <= monthsToSave; i++) {
            if (i % 2 != 0) {
                sumSaved -= sumSaved * 16 / 100;// в началото на нечетен месец, тоест след четен -->16% разход
            }
            if (i % 4 == 0) {
                double bonus = 25 * sumSaved / 100;
                sumSaved += bonus;
            }
            sumSaved += savedMoneyPerMonth;
        }
        double leftMoneyForSouvenirs = sumSaved - neededMoney;
        if (leftMoneyForSouvenirs > 0) {
            System.out.printf("Bravo! You can go to Disneyland and you will have %.2flv. for souvenirs.", leftMoneyForSouvenirs);
        } else {
            System.out.printf("Sorry. You need %.2flv. more.", Math.abs(leftMoneyForSouvenirs));
        }
    }
}
