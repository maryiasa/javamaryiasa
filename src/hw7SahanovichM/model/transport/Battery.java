package hw7SahanovichM.model.transport;

public class Battery {
    private String battery;

    public void setBattery(String battery) {
        this.battery = battery;
    }

    public Battery(String battery) {
        this.setBattery(battery);
    }

    @Override
    public String toString() {
        return this.battery;
    }
}
