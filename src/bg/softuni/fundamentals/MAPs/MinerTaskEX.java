package bg.softuni.fundamentals.MAPs;
/*
Until you receive "stop" command, you will be given a sequence of strings, each on a new line.
 Every odd line on the console is representing a resource  and every even - quantity.
Print the resources and their quantities in format: {resource} –> {quantity}
The quantities inputs will be in the range [1 … 2 000 000 000]
input:                  output:
Gold                    Gold -> 155
155                     Silver -> 10
Silver                  Copper -> 17
Copper
17
stop
 */

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class MinerTaskEX {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> resources = new LinkedHashMap<>();

        String command = scanner.next();
        while (!command.equals("stop")) {
            int input = Integer.parseInt(scanner.next());
            Integer quantity = resources.get(command);
            if (quantity == null) {
                quantity = 0;
            }
            resources.put(command, quantity + input);

            command = scanner.next();
        }
        for (Map.Entry<String, Integer> entry : resources.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}

