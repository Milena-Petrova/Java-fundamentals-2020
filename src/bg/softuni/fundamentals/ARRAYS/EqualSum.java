package bg.softuni.fundamentals.ARRAYS;

import java.util.Scanner;
/*Write a program that determines if there exists an element in the array such that the sum of the elements on its left
 is equal to the sum of the elements on its right. If there are no elements to the left / right,
  their sum is considered to be 0. Print the index that satisfies the required condition or “no” if there is no such index.*/
//10 5 5 99 3 4 2 5 1 1 4 --> output 3
public class EqualSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[]line = scanner.nextLine().split(" ");
        int[]nums = new int[line.length];

        for (int i = 0; i < nums.length ; i++) {
            nums[i]=Integer.parseInt(line[i]);
        }
        boolean isEqual = false;
        for (int i = 0; i < nums.length ; i++) {
            int leftSum = 0;
            int rightSum = 0;
            //цикъл за ляватасума
            for (int j = i-1; j >=0 ; j--) {
                leftSum+=nums[j];
            }
            //цикъл за дясната сума
            for (int j = i+1; j < nums.length; j++) {
                rightSum+=nums[j];
            }
            if(leftSum==rightSum){
               isEqual=true;
                System.out.println(i);
                break;
            }
        }
        if(!isEqual){
            System.out.println("no");
        }
    }
}
