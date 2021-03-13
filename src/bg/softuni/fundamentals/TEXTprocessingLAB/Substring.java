package bg.softuni.fundamentals.TEXTprocessingLAB;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/*
input:            output: kgb
ice
kicegiciceeb
*/
public class Substring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        String text = scanner.nextLine();
//в това решение сторваме всички стрингове, които не са думата в един лист, който печатим накрая

        int nextWordIndex = text.indexOf(word, 0);
        String result = text;
        while (nextWordIndex != -1) {
            int currentIndex = 0;
            List<String> substrings = new ArrayList<>();
            while (nextWordIndex != -1) {
                substrings.add(result.substring(currentIndex, nextWordIndex));
                currentIndex = nextWordIndex + word.length();
                nextWordIndex = result.indexOf(word, currentIndex);//задаваме промяна в цикъла
            }
            substrings.add(result.substring(currentIndex));
            result = String.join("", substrings);
            nextWordIndex = result.indexOf(word,0);
        }
        System.out.println(result);
    }
}