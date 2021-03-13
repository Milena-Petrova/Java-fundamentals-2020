package bg.softuni.fundamentals.TextProcessingEXERCISE;

import java.util.Scanner;

/*Create a method that takes two strings as arguments and returns
the sum of their character codes multiplied (multiply str1[0] with str2[0]
and add to the total sum). Then continue with the next two characters.
If one of the strings is longer than the other, add the remaining character
codes to the total sum without multiplication.
input: Gosho Pesho	---> output: 53253
123 522  ---->	7647
a aaaa	---> 9700
* */
public class CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] token = scanner.nextLine().split("\\s+");
        String first = token[0];
        String second = token[1];

        int sum = calculateStringCharacter(first, second);
        System.out.println(sum);
    }

    private static int calculateStringCharacter(String first, String second) {
        int sum = 0;
        Math.min(first.length(), second.length());
        //върти цикъл до която дължина е по-малка
        for (int i = 0; i < Math.min(first.length(), second.length()); i++) {
            sum += first.charAt(i) * second.charAt(i);
        }
        if (first.length() > second.length()) {
            for (int i = second.length(); i < first.length(); i++) {
                sum += first.charAt(i);
            }
        } else {
            for (int i = first.length(); i < second.length(); i++) {
                int x = second.charAt(i);
                sum += second.charAt(i);
            }
        }
        return sum;
    }

}

