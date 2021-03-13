package bg.softuni.fundamentals.METHODS;
//•	coffee – 1.50
//•	water – 1.00
//•	coke – 1.40
//•	snacks – 2.00
import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String item = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());
        System.out.printf("%.2f",getAmount(item,quantity));
    }

    private static double getAmount(String item, double quantity) {
        double price=0;
        switch (item){
            case "coffee":  price = 1.50*quantity; break;
            case "water": price = 1.00*quantity;break;
            case "coke" : price = 1.40*quantity;break;
            case "snacks" : price = 2.00*quantity;break;
            default:
        }
        return price;
    }
}
