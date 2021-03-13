package bg.softuni.fundamentals.EXERCISE;

import java.util.Scanner;

public class PokeMonEXERCISE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());//power
        int m = Integer.parseInt(scanner.nextLine());//distance between targets
        int y = Integer.parseInt(scanner.nextLine());//exhaustion factor
        int countTargets = 0;
        int originN = n;
        while(n>=m){
            n-=m;
            if(2*n==originN&&y!=0){
                n = n/y;
            }
            countTargets++;
        }System.out.println(n);
        System.out.println(countTargets);
    }
}
