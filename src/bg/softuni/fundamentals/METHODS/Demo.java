package bg.softuni.fundamentals.METHODS;

import java.util.Scanner;
//0 1 2 3 4 5 6 7 -> input
//0 1 1 2 3 5 8 13 -> fibonacci(input)
public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());
        int x = fibonacci(input);
        System.out.println(x);
    }
    public static int fibonacci(int n){
        if(n==0){
            return 0;
        }else if(n==1){
            return 1;
        }else{
            return fibonacci(n-1)+fibonacci(n-2);
        }
    }
    }

