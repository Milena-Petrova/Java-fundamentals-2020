package bg.softuni.fundamentals.FNALexam;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Pianist_08_20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        Map<String,Piece>piecesOfMusic = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            String[]command = scanner.nextLine().split("\\|");//{piece}|{composer}|{key}
            Piece piano = new Piece(command[0],command[1],command[2]);
            piecesOfMusic.put(command[0], piano);
        }

        String line = scanner.nextLine();
        while (!line.equals("Stop")) {
            String[] token = line.split("\\|");
            switch (token[0]) {
                case "Add"://•	Add|{piece}|{composer}|{key}
                  //  String p = token[1]; String c = token[2]; String k = token[3];
                    if(piecesOfMusic.containsKey(token[1])) {
                        System.out.printf("%s is already in the collection!%n", token[1]);
                    }else {
                        Piece p = new Piece(token[1],token[2],token[3]);
                        piecesOfMusic.put(token[1],p);
                        System.out.printf("%s by %s in %s added to the collection!%n", token[1], token[2], token[3]);
                    }
                    break;
                case "Remove"://•	Remove|{piece}
                    if(piecesOfMusic.containsKey(token[1])) {
                        piecesOfMusic.remove(token[1]);
                        System.out.printf("Successfully removed %s!%n",token[1]);
                    }else {
                        System.out.printf("Invalid operation! %s does not exist in the collection.%n",token[1]);
                    }
                    break;
                case "ChangeKey"://•	ChangeKey|{piece}|{new key}
                    if(piecesOfMusic.containsKey(token[1])) {
                        piecesOfMusic.get(token[1]).changeKey(token[2]);
                        System.out.printf("Changed the key of %s to %s!%n",token[1],token[2]);
                    }else {
                        System.out.printf("Invalid operation! %s does not exist in the collection.%n",token[1]);
                    }
                    break;
                default:
                    System.out.println("error");
                    break;
            }

            line = scanner.nextLine();
        }
        piecesOfMusic.entrySet().stream()
            //    .sorted((a,b)->a.getValue().getComposer().compareTo(b.getValue().getComposer()))
              //  .sorted((f,s)->f.getKey().compareTo(s.getKey()))
                .forEach(e-> {
                    System.out.printf("%s -> Composer: %s, Key: %s%n", e.getKey(), e.getValue().getComposer(), e.getValue().getKey());
                });
    }
    public static class Piece{
        String name;
        String composer;
        String key;

        public Piece(String name, String composer, String key) {
            this.name = name;
            this.composer = composer;
            this.key = key;
        }
        public void setName(String name) {
            this.name = name;
        }
        public void changeKey(String key) {
            this.key = key;
        }
        public String getName() {
            return name;
        }
        public String getComposer() {
            return composer;
        }
        public String getKey() {
            return key;
        }
    }
}
