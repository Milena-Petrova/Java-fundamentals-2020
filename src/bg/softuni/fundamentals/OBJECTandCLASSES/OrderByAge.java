package bg.softuni.fundamentals.OBJECTandCLASSES;
/*You will receive an unknown number of lines. On each line, you will receive an array with 3 elements.
The first element will be string and represents the name of the person. The second element will be a string and
will represent the ID of the person. The last element will be an integer which represents the age of the person.
When you receive the command "End", stop taking input and print all the people, ordered by age.
*/
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class OrderByAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();

        List<Persons>persons = new ArrayList<>();

        while(!line.equals("End")){
            String[] personsInfo = line.split("\\s+");
        String name = personsInfo[0];
        String id = personsInfo[1];
        int age = Integer.parseInt(personsInfo[2]);
        Persons personInfo = new Persons(name,id,age);
        persons.add(personInfo);

        line = scanner.nextLine();
        }//sorted((p1,p2)-> p1.getName().compareTo(p2.getName())
        persons.stream().sorted((p1,p2)-> Integer.compare(p1.getAge(),p2.getAge()))
        .forEach(person -> System.out.println(person.toString()));
    }
    static class Persons{
        String name;
        String id;
        int age;

        public Persons(String name, String id, int age) {
            this.name = name;
            this.id = id;
            this.age = age;
        }

        public String getName() {
            return name;
        }
        public String getId() {
            return id;
        }
        public int getAge() {
            return age;
        }

        @Override
        public String toString() {//Stefan with ID: 524244 is 10 years old.
            return String.format("%s with ID: %s is %d years old.",getName(),getId(),getAge());
        }
    }
}
