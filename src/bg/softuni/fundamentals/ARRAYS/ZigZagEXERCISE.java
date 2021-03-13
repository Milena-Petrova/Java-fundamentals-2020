package bg.softuni.fundamentals.ARRAYS;

import java.util.Scanner;
//Write a program which creates 2 arrays.
// You will be given an integer n.
// On the next n lines, you get 2 integers. Form 2 arrays as shown below.
/*      4
        1 5
        9 10
        31 81
        41 20
        */
/*output: 1 10 31 20
          5 9 81 41*/

public class ZigZagEXERCISE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());

        int[]first = new int[input];
        int[]second = new int[input];

        for (int i = 0; i<input ; i++) {
            String[]line = scanner.nextLine().split(" ");
            if(i%2==0){
            first[i]=Integer.parseInt(line[1]);
            second[i]=Integer.parseInt(line[0]);
        }else{
                first[i]=Integer.parseInt(line[0]);
                second[i]=Integer.parseInt(line[1]);
    }
}

        for (int i = 0; i < second.length ; i++) {
            System.out.print(second[i]+" ");
        }
        System.out.println();
        for (int i = 0; i < first.length ; i++) {
            System.out.print(first[i]+" ");
        }
        }

        }
