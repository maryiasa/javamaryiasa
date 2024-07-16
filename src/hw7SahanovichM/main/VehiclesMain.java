package hw7SahanovichM.main;

import hw7SahanovichM.interfaces.IControl;
import hw7SahanovichM.interfaces.IFillUp;
import hw7SahanovichM.interfaces.IService;
import hw7SahanovichM.model.transport.*;

public class VehiclesMain {
    public static void main(String[] args) {
        Engine genesisEngine = new Engine("V6 3.5 T-GDi");
        Engine bmwEngine = new Engine("4.4 L V8");
        Engine buickEngine = new Engine("LE5 2.4 L I4");

        Battery genesisBattery = new Battery("GenesisBattery");
        Battery bmwBattery = new Battery("BMWBattery");

        Radiator genesisR = new Radiator("GenesisRadiator");
        Radiator bmwR = new Radiator("BMWRadiator");

        Car genesis = new Car("Genesis GV80", 2375f, 270, 4, genesisEngine, genesisBattery, genesisR);
        Car bmw = new Car("",  -100, -270, -4, bmwEngine, bmwBattery, bmwR);
        Bus buick = new Bus("Buick GL8 Century", 3700f, 250, 8, 628, buickEngine);

        IFillUp genesisFillUp = new Car("Genesis G80", 2375f, 270, 4, genesisEngine, genesisBattery, genesisR);
        IService genesisService = new Car("Genesis G80", 2375f, 270, 4, genesisEngine, genesisBattery, genesisR);
        IControl genesisControl = new Car("Genesis G80", 2375f, 270, 4, genesisEngine, genesisBattery, genesisR);

        IFillUp buickFillUp = new Bus("Buick GL8 Century", 3700f, 250, 8, 628, buickEngine);
        IService buickService = new Bus("Buick GL8 Century", 3700f, 250, 8, 628, buickEngine);
        IControl buickControl = new Bus("Buick GL8 Century", 3700f, 250, 8, 628, buickEngine);

        System.out.println(genesis.equals(bmw));
        System.out.println(genesis.equals(buick));

        System.out.println(genesis.hashCode() == bmw.hashCode());

        //Transport info
        System.out.println("Genesis info:");
        System.out.println(genesis);
        System.out.println(genesis.getCarCategory(genesis.getWeight()));
        System.out.println(Car.getRentalCost(genesis));
        System.out.println("Car Service: \nFill up the car: ");
        System.out.println(genesisFillUp.openTank());
        System.out.println("Filled up with: " );
        genesisFillUp.fillUp(genesisEngine);
        System.out.println(genesisService.wheelReplacement());
        System.out.println("Machine oil was used: ");
        genesisService.oilChange();
        System.out.println("Car control:");
        System.out.println(genesisControl.turnOffIgnition());
        System.out.println(genesisControl.turnOnIgnition());
        genesisControl.hitTheBrakes();
        genesisControl.turnOffLeftTurnSignal();
        genesisControl.turnOnLeftTurnSignal();

        System.out.println("\nBMW info:\n" + bmw);

        //Bus
        System.out.println("\nBuick info:");
        System.out.println(buick);
        System.out.println(buick.getBusCategory(buick.getWeight()));
        System.out.println("Bus Service: \nFill up the bus: ");
        System.out.println(buickFillUp.openTank());
        System.out.println("Filled up with: " );
        buickFillUp.fillUp(buickEngine);
        System.out.println(buickService.wheelReplacement());
        System.out.println("Machine oil was used: ");
        buickService.oilChange();
        System.out.println("Bus control:");
        System.out.println(buickControl.turnOnIgnition());
        System.out.println(buickControl.turnOffIgnition());
        buickControl.hitTheBrakes();
        buickControl.turnOnLeftTurnSignal();
        buickControl.turnOffLeftTurnSignal();
    }
}
