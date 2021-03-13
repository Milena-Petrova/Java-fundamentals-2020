/*
Write a program, which keeps information about courses --> name and number of registered students.
Input: course name and student name
 until you receive the command "end".
 Check if such course already exists, and if not - add the course.
 Register the user into the course. After command "end",
 print the courses with their names and total registered users,
 ordered by the count of registered users in descending order. For each contest(course) print registered users
 ordered by name in ascending order
 output: "{courseName}: {registeredStudents}"
•	Print information about each student, following the format:
"-- {studentName}"
*/
package bg.softuni.fundamentals.MAPs;
import java.util.*;

public class Courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        Map<String, List<String>> courses = new LinkedHashMap<>();
        while (!input.equals("end")) {
            String[] token = input.split(" : ");

            String courseName = token[0];
            String studentName = token[1];
            //Списък с имената за всеки курс , token[0]---> courseName
            List<String> currentName = courses.get(courseName);
            if (currentName == null) {
                currentName = new ArrayList<>();
                courses.put(courseName, currentName);
            }
            currentName.add(studentName);
            input = scanner.nextLine();
        }
        courses.entrySet()
                .stream()
                .sorted((v1, v2) -> v2.getValue().size() - v1.getValue().size())
                .forEach((c) -> {
                    System.out.printf("%s: %d%n", c.getKey(), c.getValue().size());
                    c.getValue()
                            .stream()
                            .sorted((s1, s2) -> s1.compareTo(s2))
                            .forEach(s -> System.out.println("-- " + s));
                });
    }
}