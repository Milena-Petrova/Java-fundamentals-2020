package bg.softuni.fundamentals.MAPs;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();

        Map<String, List<String>> courses = new HashMap<>();

        while (!command.equals("end")) {
            String[] token = command.split(": ");
            String courseName = token[0];
            String studentName = token[1];


            if (!courses.containsKey(courseName)) {
                courses.put(courseName, new ArrayList<>());
                courses.get(courseName).add(studentName);
            }else{
                if(!courses.get(courseName).contains(studentName)){
                    courses.get(courseName).add(studentName);
                }
            }
            command = scanner.nextLine();
        }
courses.entrySet()
        .stream()
        .sorted((e1,e2)->e2.getValue().size()-e1.getValue().size())
        .forEach(e->{
            System.out.printf("%s: %s%n",e.getKey().trim(),e.getValue().size());
            e.getValue()
                   .stream().sorted((f,s)-> f.compareTo(s))
                    .forEach(v-> System.out.println("-- "+v));

        });
    }
}

