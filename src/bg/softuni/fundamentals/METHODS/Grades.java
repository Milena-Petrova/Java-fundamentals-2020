package bg.softuni.fundamentals.METHODS;

import java.util.Scanner;
//•	2.00 – 2.99 - "Fail"
//•	3.00 – 3.49 - "Poor"
//•	3.50 – 4.49 - "Good"
//•	4.50 – 5.49 - "Very good"
//•	5.50 – 6.00 - "Excellent"
public class Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double input = Double.parseDouble(scanner.nextLine());
        if (2 <= input && input <= 6) {
            printGrades(input);
        }
    }

    private static double printGrades(double grade){
        if(2<=grade&&grade<3){
            System.out.println("Fail");}
        if(3<=grade&&grade<3.5){
            System.out.println("Poor");}
        if(3.5<=grade&&grade<4.5){
            System.out.println("Good");}
        if (4.5<=grade&&grade<5.5){
            System.out.println("Very good");}
        if(5.5<=grade&&grade<=6){
            System.out.println("Excellent");
        }
        return grade;
    }
}

