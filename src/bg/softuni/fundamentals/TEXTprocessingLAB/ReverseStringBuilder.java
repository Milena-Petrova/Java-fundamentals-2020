package bg.softuni.fundamentals.TEXTprocessingLAB;
//input: helLo      output: helLo = oLleh
//      Softuni             Softuni = inutfoS
//      bottle              bottle = elttob
//       end
import java.util.Scanner;

public class ReverseStringBuilder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        while (!line.equals("end")) {
            StringBuilder reversed = new StringBuilder();
            for (int i = line.length() - 1; i >= 0; i--) {
                reversed.append(line.charAt(i));
            }
            System.out.printf("%s = %s%n", line, reversed);
            line = scanner.nextLine();
        }
    }
}
