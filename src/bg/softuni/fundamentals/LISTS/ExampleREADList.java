package bg.softuni.fundamentals.LISTS;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExampleREADList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();//брой елементи, които ще има в листа
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < n; i++) {//добавяме елементи в листа
            int number = scanner.nextInt();
            numbers.add(number); //не добавяме на определн ред/индекс, както при масива
        }
        for (Integer number : numbers) {//извеждаме елементите на листа
            System.out.print(number + " ");
        }
        /*Извеждане резултат на лист от стрингове само!
        System.out.println(String.join("; ", list));
         */
    }
}
