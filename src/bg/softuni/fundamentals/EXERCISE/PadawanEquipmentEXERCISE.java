package bg.softuni.fundamentals.EXERCISE;

import java.util.Scanner;

public class PadawanEquipmentEXERCISE {

    public static void main(String[] args) {
        /*INPUT 5 lines:
•	The amount of money Ivan Cho has – floating-point number in range [0.00…1,000.00]
•	The count of students – integer in range [0…100]
•	The price of lightsabers for a single sabre – floating-point number in range [0.00…100.00]
•	The price of robes for a single robe – floating-point number in range [0.00…100.00]
•	The price of belts for a single belt – floating-point number in range [0.00…100.00]
More conditions: Lightsabres sometimes brake and should buy 10% more, rounded up to the next integer.
 Also, every 6 belt is free.
OUTPUT:•	If the calculated price of the equipment is less or equal to the money Ivan Cho has:
o	"The money is enough - it would cost {the cost of the equipment}lv."
•	If the calculated price of the equipment is more than the money Ivan Cho has:
o	 "Ivan Cho will need {neededMoney}lv more."
•	All prices must be rounded to two digits after the decimal point.
*/
        Scanner scanner = new Scanner(System.in);
        double availbleMoney = Double.parseDouble(scanner.nextLine());
        int students = Integer.parseInt(scanner.nextLine());
        double lightPrice = Double.parseDouble(scanner.nextLine());
        double robePrice = Double.parseDouble(scanner.nextLine());
        double beltsPrice = Double.parseDouble(scanner.nextLine());

        double equipmentPrice;
        double neededMoney;
        int numberOfLights = (int) Math.ceil(1.1 * students);//number of Lights is 10% more and rounded to the next integer
        int freeBelts = students / 6;//every 6th is free
        //if belts = 43 -> 43/6=7 (+1); 45/6 = 7(+3); 5/6 ->0

        equipmentPrice = numberOfLights * lightPrice + students * robePrice + (students - freeBelts) * beltsPrice;
        if (availbleMoney >= equipmentPrice) {
            System.out.printf("The money is enough - it would cost %.2flv.", equipmentPrice);
        } else {
            neededMoney = equipmentPrice - availbleMoney;
            System.out.printf("Ivan Cho will need %.2flv more.", neededMoney);
        }
    }
}