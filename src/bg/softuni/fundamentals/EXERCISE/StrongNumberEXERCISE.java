package bg.softuni.fundamentals.EXERCISE;

import java.util.Scanner;
//Factorial of each digit is equal to the number. For example 145 is a strong number, because 1! + 4! + 5! = 145.
// Print "yes" if the number is strong and "no" if the number is not strong., 5!=5*4*3*2*1 = 120

public class StrongNumberEXERCISE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int sumFactorial=0;
        for (int i = 0; i < input.length(); i++) {
            //i-я пореден символ има стойност на числов аски таблицата, символ 0=48,
            //символ 1=49; 2=50, затова, за да намерим реално каква е цифрата на конзолата вадим 48
            int digit = input.charAt(i) - 48;
            int factorial = 1;
            for (int j = 1; j <= digit; j++) {
                factorial = factorial * j;
            }
            sumFactorial+=factorial;
        }
      int number = Integer.parseInt(input);
      if(sumFactorial==number){
          System.out.println("yes");
      }else{
          System.out.println("no");
      }
        //if it  strong -> input 145, 1!+4!+5!=145  System.out.println("yes");
        //if its not strong  System.out.println("no");
    }
}



