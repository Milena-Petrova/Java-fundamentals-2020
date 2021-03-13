package bg.softuni.fundamentals.MIDexams;

import java.util.Scanner;

public class MuOnlineFebMidExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] line = readArray(scanner.nextLine());

        int amountBitcoins = 0;
        int currentHealth = 100;
        boolean isHealth = true;
        String command=""; int pointsOfCommand=0;
       for (int i = 0; i < line.length; i++) {
           String[] element = line[i].split(" ");
                command = element[0];
                pointsOfCommand = Integer.parseInt(element[1]);
                switch (command) {
                    case "potion":
                        if(currentHealth+pointsOfCommand>100){
                            pointsOfCommand=100-currentHealth;
                        }
                        currentHealth = potion(currentHealth, pointsOfCommand);
                        System.out.printf("You healed for %d hp.%n", pointsOfCommand);
                        System.out.printf("Current health: %d hp.%n", currentHealth);
                        break;
                    case "chest":
                        amountBitcoins = amountBitcoins + pointsOfCommand;
                        System.out.printf("You found %d bitcoins.%n", pointsOfCommand);
                        break;
                    default:
                        currentHealth = currentHealth - pointsOfCommand;
                        if (currentHealth > 0) {
                            System.out.printf("You slayed %s.%n", command);
                        } else {
                            isHealth = false;
                            System.out.printf("You died! Killed by %s.%n", command);
                            System.out.printf("Best room: %d", i+1);
                        }
                        break;
                }
            if(!isHealth){
                break;
            }
        }if(isHealth){
            System.out.println("You've made it!");
            System.out.printf("Bitcoins: %d%n",amountBitcoins);
            System.out.printf("Health: %d",currentHealth);
        }
    }
    private static int potion(int currentHealth,int point){
        currentHealth = currentHealth+point;
        if(currentHealth>100){
            currentHealth = 100;
        }
        return currentHealth;
    }
    private static String[] readArray(String lineOfNumbers) {
        String[]numbersAsString = lineOfNumbers.split("\\|");
        String[] array = new String[numbersAsString.length];
        for (int i = 0; i < numbersAsString.length ; i++) {
            array[i]=numbersAsString[i];
        }
        return array;
    }
}
