package bg.softuni.fundamentals.MAPs;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> city = new HashMap<>();
        //Докато командата е различна от end||repord --> въвеждай градове и бройки
        //if command==report --> въведи град(за който е се рапортуват данни)
        //Sofia 10
        //Gabrovo 15
        //Sofa 8
        //......
        //четем с next(), защото scanner.next() чете следващия стринг,всичко без спейсовете
        String command = scanner.next();//Sofia
        while (!command.equals("end")) {//no
            if (command.equals("report")) {
                String cityName = scanner.next();
                System.out.println(city.get(cityName));
            } else {
                int numbers = scanner.nextInt();
                //въвеждаме текущата бройка --> от конзолата current=10
                Integer current = city.get(command);//Integer, a ne int, защото може да е null или да не е
                if (current == null) {
                    current = 0;
                }
                city.put(command, current + numbers);
            }
            command = scanner.next();
        }
        for (Map.Entry<String, Integer> entry : city.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
