package bg.softuni.fundamentals.EXERCISE;

import java.util.Scanner;

public class RageExpensesEXERCISE {
    public static void main(String[] args) {
        /*Every 2 lost game,-> one trashed headset.
         Every 3 lost game, one trashed mouse.
         When Pesho trashes both his mouse and headset in the same lost game,
         he also trashes his keyboard => every 6th lost game.
        Every 2 time, when he trashes his keyboard, he also trashes his display.=> every 12th lost game
OUTPUT: •	On the first input line - lost games count – integer in the range [0, 1000].
•	On the second line – headset price - floating point number in range [0, 1000].
•	On the third line – mouse price - floating point number in range [0, 1000].
•	On the fourth line – keyboard price - floating point number in range [0, 1000].
•	On the fifth line – display price - floating point number in range [0, 1000].

•	As output you must print Pesho`s total expenses: "Rage expenses: {expenses} lv."
•	Allowed working time / memory: 100ms / 16MB.

*/        Scanner scanner = new Scanner(System.in);
        int lostGames = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double kbdPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());
        double expenses;
        int trashedHeadset = lostGames/2;//how many times the hardware was trashed
        int trashedMouse = lostGames/3;
        int trashedKBD = lostGames/6;//everytime, when the mouse and the headset are trashed 2*3
        int trashedDisplay = lostGames /12;

        expenses = trashedHeadset*headsetPrice + trashedKBD*kbdPrice+trashedMouse*mousePrice+trashedDisplay*displayPrice;
        System.out.printf("Rage expenses: %.2f lv.",expenses);
    }

}
