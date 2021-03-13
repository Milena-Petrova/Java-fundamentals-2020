package bg.softuni.fundamentals.LABS;

import java.util.Scanner;

public class Elevator1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfpeople = Integer.parseInt(scanner.nextLine());
        int capacity = Integer.parseInt(scanner.nextLine());
        int courses = numOfpeople / capacity;
        if (numOfpeople % capacity != 0) {
            courses += 1;
        }
        System.out.println(courses);
    }
}

