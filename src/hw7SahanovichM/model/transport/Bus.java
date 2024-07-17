package hw7SahanovichM.model.transport;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import hw7SahanovichM.interfaces.IControl;
import hw7SahanovichM.interfaces.IFillUp;
import hw7SahanovichM.interfaces.IService;

import java.util.Objects;

public final class Bus extends Transport implements IControl, IService, IFillUp {

    private static final Logger LOGGER = LogManager.getLogger(Bus.class);

    public Bus(String model, float weight, int maxSpeed, int seats, int trunkCapacity, Engine engine) {
        super(model, weight, maxSpeed, seats, trunkCapacity, engine);
    }

    @Override
    public String toString() {
        return "Transport model : " + this.getModel() + "\nCar weight : " + this.getWeight() + " kg" +
                "\nNumber of seats : "  + this.getSeats() + "\nTrunk capacity : " + this.getTrunkCapacity()
                + "\nBus Engine : " + this.getEngine() + "cc";
    }

    public String getBusCategory(float weight) {
        return super.getVehicleCategory(weight);
    }

    @Override
    public void hitTheBrakes() {
        LOGGER.info("Bus stopped");
    }

    @Override
    public void turnOnLeftTurnSignal() {
        LOGGER.info("Left turn signal is turned on");
    }

    @Override
    public void turnOffLeftTurnSignal() {
        LOGGER.info("Left turn signal is turned off");
    }

    @Override
    public void fillUp(Engine engine) {
        if (this.getModel().equals("Buick GL8 Century")) {
            engine.setGasoline("Diesel");
        }
        LOGGER.info(engine.getGasoline());
    }

    @Override
    public void oilChange() {
        if (this.getModel().equals("Buick GL8 Century")) {
            super.setOil("RAVENOL SSO 0W-30");
        }
        LOGGER.info(getOil());
    }

    public int hashCode() {
        return Objects.hash(this.getModel(), this.getEngine());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Bus bus = (Bus) obj;
        return Objects.equals(bus.getModel(), getModel()) && Objects.equals(bus.getEngine(), getEngine());
    }
}
