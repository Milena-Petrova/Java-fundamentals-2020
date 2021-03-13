package bg.softuni.fundamentals.LABS;

import java.util.Scanner;

public class Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfpeople = Integer.parseInt(scanner.nextLine());//брой хора
        int capacity = Integer.parseInt(scanner.nextLine());//капацитет на асансьора
        int courses = (int)Math.ceil((double)numOfpeople/capacity);//брой курсове с асансьора
            System.out.println(courses);
        }
    }

