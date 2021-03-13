package bg.softuni.fundamentals.MAPs;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/*Write a program, which keeps information about products and their prices.
Each product has a name, a price and its quantity.
If the product doesn't exist yet, add it with its starting quantity.
If you receive a product, which already exists, increase its quantity by the input quantity and
if its price is different, replace the price as well.
Until you receive the command "buy", keep adding items. When you do receive the command "buy",
 print the items with their names and total price of all the products with that name.
Input format: "{name} {price} {quantity}"
Beer 2.40 350
Water 1.25 200
IceTea 5.20 100
Beer 1.20 200
IceTea 0.50 120
buy
Output: "{productName} -> {totalPrice}"
Beer -> 660.00
Water -> 250.00
IceTea -> 110.00

•	Print information about each product, following the format:
"{productName} -> {totalPrice}"
•	Format the average grade to the 2nd decimal place
 */
public class OrdersEX {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            Map<String, Double> newOrders = new LinkedHashMap<>(); //store all products and amount --> with new prices or quantities
            Map<String, Integer> orders = new LinkedHashMap<>();//hold products and quantities

            while (!input.equals("buy")) {
                String[] token = input.split("\\s+");
                String productName = token[0];
                double productPrice = Double.parseDouble(token[1]);
                int productQuantity = Integer.parseInt(token[2]);

                Integer curQuantity = orders.get(productName);
                if (curQuantity == null) {
                    curQuantity = 0;
                }
                orders.put(productName, productQuantity + curQuantity);//обновени количества
                // new quantity =  orders.get(productName)+curQuantity ---> orders.get(productName)
                newOrders.putIfAbsent(productName, productPrice * productQuantity);
                newOrders.put(productName, productPrice * orders.get(productName));

                input = scanner.nextLine();
            }
          //  newOrders.forEach((k, v) -> System.out.printf("%s -> %.2f%n", k, v));
              for (Map.Entry<String, Double> entry : newOrders.entrySet()) {
               System.out.printf("%s -> %.2f%n",entry.getKey(),entry.getValue());
              }
        }
    }

