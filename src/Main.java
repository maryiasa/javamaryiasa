import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {

    private static final Logger LOGGER = LogManager.getLogger(Main.class);

    public static void main(String[] args) {

        LOGGER.debug("Debug");
        LOGGER.info("Info");
        LOGGER.warn("Warn");
        LOGGER.error("My error");

        String dog = "ben";
        String owner = "Petrov";

        boolean ifClient = false;

        String [][] dogsInfo = {{"Jessi", "Maria", "Sahanovich", "29/07/2023"}, {"Lesli", "Alex", "Sidorov", "07/07/2023"}, {"Juja", "Paul", "Petrov", "09/09/2023"}};


            for (int i = 0; i < dogsInfo.length; i++) {
                if (dogsInfo[i][0].equals(dog) & dogsInfo[i][2].equals(owner)) {
                    ifClient = true;
                    LOGGER.info(dogsInfo[i][0]);
                    LOGGER.info(dogsInfo[i][2]);
                    LOGGER.info(ifClient);
                    break;
                } else ifClient = false;
                LOGGER.info(ifClient);
        }
    }
}