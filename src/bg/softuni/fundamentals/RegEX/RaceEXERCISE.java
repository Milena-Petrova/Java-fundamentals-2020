package bg.softuni.fundamentals.RegEX;

import javax.sound.midi.Soundbank;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class RaceEXERCISE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<String> pariticipants = Arrays.stream(input.split(", ")).collect(Collectors.toList());//състезателите


        String regex = "[A-Za-z]";// only letters
        String digitReg = "\\d";
        Pattern patternName = Pattern.compile(regex);//шаблон за името
        Pattern patternDistance = Pattern.compile(digitReg);//шаблон за цифрите

        Map<String, Integer> racers = new LinkedHashMap<>();
        for (String pariticipant : pariticipants) {
            racers.put(pariticipant, 0);
       }
        String line = scanner.nextLine(); // regex-те
        while (!line.equals("end of race")) {
            Matcher matcherName = patternName.matcher(line);
            StringBuilder name = new StringBuilder();
            while (matcherName.find()) {
                name.append(matcherName.group());
            }
            if(racers.containsKey(name.toString())){
                         int current = racers.get(name.toString());
                       Matcher matcherDistance = patternDistance.matcher(line);
                       while (matcherDistance.find()) {
                                current += Integer.parseInt(matcherDistance.group());
                              }
                          racers.put(name.toString(),current);
            }
            line = scanner.nextLine();
        }
        List<String> winners = racers.entrySet()
                .stream().sorted((e1, e2) -> e2.getValue()-e1.getValue())
                .limit(3)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        int count = 1;
        for (String winner : winners) {
            switch (count++) {
                case 1:
                    System.out.printf("1st place: %s%n", winner);
                    break;
                case 2:
                    System.out.printf("2nd place: %s%n", winner);
                    break;
                case 3:
                    System.out.printf("3rd place: %s%n", winner);
                    break;
            }
        }
    }
}

