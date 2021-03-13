package bg.softuni.fundamentals.TextProcessingEXERCISE;

public class Demo {
    public static void main(String[] args) {
        String a = "C55b";
        char letterA = a.charAt(0);
        char letterB = a.charAt(a.length()-1);
        double number = Double.parseDouble(a.substring(1, a.length()-1));
        System.out.println(calculatePosition(letterA));
        System.out.println(calculatePosition(letterB));
        System.out.println(number/calculatePosition(letterA));
        System.out.println(number);
        System.out.println(letterA);
        System.out.println(letterB);
    }
    public static double calculatePosition(char letter){
        char start = 'a';
        char target = Character.toLowerCase(letter);
        double position = target - start+1;
        return position;
    }
}
