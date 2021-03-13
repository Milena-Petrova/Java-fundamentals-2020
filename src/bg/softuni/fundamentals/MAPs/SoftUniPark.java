package bg.softuni.fundamentals.MAPs;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniPark {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        Map<String, String> park = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] token = scanner.nextLine().split("\\s+");
            String operation = token[0];
            String name = token[1];
            switch (operation) {
                case "register":
                    String licenseNumber = token[2];
                    if (park.get(name) != null) {
                        System.out.printf("ERROR: already registered with plate number %s%n", licenseNumber);
                    }else {
                        park.putIfAbsent(name, licenseNumber);
                        System.out.printf("%s registered %s successfully%n",name, licenseNumber);
                    }
                    break;
                case "unregister":
                    if (park.get(name) != null) {
                        park.remove(name);
                        System.out.printf("%s unregistered successfully%n", name);
                    } else {
                        System.out.printf("ERROR: user %s not found%n",name);
                    }
                    break;
            }
        }
        park.forEach((k, v) -> System.out.printf("%s => %s%n", k, v));
    }
}
