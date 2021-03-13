package bg.softuni.fundamentals.OBJECTandCLASSES;

import java.util.Random;
import java.util.Scanner;

public class AdvertisementMessageEX {
    static class Message {
        String[] phrases = {"Excellent product.", "Such a great product.",
                "I always use that product.", "Best product of its category.",
                "Exceptional product.", "I can’t live without this product."};
        String[] events = {"Now I feel good.", "I have succeeded with this product.",
                "Makes miracles. I am happy of the results!", "I cannot believe but now I feel awesome.",
                "Try it yourself, I am very satisfied.", "I feel great!"};
        String[] autors = {"Diana", "Petya", "Stella", "Elena", "Katya", "Iva", "Annie", "Eva"};
        String[] cities = {"Burgas", "Sofia", "Plovdiv", "Varna", "Ruse"};
        Random random = new Random();
        public String randomMessage() {
            String format = String.format("%s %s %s -%s.", phrases[random.nextInt(phrases.length)],//nextInt(phrases.lenght)->random обхватът е , колкото са броя елементи в стринга
                    events[random.nextInt(events.length)],
                    autors[random.nextInt(autors.length)], cities[random.nextInt(cities.length)]);
            return format;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.next());
        Message message = new Message();
        for (int i = 0; i <n ; i++) {
            System.out.println(message.randomMessage());
        }
    }
}
