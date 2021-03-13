package bg.softuni.fundamentals.ARRAYS;

import java.util.Scanner;
//You will be given a count of wagons in a train n.
// On the next n lines, you will receive how many people
// are going to get on that wagon. At the end print the whole train and after that
// the sum of the people in the train.
public class TrainsEXERCISE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int wagons = Integer.parseInt(scanner.nextLine());
        int[]people = new int[wagons];
        int sum = 0;
        for (int i = 0; i < people.length ; i++) {
            people[i]=Integer.parseInt(scanner.nextLine());
            sum+= people[i];
            System.out.print(people[i]+" ");
        }
        System.out.println();
        System.out.println(sum);
    }
}
