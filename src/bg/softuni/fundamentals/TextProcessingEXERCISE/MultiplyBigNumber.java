package bg.softuni.fundamentals.TextProcessingEXERCISE;

import java.util.Scanner;
/*You are given two lines – the first one can be a really big number (0 to 1050). The second one will be a single digit number (0 to 9). You must display the product of these numbers.
Note: do not use the BigInteger class.
input: 9999 ----> output 89991     input: 923847238931983192462832102 ----> output 3695388955727932769851328408
                         9                      4
input 23 ---> output 46
       2
 */
public class MultiplyBigNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstNumber = scanner.nextLine().replaceFirst("^0+","");//с този реджекс "^0+" режем всички нули от началото и ги заменяме с друг символ, в случая без спейс
        int secondNumber = Integer.parseInt(scanner.nextLine());

        if (secondNumber == 0) {
            System.out.println(0);
            return;
        }
        StringBuilder sb = new StringBuilder();
        int carry = 0;//Остатъка при умножение
        for (int i = firstNumber.length() - 1; i >= 0; i--) {
            //String.valueOf(firstNumber.charAt(i)) ---> числовата стойност на текущия символ от стринг 1
            int digit = Integer.parseInt(String.valueOf(firstNumber.charAt(i)));
            int result = digit * secondNumber + carry;
            if (i == 0) {
                sb.insert(0, result);
            } else {
                int restDigit = result % 10;
                carry = result / 10;
                sb.insert(0, restDigit);
            }
        }
        System.out.println(sb);
    }
}
