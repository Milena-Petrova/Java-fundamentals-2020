package bg.softuni.fundamentals.MIDexams;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ListManipulator_MidExam_07_Nov_2020 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] elements = line.split(", ");
        String[] friends = new String[elements.length];
        for (int i = 0; i < elements.length; i++) {
            friends[i] = elements[i];
        }
        String command = scanner.nextLine();

        while (!command.equals("Report")) {
            String[] token = command.split("\\s+");
            switch (token[0]) {
                case "Blacklist":
                    if(Arrays.asList(friends).contains(token[1]))
                    {
                    blackList(friends,token[1]);

                    }else {
                        System.out.printf("%s was not found.%n", token[1]);
                    }
                    break;
                case "Error":
                    error(friends, Integer.parseInt(token[1]));
                    break;
                case "Change":
                    change(friends, Integer.parseInt(token[1]), token[2]);
                    break;
            }
            command = scanner.nextLine();
        }
        int blacklistedNamesCount = 0;
        for (int i = 0; i < friends.length; i++) {
            if (friends[i].equals("Blacklisted")) {
                blacklistedNamesCount++;
            }
        }
        System.out.printf("Blacklisted names: %d%n",blacklistedNamesCount);
        int lostNamesCount = 0;
        for (int i = 0; i < friends.length; i++) {
            if (friends[i].equals("Lost")) {
                lostNamesCount++;
            }
        }
        System.out.printf("Lost names: %d%n",lostNamesCount);

        for (String friend : friends) {
            System.out.print(friend+" ");
        }

    }
    private static void blackList(String[] line, String name) {

        for (int i = 0; i < line.length; i++) {
            if (name.equals(line[i])) {
                System.out.printf("%s was blacklisted.%n", name);
                line[i]="Blacklisted";
            }
        }
    }
    private static void error(String[] line, int index){
        for (int i = 0; i < line.length ; i++) {
            if(0<=index && index< line.length) {
                if (!(line[index].equals("Blacklisted") || line[index].equals("Lost"))) {
                    String name = line[index];
                    line[index] = "Lost";
                    System.out.printf("%s was lost due to an error.%n", name);
                }
            }
        }
    }
    private static void change(String[] line, int index,String name){
        if(0<=index && index< line.length){
            String currentName = line[index];
            line[index] = name;
            System.out.printf("%s changed his username to %s.%n",currentName,name);
        }
    }
}
