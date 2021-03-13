package bg.softuni.fundamentals.LABS;

import java.util.Scanner;

public class RefactorVolumeOfPiramid {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        System.out.print("Length: ");
        double lenght = Double.parseDouble(scanner.nextLine());
        System.out.print("Width: ");
        double width = Double.parseDouble(scanner.nextLine());
        System.out.print("Height: ");
        double height = Double.parseDouble(scanner.nextLine());

        double piramidVolume = (lenght * width * height) / 3;
        System.out.printf("Pyramid Volume: %.2f",piramidVolume );
    }
}
