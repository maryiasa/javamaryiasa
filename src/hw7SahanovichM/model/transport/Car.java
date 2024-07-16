package hw7SahanovichM.model.transport;

import hw7SahanovichM.interfaces.IControl;
import hw7SahanovichM.interfaces.IFillUp;
import hw7SahanovichM.interfaces.IService;

import java.util.Objects;

public final class Car extends Transport implements IControl, IService, IFillUp {

    public Car(String model, float weight, int maxSpeed, int seats, Engine engine, Battery battery, Radiator radiator) {
        super(model, weight, maxSpeed, seats, engine, battery, radiator);
    }

    @Override
    public String toString() {
        return "Transport model : " + this.getModel() + "\nCar weight : " + this.getWeight() + " kg" +
                "\nNumber of seats : "  + this.getSeats() + "\nCar Engine : " + this.getEngine() + "cc" +
                "\nCar Battery : " + this.getBattery() + "\nCar Radiator : " + this.getRadiator();
    }

    public static String getRentalCost(Car car) {
        if (car.getModel().equals("Genesis GV80")) {
            return "Car rental costs 100$ per hour.";
        } else return "Don't have such information.";
    }

    public String getCarCategory(float weight) {
        return super.getVehicleCategory(weight);
    }

    @Override
    public void hitTheBrakes() {
        System.out.println("Car stopped");
    }

    @Override
    public void turnOnLeftTurnSignal() {
        System.out.println("Left turn signal is turned on");
    }

    @Override
    public void turnOffLeftTurnSignal() {
        System.out.println("Left turn signal is turned off");
    }

    @Override
    public void fillUp(Engine engine) {
        if (this.getModel().equals("Genesis G80")) {
            engine.setGasoline("Gasoline 95");
        }
        System.out.println(engine.getGasoline());
    }

    @Override
    public void oilChange() {
        if (this.getModel().equals("Genesis G80")) {
            super.setOil("MOTUL 5W40");
        }
        System.out.println(getOil());
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getModel(), this.getEngine());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Car car = (Car) obj;
        return Objects.equals(car.getModel(), getModel()) && Objects.equals(car.getEngine(), getEngine());
    }
}
