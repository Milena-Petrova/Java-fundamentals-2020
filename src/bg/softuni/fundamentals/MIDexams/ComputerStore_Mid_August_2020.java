package bg.softuni.fundamentals.MIDexams;

import java.util.Scanner;

public class ComputerStore_Mid_August_2020 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        double totalPrice = 0;
        double totalTaxes = 0;

        while(! (input.equals("special") || input.equals("regular")) ){
            double price = Double.parseDouble(input);
            if (price < 0) {
                System.out.println("Invalid price!");
            } else {
                totalPrice += price;
                totalTaxes += 0.20 * price;
            }
                input = scanner.nextLine();
        }
        double totalAmount = totalPrice+totalTaxes;
        if(input.equals("special")) {
            totalAmount = (totalPrice + totalTaxes) * 0.90;//10% discount
        }if(totalAmount==0){
            System.out.println("Invalid order!");
        }else {
            System.out.println("Congratulations you've just bought a new computer!");
            System.out.printf("Price without taxes: %.2f$%n", totalPrice);
            System.out.printf("Taxes: %.2f$%n", totalTaxes);
            System.out.println("-----------");
            System.out.printf("Total price: %.2f$", totalAmount);
        }
    }
}
