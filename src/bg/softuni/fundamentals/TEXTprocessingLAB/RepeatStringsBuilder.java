package bg.softuni.fundamentals.TEXTprocessingLAB;
//Each String is Repeated N Times, Where N is the Length of the String. Print the Concatenated String.
//hi abc add	--> hihiabcabcabcaddaddadd
//work	        --> workworkworkwork
//ball          -->	ballballballball

import java.util.Scanner;

public class RepeatStringsBuilder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] words = line.split("\\s+");

        StringBuilder repeated = new StringBuilder();
        for (String word : words) {
            int count = word.length();
            for (int i = 0; i < count; i++) {
                repeated.append(word);
            }
        }System.out.print(repeated);
    }
}