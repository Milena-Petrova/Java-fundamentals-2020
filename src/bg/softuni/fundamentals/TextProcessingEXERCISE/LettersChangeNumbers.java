package bg.softuni.fundamentals.TextProcessingEXERCISE;

import java.util.Scanner;

/*
First you start with the letter before the number.
•	If it's uppercase you divide the number by the letter's position in the alphabet.
•	If it's lowercase you multiply the number with the letter's position in the alphabet.
Then you move to the letter after the number.
•	If it's uppercase you subtract its position from the resulted number.
•	If it's lowercase you add its position to the resulted number.
A12b s17G	----> 330.00	Explane: 12/1=12, 12+2=14, 17*19=323, 323–7=316, 14+316=330
 */
public class LettersChangeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] strings = line.split("\\s+");

        double sum = 0;

        for (String s : strings) {
            char first = s.charAt(0);
            //substring ---> от индекс 1 до последния, но НЕ включително, без него
            double number = Double.parseDouble(s.substring(1,s.length()-1));
            char last = s.charAt(s.length()-1);
            if(Character.isLowerCase(first)){
                sum+=number*calculatePosition(first);
            }else{
               sum +=number/calculatePosition(first);
            }
            if(Character.isLowerCase(last)){
                sum+=calculatePosition(last);
            }else{
                sum-=calculatePosition(last);
            }
        }
        System.out.printf("%.2f",sum);
    }
    public static double calculatePosition(char letter){
        char start = 'a';
        char target = Character.toLowerCase(letter);
    double position = target - start+1;
        return position;
    }
}
