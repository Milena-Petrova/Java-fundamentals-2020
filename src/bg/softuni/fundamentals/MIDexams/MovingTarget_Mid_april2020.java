package bg.softuni.fundamentals.MIDexams;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/*
•	Shoot {index} {power}
o	Shoot the target at the index, if it exists by reducing its value by the given power (integer value).A target is considered shot when its value reaches 0.
o	Remove the target, if it is shot.
•	Add {index} {value}
o	Insert a target with the received value at the received index, if it exist. If not, print: "Invalid placement!"
•	Strike {index} {radius}
o	Remove the target at the given index and the ones before and after it depending on the radius, if such exist. If any of the indices in the range is invalid print:
"Strike missed!" and skip this command.
52 74 23 44 96 110
Shoot 5 10
Shoot 1 80
Strike 2 1
Add 22 3
End
Invalid placement!
52|100
 */
public class MovingTarget_Mid_april2020 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        List<Integer> targets = Arrays.stream(line.split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        String command = scanner.nextLine();
        while(!command.equals("End")){
            String[]token = command.split("\\s+");
                switch (token[0]){
                case "Shoot":
                    int index = Integer.parseInt(token[1]);
                    int power = Integer.parseInt(token[2]);
                    shootTarget(targets,index,power);
                    break;
                case "Add":
                    addValue(targets,Integer.parseInt(token[1]), Integer.parseInt(token[2]));
                    break;
                case "Strike":
                    strike(targets,Integer.parseInt(token[1]),Integer.parseInt(token[2]));
                    break;

            }
            command=scanner.nextLine();
        }

        for (int i = 0; i < targets.size() ; i++) {
            System.out.print(targets.get(i));
            if(i != targets.size()-1){
            System.out.print("|");
        }

        }
    }
private static void strike(List<Integer>list, int index, int range){
    if (0 <= index && index < list.size()){
        int leftBound = index - range;
        int rightBound = index + range;
        if (leftBound>=0 && rightBound < list.size()){
            for (int i = leftBound; i <= rightBound ; i++) {
                list.remove(leftBound);
            }
        }else{
            System.out.println("Strike missed!");
        }
    }

}
    private static void shootTarget(List<Integer>list, int index, int power) {
        if (0 <= index && index < list.size()) {
            int number = list.get(index) - power;
            if (number <= 0) {
                list.remove(index);
            } else {
                list.set(index, number);
            }
        }
    }
    private static void addValue (List<Integer>list, int index, int value){
        if (0 <= index && index < list.size()){
            list.add(index,value);
        }else {
            System.out.println("Invalid placement!");
        }
    }
}
