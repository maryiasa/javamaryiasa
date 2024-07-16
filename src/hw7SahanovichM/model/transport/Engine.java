package hw7SahanovichM.model.transport;

public class Engine {

    private final static int defDisplacement = 1100;
    private final static String defGasoline = "Gasoline 92";
    private final static String defEngine = "T";

    private String engine;
    private String engineType;
    private int displacement;
    private String gasoline;

    public String getDefEngine() {
        return defEngine;
    }

    public void setEngine(String engine) {
        assert engine != null;
        this.engine = engine.isEmpty() ? this.getDefEngine() : engine;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engine) {
        if (engine.contains("Di")) {
           this.engineType = "D";
        } else if (engine.contains("Gas/Fuel")) {
            this.engineType = "G";
        } else this.engineType = "P";
    }

    public int getDefDisplacement() {
        return defDisplacement;
    }

    public int getDisplacement() {
        return displacement;
    }

    public void setDisplacement(int displacement) {
        this.displacement = displacement < 0 ? this.getDefDisplacement() : displacement;
    }

    private String getDefGasoline() {
        return defGasoline;
    }

    public String getGasoline() {
        return gasoline;
    }

    public void setGasoline(String gasoline) {
        this.gasoline = gasoline.isEmpty() ? this.getDefGasoline() : gasoline;
    }

    public Engine(String engine) {
        this.setEngine(engine);
    }

    @Override
    public String toString() {
        return this.engine;
    }
}