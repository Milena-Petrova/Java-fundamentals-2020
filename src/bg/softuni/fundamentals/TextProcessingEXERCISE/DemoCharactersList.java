package bg.softuni.fundamentals.TextProcessingEXERCISE;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DemoCharactersList {
    public static void main(String[] args) {
        List<Character> letters = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        while (!line.equals("end")) {
            letters.add(line.charAt(0));//добавя ни в листа всяка първа буква от стринговете, които въвеждаме
            line = scanner.nextLine();
        }
        char[] letterArray = getCharsArray(letters);
        String output = new String(letterArray);
        System.out.println(output.toUpperCase());
    }


    private static char[] getCharsArray(List<Character> letters) {
        char[] letterArray = new char[letters.size()];
        for (int i = 0; i < letterArray.length; i++) {
            letterArray[i] = letters.get(i);
        }
        return letterArray;
    }
}
