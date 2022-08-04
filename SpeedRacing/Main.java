package DefiningClassesExercise.SpeedRacing;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String,Car> cars = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            String [] line = scanner.nextLine().split(" ");
            //information Model, fuel amount, fuel cost for 1 kilometer
            String model = line[0];
            int fuelAmount = Integer.parseInt(line[1]);
            double fuelCostForKm = Double.parseDouble(line[2]);
            Car car = new Car(model,fuelAmount,fuelCostForKm);
            cars.put(model,car);

        }
        String comand = scanner.nextLine();
        while (!comand.equals("End")){
            String[] info = comand.split(" ");
            String carForDrive = info[1];
            int kmToMoove = Integer.parseInt(info[2]);
            Car car = cars.get(carForDrive);
            if (cars.containsKey(carForDrive)){
                double fuelneed = car.fuelNeed(kmToMoove);
               if (car.getFuelAmount() >= fuelneed){
                   double newFuel = car.getFuelAmount() - fuelneed;
                   car.setFuelAmount(newFuel);
                   car.setDistanceTraveled(kmToMoove);
                } else {
                   System.out.println("Insufficient fuel for the drive");
               }
            }


            comand=scanner.nextLine();
        }

        cars.entrySet()
                .forEach(Object::toString);

    }
}
