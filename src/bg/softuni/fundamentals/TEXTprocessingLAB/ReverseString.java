package bg.softuni.fundamentals.TEXTprocessingLAB;
//input: helLo      output: helLo = oLleh
//      Softuni             Softuni = inutfoS
//      bottle              bottle = elttob
//       end
import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        while(!string.equals("end")) {
            String reversed = "";
            for (int i = string.length() - 1; i >= 0; i--) {
                reversed += string.charAt(i);
            }
            System.out.printf("%s = %s%n",string,reversed);
            string = scanner.nextLine();
        }
    }
}
