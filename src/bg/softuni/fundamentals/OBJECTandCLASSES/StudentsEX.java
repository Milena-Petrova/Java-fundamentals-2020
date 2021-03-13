package bg.softuni.fundamentals.OBJECTandCLASSES;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentsEX {
    static class Student {
        String firstName;
        String secondName;
        double grade;

        public Student(String firstName, String secondName, double grade) {
            this.firstName = firstName;
            this.secondName = secondName;
            this.grade = grade;
        }
        public String getFirstName() {
            return firstName;
        }
        public String getSecondName() {
            return secondName;
        }
        public double getGrade() {
            return grade;
        }
        public String studentInfo(){
            return String.format("%s %s: %.2f", getFirstName(), getSecondName(), getGrade());
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        List<Student>allStudents = new ArrayList<>();

        for (int i = 0; i < n ; i++) {
            String[]input = scanner.nextLine().split(" ");
            String firstName = input[0];
            String secondName = input[1];
            double grade = Double.parseDouble(input[2]);

            Student student = new Student(firstName,secondName,grade);
            allStudents.add(student);
        }
       allStudents.stream()//sorted(s1,s2)------> s2 , s1 --> descending order
               .sorted((s1,s2)->Double.compare(s2.getGrade(),s1.getGrade()))
               .forEach(student-> System.out.println(student.studentInfo()));
    }
}
