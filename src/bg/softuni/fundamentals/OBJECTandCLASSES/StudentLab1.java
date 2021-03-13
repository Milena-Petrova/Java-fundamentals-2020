package bg.softuni.fundamentals.OBJECTandCLASSES;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentLab1 {
    static class Student{
        String firstName;
        String lastName;
        int age;
        String homeTown;

        public Student(String firstName, String secondName, int age, String city){
            this.firstName = firstName;
            this.lastName = secondName;
            this.age = age;
            this.homeTown = city;
        }
        public String getFirstName() {
            return firstName;
        }
        public String getLastName() {
            return lastName;
        }
        public int getAge() {
            return age;
        }
        public String getHomeTown() {
            return homeTown;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<Student> students = new ArrayList<>();
        while (!input.equals("end")) {
            String[] line = input.split(" ");
            Student st1 = new Student(line[0], line[1], Integer.parseInt(line[2]), line[3]);
            students.add(st1);
            input = scanner.nextLine();
        }
        String city = scanner.nextLine();
        for (Student student : students) {
            if (student.getHomeTown().equals(city)) {
                System.out.printf("%s %s is %d years old%n", student.getFirstName(),student.getLastName(),student.getAge());
            }
        }
    }
}
