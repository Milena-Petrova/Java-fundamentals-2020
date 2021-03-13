package bg.softuni.fundamentals.OBJECTandCLASSES;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OpinionPollEX {
    static class Person {
        String name;
        int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public String toString() {
            return String.format("%s - %d", getName(), getAge());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Person> allPersons = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] data = scanner.nextLine().split(" ");
            String name = data[0];
            int age = Integer.parseInt(data[1]);
            //на всяка итерация на цикъла създаваме този обект,
            // който трябва да си запазим в някаква колекция, за да можем да го обработим после
            //  в случая да го сортираме, например в един лист
            Person person = new Person(name, age);
            allPersons.add(person);//добавяме всеки нов създаден обект Person в листа
        }
        //от потока AllPersons ми филтрирай тези, които са над 30 и сортирай по име
        //и с един foreach метод ми го разпечатай
        allPersons.stream().filter(person -> person.getAge() > 30).
                sorted((p1,p2)-> p1.getName().compareTo(p2.getName()))
                .forEach(person -> System.out.println(person.toString()));
    }
}


