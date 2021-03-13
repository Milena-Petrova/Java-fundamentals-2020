package bg.softuni.fundamentals.MAPs;
/*online parking validation
register to park; unregister to leave
•	"register {username} {licensePlateNumber}":
•	"unregister {username}":
Input
        •	First line: n - number of commands - integer
        •	Next n lines: commands in one of two possible formats:
        o	Register: "register {username} {licensePlateNumber}"
        o	Unregister: "unregister {username}"
        The input will always be valid and you do not need to check it explicitly.
        5
register John CS1234JS      -->         John registered CS1234JS successfully
register George JAVA123S    -->         George registered JAVA123S successfully
register Andy AB4142CD      -->         Andy registered AB4142CD successfully
register Jesica VR1223EE    -->         Jesica registered VR1223EE successfully
unregister Andy             -->         Andy unregistered successfully
                                        John => CS1234JS
                                        George => JAVA123S
                                        Jesica => VR1223EE
*/

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniParkingEX {
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
        park.forEach((k, v) -> System.out.println(String.format("%s => %s", k, v)));
    }
}
