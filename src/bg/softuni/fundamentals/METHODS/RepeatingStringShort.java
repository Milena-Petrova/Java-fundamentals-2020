package bg.softuni.fundamentals.METHODS;

import java.util.Scanner;

public class RepeatingStringShort {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String line = scanner.nextLine();
            int repetitions = Integer.parseInt(scanner.nextLine());
            String repeated = repeat(line, repetitions);
            System.out.println(repeated);

        }
    static String repeat(String s, int count){
            String []repetitions=new String[count];
        for (int i = 0; i <count ; i++) {
            repetitions[i]=s;
        }
        return String.join("",repetitions);
    }
    }