package hw7SahanovichM.main;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import hw7SahanovichM.interfaces.IControl;
import hw7SahanovichM.interfaces.IFillUp;
import hw7SahanovichM.interfaces.IService;
import hw7SahanovichM.model.transport.*;

public class VehiclesMain {

    private static final Logger LOGGER = LogManager.getLogger(VehiclesMain.class);
    
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

        LOGGER.info(genesis.equals(bmw));
        LOGGER.info(genesis.equals(buick));

        LOGGER.info(genesis.hashCode() == bmw.hashCode());

        //Transport info
        LOGGER.info("Genesis info:");
        LOGGER.info(genesis);
        LOGGER.info(genesis.getCarCategory(genesis.getWeight()));
        LOGGER.info(Car.getRentalCost(genesis));
        LOGGER.info("Car Service: \nFill up the car: ");
        LOGGER.info(genesisFillUp.openTank());
        LOGGER.info("Filled up with: " );
        genesisFillUp.fillUp(genesisEngine);
        LOGGER.info(genesisService.wheelReplacement());
        LOGGER.info("Machine oil was used: ");
        genesisService.oilChange();
        LOGGER.info("Car control:");
        LOGGER.info(genesisControl.turnOffIgnition());
        LOGGER.info(genesisControl.turnOnIgnition());
        genesisControl.hitTheBrakes();
        genesisControl.turnOffLeftTurnSignal();
        genesisControl.turnOnLeftTurnSignal();

        LOGGER.info("\nBMW info:\n" + bmw);

        //Bus
        LOGGER.info("\nBuick info:");
        LOGGER.info(buick);
        LOGGER.info(buick.getBusCategory(buick.getWeight()));
        LOGGER.info("Bus Service: \nFill up the bus: ");
        LOGGER.info(buickFillUp.openTank());
        LOGGER.info("Filled up with: " );
        buickFillUp.fillUp(buickEngine);
        LOGGER.info(buickService.wheelReplacement());
        LOGGER.info("Machine oil was used: ");
        buickService.oilChange();
        LOGGER.info("Bus control:");
        LOGGER.info(buickControl.turnOnIgnition());
        LOGGER.info(buickControl.turnOffIgnition());
        buickControl.hitTheBrakes();
        buickControl.turnOnLeftTurnSignal();
        buickControl.turnOffLeftTurnSignal();
    }
}
