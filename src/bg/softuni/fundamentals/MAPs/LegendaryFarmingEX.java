package bg.softuni.fundamentals.MAPs;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class LegendaryFarmingEX {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> keyMaterials = new HashMap<>();
        Map<String, Integer> junkMaterials = new TreeMap<>();

        boolean isObtained = false;
        keyMaterials.put("shards", 0);
        keyMaterials.put("fragments", 0);
        keyMaterials.put("motes", 0);

        while (!isObtained) {

            String[] token = scanner.nextLine().split("\\s+");

            for (int i = 0; i < token.length; i += 2) {
                //инкрементация през 2, за да хванем двойките на мапа
                String material = token[i + 1].toLowerCase();
                int quantity = Integer.parseInt(token[i]);
                if (material.equals("shards") || material.equals("fragments") || material.equals("motes")) {
                    keyMaterials.put(material, keyMaterials.get(material) + quantity);
                    if (keyMaterials.get(material) >= 250) {
                        // след като сме събрали количеството материал, трявба да се преизчисли колко е останал от него, затова вадим 250
                        keyMaterials.put(material, keyMaterials.get(material) - 250);
                        if ("shards".equals(material)) {
                            System.out.println("Shadowmourne obtained!");
                        } else if ("fragments".equals(material)) {
                            System.out.println("Valanyr obtained!");
                        } else {
                            System.out.println("Dragonwrath obtained!");
                        }
                        isObtained = true;
                        break;
                    }
                } else {
                    junkMaterials.putIfAbsent(material, 0);
                    junkMaterials.put(material, junkMaterials.get(material) + quantity);
                }
            }
        }
        keyMaterials.entrySet().stream()
                .sorted((a, b) -> {
                    int result = b.getValue().compareTo(a.getValue());
                    if (result == 0) {
                        result = a.getKey().compareTo(b.getKey());
                    }
                    return result;
                }).forEach(e -> System.out.println(e.getKey() + ": " + e.getValue()));

        junkMaterials.forEach((k, v) -> System.out.println(k + ": " + v));
    }
}
