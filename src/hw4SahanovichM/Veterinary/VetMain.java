package hw4SahanovichM.Veterinary;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class VetMain {

    private static final Logger LOGGER = LogManager.getLogger(VetMain.class);

    public static void main(String[] args) {
        DogVactination.dogName = "Jessi"; //"Jessi" "Juja"
        DogVactination.ownerLastName = "Sahanovich"; //"Sahanovich"  "Petrov"
        DogVactination.ownerFirstName = "Maria"; //"Maria"   "Paul"

        boolean ifClient = DogVactination.ifDogInSystem(DogVactination.dogName, DogVactination.ownerFirstName, DogVactination.ownerLastName);
        String lastVactinationDt = DogVactination.getLastVactinationDt(ifClient, DogVactination.dogName, DogVactination.ownerFirstName, DogVactination.ownerLastName);
        String nextVactinationDt = DogVactination.nextDateOfVactination(ifClient, lastVactinationDt);
        String notify = DogVactination.notifyNextDateOfVactination(DogVactination.dogName, DogVactination.ownerFirstName,  DogVactination.ownerLastName, nextVactinationDt);
        LOGGER.info(notify);

    }
}
