package bg.softuni.fundamentals.FNALexam;

import java.util.*;

public class DemoPlant_08_20 {
    static class Plant {
        String name;
        int rarity;
        List<Double> ratings = new ArrayList<>();

        public Plant(String name, int rarity) {
            this.name = name;
            this.rarity = rarity;
        }

        public int getRarity() {
            return rarity;
        }

        public void setRarity(int rarity) {
            this.rarity = rarity;
        }

        public String getName() {
            return name;
        }

        public void addRating(double rating) {
            this.ratings.add(rating);
        }

        public void resetRating() {
            this.ratings.clear();//маха всички стойности от лист
        }

        public Double getAverageRating() {
            if (this.ratings.isEmpty()) {
                return 0.0;
            }
            double averageRating = 0;
            for (Double rating : this.ratings) {
                averageRating += rating;
            }
            averageRating = averageRating / this.ratings.size();
            return averageRating;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        Map<String, Plant> plantsByName = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String[] nameAndRarety = scanner.nextLine().split("<->");
            Plant p = new Plant(nameAndRarety[0], Integer.parseInt(nameAndRarety[1]));
            plantsByName.put(p.getName(), p);
        }

        String command = scanner.nextLine();
        while (!command.equals("Exhibition")) {
            String[] commandAndParam = command.split(": ");
            switch (commandAndParam[0]) {
                case "Rate":
                    String[] rateParameters = commandAndParam[1].split(" - ");
                    String nameRatePlant = rateParameters[0];
                    int nameRating = Integer.parseInt(rateParameters[1]);
                    Plant ratePlant = plantsByName.get(nameRatePlant);
                    if(ratePlant != null) {
                        plantsByName.get(nameRatePlant).addRating(nameRating);
                    }else{
                        System.out.println("error");
                    }
                    break;
                case "Update":
                    String[] updateParam = commandAndParam[1].split(" - ");
                    String updateName = updateParam[0];
                    int rarity = Integer.parseInt(updateParam[1]);
                    Plant updatePlant = plantsByName.get(updateName);
                    if(updatePlant !=null) {
                        plantsByName.get(updateName).setRarity(rarity);
                    }else{
                        System.out.println("error");
                    }
                    break;
                case "Reset":
                    String resetPlantName = commandAndParam[1];
                    Plant resetPlnat = plantsByName.get(resetPlantName);//взимаме от мапа стойността на ключа-растението, стойността е обект
                    if(resetPlnat !=null) {//с тази проверка проверяваме дали изобщо го има това растение, за което се иска някакво действие
                        plantsByName.get(resetPlantName).resetRating();
                    }else{
                        System.out.println("error");
                    }
                    break;
                default:
                    System.out.println("error");
                    break;

            }
            command = scanner.nextLine();
        }
        System.out.println("Plants for the exhibition:");
//.value --> взима всички стойности от мапа, които са обектите plant
        plantsByName.values().stream()
                .sorted((a, b) -> {
                    if (a.getRarity() != b.getRarity()) {
                        return Integer.compare(b.getRarity(), a.getRarity()); //сравнява интове
                    } else {
                        return Double.compare(b.getAverageRating(), a.getAverageRating());
                    }
                })
                .map(p -> "- " + p.getName() + "; Rarity: " + p.getRarity() + "; Rating: " + String.format("%.2f", p.getAverageRating()))
                .forEach(s -> System.out.println(s));
    }
}
