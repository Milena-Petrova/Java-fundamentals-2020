package bg.softuni.fundamentals.TextProcessingEXERCISE;
/*Explosions are marked with ‘>’. Immediately after the mark, there will be an integer, which signifies the strength of the explosion.
You should remove x characters (where x is the strength of the explosion), starting after the punch character (‘>’).
If you find another explosion mark (‘>’) while you’re deleting characters, you should add the strength to your previous explosion.
When all characters are processed, print the string without the deleted characters.
You should not delete the explosion character – ‘>’, but you should delete the integers, which represent the strength.
input abv>1>1>2>2asdasd ----> output abv>>>>dasd
pesho>2sis>1a>2akarate>4hexmaster ----> pesho>is>a>karate>master
*/
import java.util.Scanner;

public class StringExplosion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder sb = new StringBuilder((scanner.nextLine()));
        int power =0;
        for (int i = 0; i < sb.length() ; i++) {

            if(sb.charAt(i)=='>'){
                //с този метод взима стойността на символа на i+1 позиция, САМО, ако е нумерик, тоест цифра
                //ако е друг символ връща -1, т.е. false
                power = Character.getNumericValue(sb.charAt(i+1));
                power+=Character.getNumericValue(sb.charAt(i+1));
            }else if(power>0 && sb.charAt(i)!='>'){
                sb.deleteCharAt(i);
                power--;
                i--;
            }
        }
        System.out.println(sb);
    }
}
