package hw7SahanovichM.model.transport;

public abstract class Transport {
    private final static String defModel = "Transport";
    private final static int defHeight = 1;
    private final static float defWeight = 0.1f;
    private final static int defMaxSpeed = 1;
    private final static int defSeats = 1;
    private final static int defTrunkCapacity = 1;
    private final static String defOil = "SAE 15W-40";

    private Engine engine;
    private Battery battery;
    private Radiator radiator;
    private String model;
    private int height;
    private float weight;
    private int maxSpeed;
    private int seats;
    private int trunkCapacity;
    private String oil;

    public String getDefModel() {
        return defModel;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model.isEmpty() ? this.getDefModel() : model;
    }



    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }



    public Battery getBattery() {
        return battery;
    }

    public void setBattery(Battery battery) {
        this.battery = battery;
    }



    public Radiator getRadiator() {
        return radiator;
    }

    public void setRadiator(Radiator radiator) {
        this.radiator = radiator;
    }



    public String getDefOil() {
        return defOil;
    }

    public String getOil() {
        return oil;
    }

    public void setOil(String oil) {
        this.oil = oil.isEmpty() ? this.getDefOil() : oil;
    }



    public int getDefHeight() {
        return defHeight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height < 0 ? this.getDefHeight() : height;
    }




    public float getDefWeight() {
        return defWeight;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight < 0 ? this.getDefWeight() : weight ;
    }



    public int getDefTrunkCapacity() {
        return defTrunkCapacity;
    }

    public int getTrunkCapacity() {
        return trunkCapacity;
    }

    public void setTrunkCapacity(int trunkCapacity) {
        this.trunkCapacity = trunkCapacity < 0 ? this.getDefTrunkCapacity() : trunkCapacity;
    }



    public int getDefMaxSpeed() {
        return defMaxSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed < 0 ? this.getDefMaxSpeed() : maxSpeed;
    }



    public int getDefSeats() {
        return defSeats;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats < 0 ? this.getDefSeats() : seats;
    }



    public Transport(String model) {
        this.setModel(model);
    }

    public Transport(String model, float weight, int maxSpeed, int seats) {
        this.setModel(model);
        this.setWeight(weight);
        this.setMaxSpeed(maxSpeed);
        this.setSeats(seats);
    }

    public Transport(String model, float weight, int maxSpeed, int seats, int trunkCapacity, Engine engine) {
        this.setModel(model);
        this.setWeight(weight);
        this.setMaxSpeed(maxSpeed);
        this.setSeats(seats);
        this.setTrunkCapacity(trunkCapacity);
        this.setEngine(engine);
    }

    public Transport(String model, float weight, int maxSpeed, int seats, Engine engine, Battery battery, Radiator radiator) {
        this.setModel(model);
        this.setWeight(weight);
        this.setMaxSpeed(maxSpeed);
        this.setSeats(seats);
        this.setEngine(engine);
        this.setBattery(battery);
        this.setRadiator(radiator);
    }

    public final String getVehicleCategory(float weight) {
        if (weight <= 400) {
            return "Category A : bike";
        } else if (weight > 400 & weight < 3500) {
            return "Category B: light weight car";
        } else return "Category C or D: trunk, bus or minivan";
    }

}