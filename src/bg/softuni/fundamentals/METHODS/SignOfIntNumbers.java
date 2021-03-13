package bg.softuni.fundamentals.METHODS;

import java.util.Scanner;

public class SignOfIntNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());
        printSignOfnumber(input);
    }

    public static void printSignOfnumber(int input){
        if(input>0){
            System.out.printf("The number %d is positive.",input);}
            if(input<0) {
                System.out.printf("The number %d is negative.", input);
            }else{
                    System.out.printf("The number %d is zero.",input);
                }
            }
        }


