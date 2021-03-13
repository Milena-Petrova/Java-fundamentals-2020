package bg.softuni.fundamentals.LISTS;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListManipulationsAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] digits = line.split("\\s+");
        List<Integer> numbers = new ArrayList<>();
        for (String s : digits) {
            int num = Integer.parseInt(s);
            numbers.add(num);
        }
        String command = scanner.nextLine();
        while (!command.equals("end")){
            String[]token = command.split("\\s+");
            switch (token[0]) {
                case "Contains":
                    int contain = Integer.parseInt(token[1]);
                    if (numbers.contains(contain)) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No such number");
                    }
                    break;
                case "Print":
                    switch (token[1]) {
                        case "even":
                            for (Integer number : numbers) {
                                if (number % 2 == 0) {
                                    System.out.print(number + " ");
                                }
                            }
                            System.out.println();
                            break;
                        case "odd":
                            for (Integer number : numbers) {
                                if (number % 2 == 1) {
                                    System.out.print(number + " ");
                                }
                            }
                            System.out.println();
                            break;
                    }
                    break;
                case "Get":
                    int sum = 0;
                    for (Integer number : numbers) {
                        sum += number;
                    }
                    System.out.println(sum);
                    break;
                case "Filter":
                    String condition = token[1];
                    char[]elements = condition.toCharArray();
                    if (elements.length == 1) {
                        switch (elements[0]) {
                            case '>':
                                int more = Integer.parseInt(token[2]);
                                for (Integer number : numbers) {
                                    if (number>more) {
                                        System.out.print(number + " ");
                                    }
                                }
                                System.out.println();
                                break;
                            case '<':
                                int less = Integer.parseInt(token[2]);
                                for (Integer number : numbers) {
                                    if (number<less) {
                                        System.out.print(number + " ");
                                    }
                                }
                                System.out.println();
                                break;
                        }
                    }if (elements.length == 2) {
                    int first = elements[0]; int second = elements[1];
                    if (first==62&&second==61) {       //ascii --->  >=
                        int more = Integer.parseInt(token[2]);
                        for (Integer number : numbers) {
                            if (number >= more) {
                                System.out.print(number + " ");
                            }
                        }
                        System.out.println();
                    }else if(first==60&&second==61) {
                        int less = Integer.parseInt(token[2]);
                        for (Integer number : numbers) {
                            if (number <= less) {
                                System.out.print(number + " ");
                            }
                        }
                        System.out.println();
                    }
                }break;
            }
            command=scanner.nextLine();
        }
    }
}
