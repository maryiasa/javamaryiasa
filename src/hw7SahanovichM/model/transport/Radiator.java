package hw7SahanovichM.model.transport;

public class Radiator {

    private String radiator;

    public void setRadiator(String radiator) {
        this.radiator = radiator;
    }

    @Override
    public String toString() {
        return this.radiator;
    }

    public Radiator(String radiator) {
        this.setRadiator(radiator);
    }
}
