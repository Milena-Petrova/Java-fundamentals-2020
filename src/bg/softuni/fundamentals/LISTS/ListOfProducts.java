package bg.softuni.fundamentals.LISTS;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
/*Input:                Output:
4
Potatoes                1.Apples
Tomatoes                2.Onions
Onions                  3.Potatoes
Apples	                4.Tomatoes
*/

public class ListOfProducts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());
        List<String >products = new ArrayList<>();
        for (int i = 0; i < input ; i++) {
            String item = scanner.next();
            products.add(item);
        }
        Collections.sort(products);
        for (int i = 0; i < products.size(); i++) {
            System.out.printf("%d.%s%n",(i+1),products.get(i));
        }
    }
}
