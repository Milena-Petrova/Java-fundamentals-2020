package bg.softuni.fundamentals.FNALexam;
/*
Input:
3
Arnoldii<->4
Woodii<->7
Welwitschia<->2
Rate: Woodii - 10
Rate: Welwitschia - 7
Rate: Arnoldii - 3
Rate: Woodii - 5
Update: Woodii - 5
Reset: Arnoldii
Exhibition
OUTPUT:
Plants for the exhibition:
- Woodii; Rarity: 5; Rating: 7.50
- Arnoldii; Rarity: 4; Rating: 0.00
- Welwitschia; Rarity: 2; Rating: 7.00
 */
import java.util.*;

public class PlantDiscovery_08_20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String,Integer>plantRarityByName = new HashMap<>();
        Map<String,List<Integer>>plantListRatingsByName = new HashMap<>();

        for (int i = 0; i <n ; i++) {
        String[]token = scanner.nextLine().split("<->");
        plantRarityByName.put(token[0],Integer.parseInt(token[1]));
        plantListRatingsByName.put(token[0],new ArrayList<>());//празен списък с рейтинги
        }

        String input = scanner.nextLine();

        while (!input.equals("Exhibition")){
            String[]command = input.split(": ");
            switch (command[0]){
                case "Rate":
                    String[]tokenRate = command[1].split(" - ");
                    String name = tokenRate[0];
                    int rating  = Integer.parseInt(tokenRate[1]);
                    List<Integer> ratings = plantListRatingsByName.get(name);
                    if(ratings !=null){
                        ratings.add(rating);
                    }else{
                        System.out.println("error");
                    }
                    break;
                case "Update":
                    String []tokenUp = command[1].split(" - ");
                   String nameUpdate = tokenUp[0];
                   int rarity = Integer.parseInt(tokenUp[1]);
                    if(plantRarityByName.containsKey(nameUpdate)){
                        plantRarityByName.put(nameUpdate,rarity);
                    }else{
                        System.out.println("error");
                    }
                    break;
                case "Reset":
                    String resetPlantNames = command[1];
                    List<Integer> resetRatings = plantListRatingsByName.get(resetPlantNames);
                    if(resetRatings !=null){
                        resetRatings.clear();
                    }else{
                        System.out.println("error");
                    }
                    break;
                default:
                    System.out.println("error");
                    break;
            }
            input= scanner.nextLine();
        }
        System.out.println("Plants for the exhibition:");
//.value --> взима всички стойности от мапа, които са обектите plant
        plantRarityByName.entrySet().stream()
                .sorted((a, b) -> {
                    int aRarity = a.getValue();
                    int bRarety = b.getValue();
                    if(aRarity != bRarety){
                        return Integer.compare(bRarety,aRarity);
                    }else {
                        List<Integer> aRatings = plantListRatingsByName.get(a.getKey());
                        List<Integer> bRatings = plantListRatingsByName.get(b.getKey());
                        double aAveragerating = calculateaverage(aRatings);
                        double bAverage = calculateaverage(bRatings);

                        return Double.compare(bAverage,aAveragerating);
                    }
                })
                .map(entry -> "- " + entry.getKey() + "; Rarity: " + entry.getValue() + "; Rating: " + String.format("%.2f", calculateaverage(plantListRatingsByName.get(entry.getKey()))))
                .forEach(s -> System.out.println(s));
    }

    static double calculateaverage(List<Integer>numbers){
        if(numbers.isEmpty()){
            return 0;
        }
        double sum=0;
        for (Integer number : numbers) {
                sum+=number;
        }
        return sum/numbers.size();
    }
}

