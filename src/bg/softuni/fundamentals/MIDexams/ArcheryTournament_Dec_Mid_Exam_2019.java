package bg.softuni.fundamentals.MIDexams;

import java.util.Scanner;

public class ArcheryTournament_Dec_Mid_Exam_2019 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[]numbers = parseArray(scanner.nextLine());

        int sumPoints=0;
        String input = scanner.nextLine();
        while (!input.equals("Game over")){
        String[]token=input.split("@");
        String comand = token[0];
    //    int start =Integer.parseInt(token[1] );
   //     int lenghtPath = Integer.parseInt(token[2]);
        switch (comand) {
            case "Shoot Left":
            if(Integer.parseInt(token[1])>=0 && Integer.parseInt(token[1])< numbers.length){
                int numberLeftIndex = Integer.parseInt(token[1] )- Integer.parseInt(token[2]);
                while(numberLeftIndex<0){
                    numberLeftIndex = numbers.length + numberLeftIndex;
                }
                if(numbers[numberLeftIndex]>=5){
                    numbers[numberLeftIndex]-=5;
                    sumPoints+=5;
                }else{
                    sumPoints+=numbers[numberLeftIndex];
                    numbers[numberLeftIndex]=0;
                }
            }
                break;
            case "Shoot Right":
                if(Integer.parseInt(token[1])>=0 && Integer.parseInt(token[1])< numbers.length){
                    int numberRightIndex = Integer.parseInt(token[1])+ Integer.parseInt(token[2]);
                    while(numberRightIndex>=numbers.length){
                        numberRightIndex = numberRightIndex - numbers.length;
                    }
                    if(numbers[numberRightIndex]>=5){
                        numbers[numberRightIndex]-=5;
                        sumPoints+=5;
                    }else{
                        sumPoints+=numbers[numberRightIndex];
                        numbers[numberRightIndex]=0;
                    }
                }break;
            case "Reverse":
                for (int i = 0; i < numbers.length/2 ; i++) {
                    int swapIndex = numbers.length-1-i;
                    int oldNum = numbers[i];
                    numbers[i]=numbers[swapIndex];
                    numbers[swapIndex]=oldNum;
                }
                break;
        }
            input = scanner.nextLine();
        }
        for (int i = 0; i < numbers.length-1; i++) {
            System.out.print(numbers[i] + " - ");
        }
            System.out.println(numbers[numbers.length-1]);
            System.out.printf("Iskren finished the archery tournament with %d points!",sumPoints);
        }

    private static int[] parseArray(String lineOfNumbers) {
        String[]numbersAsString = lineOfNumbers.split("\\|");
        int[]array = new int[numbersAsString.length];
        for (int i = 0; i < numbersAsString.length ; i++) {
            array[i]=Integer.parseInt(numbersAsString[i]);
        }
        return array;
    }
    }


