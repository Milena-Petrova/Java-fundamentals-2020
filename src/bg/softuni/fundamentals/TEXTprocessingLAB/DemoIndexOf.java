package bg.softuni.fundamentals.TEXTprocessingLAB;

import java.util.Scanner;

public class DemoIndexOf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String text = scanner.nextLine();
        //все едно нулирам, това ми е старта на цикъла
        int currentIndex = text.indexOf(a);
        while (currentIndex != -1){ //-1 --> false --> when string not found
            System.out.println(currentIndex);
            currentIndex=text.indexOf(a, currentIndex+1);//все едно въвеждам следващ вход
            //въвждам откъде да продължи търсенето на индекса в цикъла
        }


    }
}
