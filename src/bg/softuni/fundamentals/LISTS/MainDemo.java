package bg.softuni.fundamentals.LISTS;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//трябва да прочетем входа, докато не се появи 0,
// тогава се игнорират останалите числа
//след това да се разпечатат в обратен ред
/*
1
2 3
4 0 5 1
2 3
*/

public class MainDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*Конвертира вход стринг --> масив -->лист от стрингове
        List<String> items = Arrays.stream(values.split(" "))
        		.collect(Collectors.toList());*/
        List<Integer>numbers = new ArrayList<>();
        int number = scanner.nextInt();//зададен ни е размер на листа
        //може да чете на следващ ред независимо от спейсовете
        while (number != 0) {
            numbers.add(number);//добавяме елементите на листа
            number = scanner.nextInt();
        }
        for (int i = numbers.size()-1; i >=0 ; i--) {
            System.out.print(numbers.get(i)+" ");
        }
    }
}
