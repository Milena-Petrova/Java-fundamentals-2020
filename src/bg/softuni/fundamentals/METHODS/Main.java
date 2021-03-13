package bg.softuni.fundamentals.METHODS;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      //  Scanner scanner = new Scanner(System.in);
        double powered = 2;
        int toPower = -3;
        for (int i = 1; i < Math.abs(toPower); i++) {
            powered = powered * 2;
        }
        double poweredNegative = 1 / powered;
        System.out.println(new DecimalFormat("0.####").format(poweredNegative));
            }
        }
