package bg.softuni.fundamentals.EXERCISE;

import java.util.Scanner;

public class VacationEXERCISE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int persons = Integer.parseInt(scanner.nextLine());
        String typeOfGroup = scanner.nextLine();
        String day = scanner.nextLine();

        double amount=0;
        switch (typeOfGroup){
            case "Students":
                switch (day){
                    case"Friday":
                        amount = 8.45*persons;
                        break;
                    case "Saturday":
                        amount = 9.80*persons;
                        break;
                    case "Sunday":
                        amount = 10.46*persons;
                        break;
                }
                if(persons>=30){
                    amount = 0.85*amount;
                }
                break;

            case "Business":
                if(persons>=100){
                    persons=persons-10;
                }
                switch (day){
                    case"Friday":
                        amount = 10.90*persons;
                        break;
                    case "Saturday":
                        amount = 15.60*persons;
                        break;
                    case "Sunday":
                        amount = 16*persons;
                        break;
                }
                break;

            case "Regular":
                switch (day){
                    case"Friday":
                        amount = 15*persons;
                        break;
                    case "Saturday":
                        amount = 20*persons;
                        break;
                    case "Sunday":
                        amount = 22.5*persons;
                        break;
                }
                if(10<=persons&&persons<=20){
                    amount = 0.95*amount;
                }
                break;

        }

        System.out.printf("Total price: %.2f",amount);
    }
}

