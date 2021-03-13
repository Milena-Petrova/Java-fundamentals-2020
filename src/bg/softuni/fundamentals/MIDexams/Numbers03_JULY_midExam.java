package bg.softuni.fundamentals.MIDexams;

import java.util.*;

public class Numbers03_JULY_midExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        int[] lineOfNumbers = parseArray(line);

        int sum = 0;//хубаво е сумата да е double, защото приема по-големи числа
        for (int lineOfNumber : lineOfNumbers) {
            sum += lineOfNumber;
        }
        double avearge = (double) sum / lineOfNumbers.length;
        List<Integer> aboveAverage = new ArrayList<>();
        for (int lineOfNumber : lineOfNumbers) {
            //взимаме си най-големите стойности и ги слагаме в лист
            if (lineOfNumber > avearge) {
                aboveAverage.add(lineOfNumber);
            }
        }
        if(aboveAverage.isEmpty()){
            System.out.println("No");
        }else {
            //сортираме листа в обратен ред, както искат по условие
            Collections.sort(aboveAverage);
            Collections.reverse(aboveAverage);
            for (int i = 0; i < Math.min(aboveAverage.size(), 5); i++) {
                System.out.print(aboveAverage.get(i) + " ");
            }
        }
    }

    private static int[] parseArray(String lineOfNumbers) {
        String[] numbersAsString = lineOfNumbers.split(" ");
        int[] array = new int[numbersAsString.length];
        for (int i = 0; i < numbersAsString.length; i++) {
            array[i] = Integer.parseInt(numbersAsString[i]);
        }
        return array;
    }
}
