package bg.softuni.fundamentals.EXERCISE;

import java.util.Scanner;

public class TriplesOfLatinLettersExercise {
    public static void main(String[] args) {
        /*Write a program to read an integer n and print all
        triples of the first n small Latin letters, ordered alphabetically:*/
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                 char firstLette = (char)('a'+i);//започва от 'а' в аски таблицата и добавяме +1 по азбучен ред
                  char secondLetter = (char) ('a'+j);
                    char thirdLetter = (char) ('a'+k);
                    System.out.printf("%c%c%c%n",firstLette,secondLetter,thirdLetter);
                }
            }
        }
    }
}
