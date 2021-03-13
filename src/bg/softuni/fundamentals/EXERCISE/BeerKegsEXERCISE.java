package bg.softuni.fundamentals.EXERCISE;

import java.util.Scanner;
/*Calculate the volume of n beer kegs.
You will receive in total 3 * n lines. Each three lines will hold information for a single keg.
First up is the model of the keg, after that is the radius of the keg, and lastly is the height of the keg.
Calculate the volume using the following formula: π * r^2 * h.
At the end, print the model of the biggest keg.
Input
You will receive 3 * n lines. Each group of lines will be on a new line:
•	First – model – string.
•	Second –radius – floating-point number
•	Third – height – integer number
Output
Print the model of the biggest keg.
*/
public class BeerKegsEXERCISE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfKegBeers = Integer.parseInt(scanner.nextLine());
        double maxVolume = Double.MIN_VALUE;
        String theBiggest = "";
        for (int i = 1; i <=numberOfKegBeers ; i++) {
            String modelOfKegs = scanner.nextLine();
            double radiusOfKegs = Double.parseDouble(scanner.nextLine());
            int heightOfKegs = Integer.parseInt(scanner.nextLine());
            double currentVolume = Math.PI*radiusOfKegs*radiusOfKegs*heightOfKegs;
            if(currentVolume>=maxVolume){
                maxVolume=currentVolume;
                theBiggest = modelOfKegs;
            }
        }
        System.out.println(theBiggest);
    }
}
