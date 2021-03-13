package bg.softuni.fundamentals.MIDexams;
/*There are 3 employees working on the reception all day long. Each of them can handle different number of people per hour. Your task is to calculate how much time it will take to answer all the questions of a given number of people.
First you will receive 3 lines with integers, representing the count of people that each of the employee can help per hour. On the next line you will receive the total people count as a single integer.
Every fourth hour all the employees have a one-hour break before they start working again. This is the only break they get because they don`t need rest and have no personal life. Calculate the time needed to answer all people`s questions and print it in the following format: "Time needed: {time}h."
*/
import java.util.Scanner;

public class NationalCourt_01_FEBRUARY_MId_2020 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       int efficiency = scanner.nextInt()+ scanner.nextInt()+ scanner.nextInt();
       int peopleCount =scanner.nextInt();

        int time = 0;
        while (peopleCount>0) {
            time++;
            if (time % 4 != 0) {
                peopleCount -= efficiency;
            }
        }
        System.out.printf("Time needed: %dh.",time);

    }
}
