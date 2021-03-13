package bg.softuni.fundamentals.METHODS;

import java.text.DecimalFormat;
import java.util.Scanner;
//The possible operators are: / * + -
public class MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double firstNumber = Double.parseDouble(scanner.nextLine());
        String mathOperator = scanner.nextLine();
        double secondNumber = Double.parseDouble(scanner.nextLine());
        System.out.println(new DecimalFormat("#.##").format(getResultOfOperator(firstNumber,mathOperator,secondNumber)));
    }

    private static double getResultOfOperator(double numOne, String operator, double numTwo) {
        double result =0.0;
        switch (operator){
            case "*": result = numOne * numTwo; break;
            case "+": result = numOne + numTwo;break;
            case "-": result = numOne - numTwo; break;
            case "/": if(numTwo!=0){
                result = numOne / numTwo; break;}
            }
        return result;
    }

}

