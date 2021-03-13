package bg.softuni.fundamentals.METHODS;

import java.util.Scanner;
/*You will receive 3 integers. Write a method sum to get the sum of the first two integers and subtract method
that subtracts the third integer from the result from the sum method.
 getSum(int one, int tw0) -> getSubstract(int sum, int third)*/

public class AddAndSubstractEX {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOne = Integer.parseInt(scanner.nextLine());
        int numTwo = Integer.parseInt(scanner.nextLine());
        int numThree = Integer.parseInt(scanner.nextLine());

        System.out.println(getSubstract(getSum(numOne,numTwo),numThree));

    }
public static int getSum(int one,int two){
        int sum = one + two;
        return sum;
}
public static int getSubstract(int first, int second){
        int substract = first - second;
        return substract;
}

}
