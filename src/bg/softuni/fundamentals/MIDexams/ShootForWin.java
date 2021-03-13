package bg.softuni.fundamentals.MIDexams;
/*
Every time you receive an index, you need to shoot the target on that index, if it is possiblie.
Everytime you shoot a target, its value becomes -1 and it is considered shot. Along with that you also need to:
•	Reduce all the other targets, which have greater values than your current target, with its value.
•	All the targets, which have less than or equal value to the shot target, you need to increase with its value.
Keep in mind that you can't shoot a target, which is already shot. You also can't increase or reduce a target, which is considered shot.
When you receive the "End" command, print the targets in their current state and the count of shot targets in the following format:
"Shot targets: {count} -> {target1} {target2}… {targetn}"
 */

import java.util.ArrayList;
import java.util.Scanner;

public class ShootForWin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = readArray(scanner.nextLine());
        String command = scanner.nextLine();

        while (!command.equals("End")) {
            int shoot = Integer.parseInt(command);
            if (shoot < array.length) {
                int old = array[shoot];
                for (int i = 0; i < array.length; i++) {
                    array[shoot] = -1;
                    if (old >= array[array.length - 1 - i] && (array.length - 1 - i) != shoot && array[array.length - 1 - i] != -1) {
                        array[array.length - 1 - i] += old;
                    } else if (old < array[array.length - 1 - i] && (array.length - 1 - i) != shoot && array[array.length - 1 - i] != -1) {
                        array[array.length - 1 - i] -= old;
                    }
                }
            }
            command = scanner.nextLine();
        }
        int count=0;//брои отстреляните мишени
        for (int i = 0; i < array.length; i++) {
            if (array[i] == -1) {
                count++;
            }
        }
        System.out.printf("Shot targets: %d -> ",count);
        for (int i : array) {
            System.out.print(i + " ");
        }


    }

    private static int[] readArray(String line) {
        String[] numbersAsStrings = line.split(" ");
        int[] array = new int[numbersAsStrings.length];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(numbersAsStrings[i]);
        }
        return array;
    }
}
