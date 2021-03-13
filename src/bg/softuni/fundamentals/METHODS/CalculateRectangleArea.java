package bg.softuni.fundamentals.METHODS;

import java.util.Scanner;

public class CalculateRectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int width = Integer.parseInt(scanner.nextLine());
        int lenght = Integer.parseInt(scanner.nextLine());
        System.out.println(getArea(width,lenght));
    }

    private static int getArea(int sideOne, int sideTwo) {
        int area = sideOne*sideTwo;
        return area;
    }
}
