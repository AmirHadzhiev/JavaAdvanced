package DefiningClassesExercise.SpeedRacing;

import java.io.PrintStream;

public class Car {
    String model ;
    double fuelAmount ;
    double fuelCostForKm ;
    private int distanceTraveled;

    public Car(String model, int fuelAmount, double fuelCostForKm) {
        this.model = model;
        this.fuelAmount = fuelAmount;
        this.fuelCostForKm = fuelCostForKm;
    }
    public double kmTravel (double kmtoMoove) {
        return this.fuelCostForKm * kmtoMoove;
    }
    public  double fuelNeed (double kmToTravel){
        return kmToTravel* this.fuelCostForKm;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getFuelAmount() {
        return fuelAmount;
    }

    public void setFuelAmount(double fuelAmount) {
        this.fuelAmount = fuelAmount;
    }

    public double getFuelCostForKm() {
        return fuelCostForKm;
    }

    public void setFuelCostForKm(double fuelCostForKm) {
        this.fuelCostForKm = fuelCostForKm;
    }

    public int getDistanceTraveled() {
        return distanceTraveled;
    }

    public void setDistanceTraveled(int distanceTraveled) {
        this.distanceTraveled += distanceTraveled;
    }

    @Override
    public String toString() {
        PrintStream printf = System.out.printf("%s %.2f %d%n", this.model, this.fuelAmount, this.distanceTraveled);
        return printf.toString();
    }
}
