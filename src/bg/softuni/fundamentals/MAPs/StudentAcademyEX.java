package bg.softuni.fundamentals.MAPs;

import java.util.*;

public class StudentAcademyEX {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        Map<String, List<Double>> studentInfo = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());

            List<Double> current = studentInfo.get(name);
            if (current == null) {
                current = new ArrayList<>();
                studentInfo.put(name, current);
            }
            current.add(grade);
        }
        studentInfo.entrySet()
                .stream()
                .sorted((f, s) -> {
                    double firstAv = f.getValue().stream()
                            .mapToDouble(Double::doubleValue)
                            .average()
                            .getAsDouble();
                    double secondAv = s.getValue().stream()
                            .mapToDouble(Double::doubleValue)
                            .average()
                            .getAsDouble();
                    return Double.compare(secondAv, firstAv);
                }).forEach(s -> {
            double average = s.getValue().stream().mapToDouble(Double::doubleValue)
                    .average()
                    .getAsDouble();
            if (average >= 4.50) {
                System.out.printf("%s -> %.2f%n",s.getKey(),average);
            }
        });
    }
}
