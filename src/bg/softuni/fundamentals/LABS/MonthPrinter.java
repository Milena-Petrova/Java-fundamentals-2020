package bg.softuni.fundamentals.LABS;

import java.util.Scanner;

public class MonthPrinter {
    public static void main(String[] args) {
        /*If the number is more than 12 or less than 1 print "Error!".
Input
You will receive a single integer on a single line.
Output
If the number is within the boundaries print the corresponding month, otherwise print "Error!".
*/
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        String month = "";
        switch (number){

            case 1: month = "January"; break;
            case 2: month = "February"; break;
            case 3: month = "March"; break;
            case 4: month = "April"; break;
            case 5: month = "May"; break;
            case 6: month = "June"; break;
            case 7: month = "July"; break;
            case 8: month = "August";break;
            case 9: month = "September"; break;
            case 10: month = "October"; break;
            case 11: month = "November";break;
            case 12: month = "December";break;
            default:
                month="Error!";
                break;
        }
        System.out.printf("%s",month);

    }
}
