package bg.softuni.fundamentals.LISTS;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tests {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = new ArrayList<>();
        String[] input = scanner.nextLine().split(" ");
        int[] numberArray = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            numberArray[i] = Integer.parseInt(input[i]);
            numbers.add(numberArray[i]);
        }

        String command = scanner.nextLine();
        while (!command.equals("end")) {
            String[] line = command.split(" ");
            switch (line[0]) {
                case "Contains":
                    int currentNumber = Integer.parseInt(line[1]);
                    if (numbers.contains(currentNumber)) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No such number");
                    }
                    break;
                case "Print":
                    if (line[1].equals("even")) {
                        for (int i = 0; i < numbers.size(); i++) {
                            if (numbers.get(i) % 2 == 0) {
                                System.out.print(numbers.get(i) + " ");
                            }
                        }
                        System.out.println();
                    } else {
                        for (int i = 0; i < numbers.size(); i++) {
                            if (numbers.get(i) % 2 != 0) {
                                System.out.print(numbers.get(i) + " ");
                            }
                        }
                        System.out.println();
                    }
                case "Get":
                    if (line[1].equals("sum")){
                        int sum = 0;
                        for (int i = 0; i < numbers.size(); i++) {
                            sum += numbers.get(i);
                        }
                        System.out.println(sum);
                    }
                    break;
                case "Filter":
                    switch (line[1]) {
                        case ">":
                            int num = Integer.parseInt(line[2]);
                            for (int i = 0; i < numbers.size(); i++) {
                                if (numbers.get(i) > num) {
                                    System.out.print(num + " ");
                                }
                            }
                            System.out.println();
                            break;
                        case ">=":
                            int numSecond = Integer.parseInt(line[2]);
                            for (int i = 0; i < numbers.size(); i++) {
                                if (numbers.get(i) >= numSecond) {
                                    System.out.print(numSecond + " ");
                                }
                            }
                            System.out.println();
                            break;
                        case "<":
                            int numThird = Integer.parseInt(line[2]);
                            for (int j = 0; j < numbers.size(); j++) {
                                if (numbers.get(j) < numThird) {
                                    System.out.print(numThird + " ");
                                }
                            }
                            System.out.println();
                            break;
                        case "<=":
                            int numForth = Integer.parseInt(line[2]);
                            for (int i = 0; i < numbers.size(); i++) {
                                if (numbers.get(i) <= numForth) {
                                    System.out.print(numForth + " ");
                                }
                            }
                            System.out.println();
                            break;
                    }
                    break;
            }
            command = scanner.nextLine();
        }
    }
}