package bg.softuni.fundamentals.LISTS;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TrainEX {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //чете от конзолата стринг, който сплитва и мапва към integer и го слага в колекция List
        List<Integer> wagons = Arrays.stream(scanner.nextLine().split("\\s+"))
                                .map(Integer::parseInt).collect(Collectors.toList());
        int maxCapacity = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();

        while(!input.equals("end")){
            String[]token = input.split("\\s+");
            if(token[0].equals("Add")){
            int passengers = Integer.parseInt(token[1]);
            wagons.add(passengers);
            }else{
            int passengers = Integer.parseInt(token[0]);
                for (int i = 0; i < wagons.size() ; i++) {//прверява дали имаме места във вагоните
                    int allPaseengersAdded = wagons.get(i)+passengers;
                    if(allPaseengersAdded<=maxCapacity){
                        wagons.set(i,allPaseengersAdded);
                        break;
                    }
                }
            }
            input=scanner.nextLine();
        }
        for (Integer wagon : wagons) {
            System.out.print(wagon+" ");
        }

    }
}
