package bg.softuni.fundamentals.MAPs;

import java.util.*;

public class WordSynonyms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, List<String>>wordSynonyms = new LinkedHashMap<>();
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i <n ; i++) {
            String word = scanner.nextLine();
            String synonym = scanner.nextLine();
//в този лист складирам синонимите на текущата дума , която е клча в Map-a
            List<String> currentSynonyms = wordSynonyms.get(word);
            if (currentSynonyms == null) {
                currentSynonyms = new ArrayList<>();//нулираме Value = нов празен списък със синоними
                wordSynonyms.put(word, currentSynonyms);//добавям текущата думав Map-a
            }
            currentSynonyms.add(synonym);//добавям синонима на думата в листа на съответната ключова дума, референтен тип!
        }
        for (Map.Entry<String, List<String>> entry : wordSynonyms.entrySet()) {
            System.out.println(entry.getKey()+" - "+ String.join(", ",entry.getValue()));
        }

    }
}
