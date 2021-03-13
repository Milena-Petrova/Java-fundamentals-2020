package bg.softuni.fundamentals.METHODS;
import java.text.DecimalFormat;
import java.util.Scanner;

public class MathPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number = Double.parseDouble(scanner.nextLine());
        int power = Integer.parseInt(scanner.nextLine());
       // System.out.println(new DecimalFormat("0.####").format(Math.pow(number, power)));
    System.out.println(new DecimalFormat("0.####").format(mathPower(number, power)));
    }

    private static double mathPower(double input, int toPower) {
        if (input == 1 || toPower == 0) {
            return 1;}
        if (input == 0) {
            return 0; }
        double powered = input;
        if (toPower > 0){
            for (int i = 1; i < toPower; i++) {
                powered = powered * input;
            }
            return powered;
        }else {
            return 1 / powered;
        }
}
}


