package bg.softuni.fundamentals.FNALexam;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class PIrates_04_20 {
    public static class City {
        String name;
        int population;
        int gold;

        public City(String name) {
            this.name=name;
        }

        public City(String name, int population, int gold) {
            this.name = name;
            this.population = population;
            this.gold = gold;
        }

        public String getName() {
            return name;
        }

        public int getPopulation() {
            return population;
        }

        public int getGold() {
            return gold;
        }

        public int setPopulation(int population) {
           return this.population -= population;
        }

        public int addPopulation(int population){
          return   this.population+=population;
        }

        public void setGold(int gold) {
            this.gold -= gold;
        }

        private int addedGold(int gold) {
          return   this.gold += gold;
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();

        Map<String, City> targets = new TreeMap<>();

        while (!command.equals("Sail")) {
            String[] token = command.split("\\|\\|");
            String name = token[0];

            int population = Integer.parseInt(token[1]);
            int gold = Integer.parseInt(token[2]);
            City city = new City(name);
            targets.putIfAbsent(name,city);

            if(!targets.containsKey(city.getName())) {
                targets.put(city.getName(), city);
                city.addedGold(gold);
                city.addPopulation(population);
            }else{
                targets.get(name).addPopulation(population);
                targets.get(name).addedGold(gold);
            }
            command = scanner.nextLine();
        }
        command = scanner.nextLine();
        while (!command.equals("End")) {
            String[] tokens = command.split("\\=\\>");
            switch (tokens[0]) {
                case "Plunder": {
                    String targetName = tokens[1];
                    int killed = Integer.parseInt(tokens[2]);
                    int stolenGold = Integer.parseInt(tokens[3]);

                    if (targets.containsKey(targetName)) {
                        targets.get(targetName).setPopulation(killed);
                        targets.get(targetName).setGold(stolenGold);
                    }
                    System.out.printf("%s plundered! %d gold stolen, %d citizens killed.%n", targetName, stolenGold, killed);
                    if (targets.get(targetName).getPopulation() == 0 || targets.get(targetName).getGold() == 0) {
                        targets.remove(targetName);
                        System.out.printf("%s has been wiped off the map!%n", targetName);
                    }
                    break;
                }
                case "Prosper": {
                    String targetName = tokens[1];
                    int addGold = Integer.parseInt(tokens[2]);
                    if (addGold > 0) {
                        targets.get(targetName).addedGold(addGold);
                        System.out.printf("%d gold added to the city treasury. %s now has %d gold.%n", addGold, targetName, targets.get(targetName).getGold());
                    } else {
                        System.out.println("Gold added cannot be a negative number!");
                    }
                }
                break;
            }
            command = scanner.nextLine();
        }
        if(!targets.isEmpty()) {
            System.out.printf("Ahoy, Captain! There are %d wealthy settlements to go to:%n",targets.size());
        }else{
            System.out.println("Ahoy, Captain! All targets have been plundered and destroyed!");
        }
        //sorted by their gold in descending order, then by their name in ascending order
        targets.values().stream()
                .sorted((a,b)->{
                    return Integer.compare(b.getGold(),a.getGold());
                })
                .forEach(p-> System.out.printf("%s -> Population: %d citizens, Gold: %d kg%n",p.getName(),p.getPopulation(),p.getGold()));
    }
}
