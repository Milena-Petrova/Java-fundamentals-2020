package bg.softuni.fundamentals.EXERCISE;

import java.util.Scanner;

public class WaterOverflowExercise {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);
                int n = Integer.parseInt(scanner.nextLine());
                int pouredLiters = 0;
                int volume=255;
                for (int i = 1; i <= n; i++) {
                    int currentLitters = Integer.parseInt(scanner.nextLine());
                    volume-=currentLitters;
                    // pouredLiters+=currentLitters;
                    if (volume >= 0) {
                        pouredLiters += currentLitters;
                    } else{
                        System.out.println("Insufficient capacity!");
                        volume=255-pouredLiters;
                    }
                }
                System.out.println(pouredLiters);
            }
        }


