package bg.softuni.fundamentals.LABS;

import java.util.Scanner;

public class CharsToString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // char firstLine = line.charAt(0);//взима първият символ на входния стринг

        char firstLine = scanner.nextLine().charAt(0);
        char secondLine = scanner.nextLine().charAt(0);
        char thirdLine = scanner.nextLine().charAt(0);
//Печати символите
       // System.out.println(firstLine + ""+ secondLine + ""+ thirdLine);

        //Печати сбор от аски стойностите на символите
        System.out.println(thirdLine+secondLine+firstLine);

    }
}
