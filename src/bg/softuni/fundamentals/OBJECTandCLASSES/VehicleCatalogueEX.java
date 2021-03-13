package bg.softuni.fundamentals.OBJECTandCLASSES;

import java.util.ArrayList;
import java.util.Scanner;

/*
You will receive two types of vehicle - car or truck.
while the command.equals "End" you will receive lines of input in the format:
{typeOfVehicle} {model} {color} {horsepower}
After the "End" command, you will start receiving models of vehicles. Print for every received vehicle its data in the format:
Type: {typeOfVehicle}
Model: {modelOfVehicle}
Color: {colorOfVehicle}
Horsepower: {horsepowerOfVehicle}
When you receive the command "Close the Catalogue", stop receiving input and print the average horsepower for the cars
 and for the trucks in the format:
"{typeOfVehicles} have average horsepower of {averageHorsepower}."
The average horsepower is calculated by dividing the sum of horsepower for all vehicles of the type by the total count of vehicles from the same type.
Format the answer to the 2nd decimal point.
*/
public class VehicleCatalogueEX {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        ArrayList<Vehicles> cars = new ArrayList<>();
        ArrayList<Vehicles> trucks = new ArrayList<>();
        while (!command.equals("End")) {
            String[] token = command.split("\\s+");
            Vehicles vehicle = new Vehicles(token[0], token[1], token[2], Integer.parseInt(token[3]));
            if (vehicle.getType().equals("Car")) {
                cars.add(vehicle);
            } else {
                trucks.add(vehicle);
            }
            command = scanner.nextLine();
        }
        command = scanner.nextLine();
        while (!command.equals("Close the Catalogue")) {
            for (Vehicles car : cars) {
                if (car.getModel().equals(command)) {
                    System.out.println(car.toString());
                }
            }
            for (Vehicles truck : trucks) {
                if (truck.getModel().equals(command)) {
                    System.out.println(truck.toString());
                }
            }
            command = scanner.nextLine();
        }
        double sumOfCarsPower = 0; double averageCarsPower = 0;
        double sumOfTruckssPower =0; double averageTruckPower =0;
        if (!cars.isEmpty()) {
            for (Vehicles car : cars) {
                sumOfCarsPower += car.getHorsepower();
            }
            averageCarsPower = sumOfCarsPower / cars.size();
        }
            System.out.printf("Cars have average horsepower of: %.2f.%n", averageCarsPower);

        if (!trucks.isEmpty()) {
            for (Vehicles truck : trucks) {
                sumOfTruckssPower += truck.getHorsepower();
            }
            averageTruckPower = sumOfTruckssPower / trucks.size();
        }
            System.out.printf("Trucks have average horsepower of: %.2f.",averageTruckPower);
    }
}
class Vehicles {
    String type;
    String model;
    String color;
    int horsepower;

    public Vehicles(String type, String model, String color, int horsepower) {
        setType(type);
        this.model = model;
        this.color = color;
        this.horsepower = horsepower;
    }
    public String getType() {
        return type;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getHorsepower() {
        return horsepower;
    }

    private void setType(String type) {
        type = type.replace(type.charAt(0), Character.toUpperCase(type.charAt(0)));
        this.type = type;
    }
    @Override
    public String toString() {
        return String.format("Type: %s%n" +
                        "Model: %s%n" +
                        "Color: %s%n" +
                        "Horsepower: %d", this.getType(),
                this.getModel(), this.getColor(), this.getHorsepower());
    }
}
