package bg.softuni.fundamentals.TEXTprocessingLAB;
/*
input:            output: kgb
ice
kicegiciceeb
*/
import java.util.Scanner;

public class Substring2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        String text = scanner.nextLine();
//маха всички появи на думата и задава следващ индеь на дума в случай,
//
//
// че се е появила след премахването на стринговете
        int index = text.indexOf(word);
        while(index !=-1){//тоест, докато се среща думата в текста
            text = text.replace(word,"");
            index = text.indexOf(word);
        }
        System.out.println(text);
    }


}
