package bg.softuni.fundamentals.MIDexams;

import java.util.Scanner;

/*Problem 1. Bonus Scoring System
Create a program that calculates bonus points for each student, for a certain course.
On the first line, you are going to receive the count of the students for this course.
On the second line, you will receive the count of the lectures in the course.
Every course has an additional bonus. You are going to receive it on the third line.
On the next lines, you will be receiving the count of attendances for each student.
The bonus is calculated with the following formula:
{total bonus} = {student attendances} / {course lectures} * (5 + {additional bonus})
Find the student with the maximum bonus and print him/her, along with his attendances in the following format:
"Max Bonus: {maxBonusPoints}."
"The student has attended {studentAttendances} lectures."
Round the bonus points at the end to the nearest bigger number.
input:5 ------> output: Max Bonus: 34.
                         The student has attended 24 lectures.
25
30
12
19
24
16
20

*/
public class BonusScoring_MidExam_feb2020 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfStudents = Integer.parseInt(scanner.nextLine());
        int countOfLectures = Integer.parseInt(scanner.nextLine());
        int initialBonus = Integer.parseInt(scanner.nextLine());

        double maxBonusPoints=0;
        int attendanceOfTopStudent=0;
        for (int i = 0; i <numberOfStudents; i++) {
            int studentAttendances = Integer.parseInt(scanner.nextLine());
            double totalBonus = (double)studentAttendances / countOfLectures * (5 + initialBonus);
            if (totalBonus>maxBonusPoints){
                maxBonusPoints=totalBonus;
                attendanceOfTopStudent=studentAttendances;
            }
        }
        System.out.printf("Max Bonus: %d.%n",(int)Math.round(maxBonusPoints) );
        System.out.printf("The student has attended %d lectures.",attendanceOfTopStudent);
    }
}
