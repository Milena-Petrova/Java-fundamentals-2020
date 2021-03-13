package bg.softuni.fundamentals.FNALexam;

import java.util.*;

public class NeedForSpeedIII_10_04_20 {
    public static class Car {
        String name;
        int mileage;
        int fuel;

        public Car(String name, int mileage, int fuel) {
            this.name = name;
            this.mileage = mileage;
            this.fuel = fuel;
        }

        public void increaseMileage(int mileage) {
            this.mileage += mileage;
        }

        public void decreaseFuel(int fuel) {
            this.fuel -= fuel;
        }

        public int refueledCar(int fuel) {
            this.fuel += fuel;
            return fuel;
        }

        public String getName() {
            return name;
        }

        public int revertKM(int mileage) {
            return this.mileage -= mileage;
        }

        public void setMileage(int mileage) {
            this.mileage = mileage;
        }

        public int getMileage() {
            return mileage;
        }

        public void setFuel(int fuel) {
            this.fuel = fuel;
        }

        public int getFuel() {
            return fuel;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        Map<String, Car> cars = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split("\\|");
            Car car = new Car(input[0], Integer.parseInt(input[1]), Integer.parseInt(input[2]));
            cars.put(input[0], car);
        }
        String command = scanner.nextLine();

        while (!command.equals("Stop")) {
            String[] token = command.split(" : ");
            switch (token[0]) {
                case "Drive":
                    String name = token[1];
                    int distance = Integer.parseInt(token[2]);
                    int fuel = Integer.parseInt(token[3]);
                    if (cars.get(name).getFuel() < fuel) {
                        System.out.println("Not enough fuel to make that ride");
                    } else {
                        cars.get(name).decreaseFuel(fuel);
                        cars.get(name).increaseMileage(distance);
                        System.out.printf("%s driven for %d kilometers. %d liters of fuel consumed.%n", name, distance, fuel);
                    }
                    if (cars.get(name).getMileage() >= 100000) {
                        cars.remove(name);
                        System.out.printf("Time to sell the %s!%n", name);
                    }
                    break;
                case "Refuel":
                    String refuelName = token[1];
                    int refuel = Integer.parseInt(token[2]);
                    if (refuel + cars.get(refuelName).getFuel() >= 75) {
                        refuel = 75 - cars.get(refuelName).getFuel();
                        cars.get(refuelName).setFuel(75);
                    } else {
                        cars.get(refuelName).refueledCar(refuel);
                    }
                    System.out.printf("%s refueled with %d liters%n", refuelName, refuel);
                    break;
                case "Revert":
                    String revertName = token[1];
                    int kilometers = Integer.parseInt(token[2]);
                    int revert = cars.get(revertName).revertKM(kilometers);
                    if (revert < 10000) {
                        cars.get(revertName).setMileage(10000);
                    }else {
                        System.out.printf("%s mileage decreased by %d kilometers%n", revertName, kilometers);
                    }
                    break;
            }
            command = scanner.nextLine();
        }
        cars.values().stream()
                .sorted((a, b) -> Integer.compare(b.getMileage(), a.getMileage()))
                .forEach(e -> System.out.println(e.getName() + " -> Mileage: " + e.getMileage() + " kms, Fuel in the tank: " + e.getFuel() + " lt."));
//        for (Map.Entry<String, Car> entry : cars.entrySet()) {
//            System.out.println(entry.getValue().getName() + " -> Mileage: " + entry.getValue().getMileage() + " kms, Fuel in the tank: " + entry.getValue().getFuel() + "lt");
    }

}



