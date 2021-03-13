package bg.softuni.fundamentals.OBJECTandCLASSES;

import java.util.Random;
import java.util.Scanner;

public class RandomizeWors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
            String[]words = scanner.nextLine().split(" ");
            for (int i = 0; i < words.length ; i++) {
                int x = random.nextInt(words.length);
                int y = random.nextInt(words.length);
                String oldWord = words[x];
                words[x]=words[y];
                words[y]=oldWord;
            }
        System.out.println(String.join(System.lineSeparator(),words));
        }
    }

