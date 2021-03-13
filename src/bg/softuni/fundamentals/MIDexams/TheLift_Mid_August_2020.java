package bg.softuni.fundamentals.MIDexams;

import java.util.Scanner;

/*
Every wagon should have a maximum of 4 people on it. If a wagon is full you should direct the people to the next one with space available.
Input
•	On the first line you, will receive how many people are waiting to get on the lift
•	On the second line, you will you will receive the current state of the lift separated by " ".
Output
When there is no more available space left on the lift, or there are no more people in the queue,
you should print on the console the final state of the lift's wagons separated by " " and one of the following messages:
•	If there are no more people and the lift have empty spots you should print:
"The lift has empty spots!
{wagons separated by ' '}"
•	If there are still people on the queue and no more available space, you should print:
"There isn't enough space! {people} people in a queue!
{wagons separated by ' '}"
•	If the lift is full and there are no more people in the queue, you should print only the wagons separated by " "
*/

public class TheLift_Mid_August_2020 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int waitingPeople = Integer.parseInt(scanner.nextLine());
        String wagonStatus = scanner.nextLine();
        int[] wagons = arrayOfStrings(wagonStatus);
        boolean freeSeats = false;
        boolean zeroSeats = false;
        int queue = 0;
        for (int i = 0; i < wagons.length; i++) {
            if (waitingPeople >= currentSeats(wagons[i])) {
                waitingPeople -= currentSeats(wagons[i]);
                wagons[i] += currentSeats(wagons[i]);
                queue = waitingPeople;
            } else if (waitingPeople < currentSeats(wagons[i])) {
                freeSeats = true;
                int leftSeats = currentSeats(wagons[i]) - waitingPeople;
                wagons[i] = currentSeats(leftSeats);
                waitingPeople-=waitingPeople;
            }
            if (waitingPeople == 0) {
                zeroSeats = true;
            }
        }
        if (zeroSeats && queue==0) {
            for (int wagon : wagons) {
                System.out.print(wagon + " ");
            }
        } else if (freeSeats) {
            System.out.println("The lift has empty spots!");
            for (int wagon : wagons) {
                System.out.print(wagon + " ");
            }
        } else {
            System.out.printf("There isn't enough space! %d people in a queue!%n", queue);
            for (int wagon : wagons) {
                System.out.print(wagon + " ");
            }
        }
    }
    private static int currentSeats ( int status) {
        int freeSeats = 0;
        if (0 <= status && status <= 4) {
            switch (status) {
                case 0:
                    freeSeats = 4;
                    break;
                case 1:
                    freeSeats = 3;
                    break;
                case 2:
                    freeSeats = 2;
                    break;
                case 3:
                    freeSeats = 1;
                    break;
                case 4:
                    freeSeats = 0;
                    break;
            }

        }
        return freeSeats;
    }

    private static int[] arrayOfStrings (String line){
        String[] numberAsString = line.split("\\s+");
        int[] array = new int[numberAsString.length];
        for (int i = 0; i < array.length; i++) {//присвояваме стойностите на числовия масив=стойностите от стринговия
            array[i] = Integer.parseInt(numberAsString[i]);//парсваме всеки стринг елемент към число
        }
        return array;
    }
}
