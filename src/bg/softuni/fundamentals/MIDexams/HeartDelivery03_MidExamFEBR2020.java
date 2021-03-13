package bg.softuni.fundamentals.MIDexams;

import java.util.Scanner;

/*For example, we are given this neighborhood: 6@6@6.
 Cupid is at the start and jumps with a length of 2.
 He will end up at index 2 and decrease the needed hearts there by 2: [6, 6, 4].
 Next he jumps again with a length of 2 and goes outside the neighborhood,
 so he goes back to the first house (index 0)
 and again decreases the needed hearts there: [4, 6, 4].*/
public class HeartDelivery03_MidExamFEBR2020 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[]neighborhood = parseArray(scanner.nextLine());
        String command = scanner.nextLine();

        int indexOfTargetJump=0;

        while (!command.equals("Love!")){
            String[]token=command.split("\\s+");
            int jump = Integer.parseInt(token[1]);//обхват на скок
            indexOfTargetJump += jump;
          if(indexOfTargetJump>=neighborhood.length) {
              indexOfTargetJump = 0;
          }
            if(neighborhood[indexOfTargetJump]>0){
                neighborhood[indexOfTargetJump]-=2;
                if(neighborhood[indexOfTargetJump]==0){
                    System.out.printf("Place %d has Valentine's day.",indexOfTargetJump);
                    System.out.println();
                }

            }else{
                System.out.printf("Place %d already had Valentine's day.",indexOfTargetJump);
                System.out.println();
            }

            command = scanner.nextLine();
        }
        System.out.printf("Cupid's last position was %d.",indexOfTargetJump);
        System.out.println();
        int count =0;
        for (int i = 0; i < neighborhood.length; i++) {
                      if(neighborhood[i]!=0) {
                          count++;
                      }
        }
        if(count==0){
            System.out.println("Mission was successful.");
        }else{
            System.out.printf("Cupid has failed %d places.",count);
        }


    }

    private static int[] parseArray(String lineOfNumbers) {
        String[]numbersAsString = lineOfNumbers.split("\\@");
        int[]array = new int[numbersAsString.length];
        for (int i = 0; i < numbersAsString.length ; i++) {
            array[i]=Integer.parseInt(numbersAsString[i]);
        }
        return array;
    }
}

