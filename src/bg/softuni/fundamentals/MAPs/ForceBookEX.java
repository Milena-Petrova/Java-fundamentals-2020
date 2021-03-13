/*You should store information for every unique forceUser, registered in the application.
        You will receive several input lines in one of the following formats:
        {forceSide} | {forceUser}
        {forceUser} -> {forceSide}
        The forceUser and forceSide are strings, containing any character.
        If you receive forceSide | forceUser you should check if such forceUser already exists, and if not
        - add him/her to the corresponding side.
        If you receive a forceUser -> forceSide you should check if there is such forceUser already and if so,
        change his/her side. If there is no such forceUser, add him/her to the corresponding forceSide,
        treating the command as new registered forceUser.
        Then you should print on the console: "{forceUser} joins the {forceSide} side!"
        You should end your program when you receive the command "Lumpawaroo"
        Lighter | Royal
Darker | DCay                           Ivan Ivanov joins the Lighter side!
Ivan Ivanov -> Lighter                  DCay joins the Lighter side!
DCay -> Lighter                         Side: Lighter, Members: 3
Lumpawaroo	                            ! DCay
                                        ! Ivan Ivanov
                                        ! Royal
                                                */
package bg.softuni.fundamentals.MAPs;

import java.util.*;

public class ForceBookEX {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            TreeMap<String, List<String>> sides = new TreeMap<>();

            String input = scanner.nextLine();
            while (!"Lumpawaroo".equals(input)){

                String[] tokens;
                String forceSide;
                String forceUser;
                if (input.contains("|")){
                    tokens = input.split(" \\| ");
                    forceSide = tokens[0];
                    forceUser = tokens[1];
                    if (!sides.containsKey(forceSide)){
                        sides.putIfAbsent(forceSide, new ArrayList<>());
                    }
                    boolean check = false;
                    for (Map.Entry<String, List<String>> current : sides.entrySet()) {
                        if (current.getValue().contains(forceUser)) {
                            check = true;
                            break;
                        }
                    }
                    if(!check){
                        if(!sides.containsKey(forceSide)){
                            sides.put(forceSide, new ArrayList<>());
                            sides.get(forceSide).add(forceUser);
                        }else if(sides.containsKey(forceSide) && !sides.get(forceSide).contains(forceUser)){
                            sides.get(forceSide).add(forceUser);
                        }
                    }

                } else {
                    tokens = input.split(" -> ");
                    forceUser = tokens[0];
                    forceSide = tokens[1];
                    for (Map.Entry<String, List<String>> current : sides.entrySet()) {
                        if (current.getValue().contains(forceUser)) {
                            sides.get(current.getKey()).remove(forceUser);
                            break;
                        }
                    }
                    if (!sides.containsKey(forceSide)){
                        sides.putIfAbsent(forceSide, new ArrayList<>());
                    }
                    sides.get(forceSide).add(forceUser);
                    System.out.printf("%s joins the %s side!%n", forceUser, forceSide);
                }
                input = scanner.nextLine();
            }

            sides.entrySet()
                    .stream()
                    .filter(users -> users.getValue().size() > 0)
                    .sorted((f, s) -> {
                        int result = s.getValue().size() - f.getValue().size(); //sorted by size descending
                        if (result == 0){
                            result = f.getKey().compareTo(s.getKey()); //by name
                        }
                        return result;
                    }).forEach(s -> {
                System.out.printf("Side: %s, Members: %d%n", s.getKey(), s.getValue().size());

                s.getValue()
                        .stream()
                        .sorted(String::compareTo)
                        .forEach(user -> System.out.printf("! %s%n", user));
            });
        }
    }