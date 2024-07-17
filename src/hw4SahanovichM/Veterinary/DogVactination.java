package hw4SahanovichM.Veterinary;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DogVactination {

    private static final Logger LOGGER = LogManager.getLogger(DogVactination.class);

    static String dogName;
    static String ownerLastName;
    static String ownerFirstName;
    static String lastVactinationDt;
    static String infoMsg = "Don't have a dog with such name in our system";
    static boolean ifClient = false;
    static String notifyMsg = "";


    public static boolean ifDogInSystem (String dogName, String ownerFirstName, String ownerLastName) {
        for (int i = 0; i < VetClients.dogsInfo.length; i++) {
            LOGGER.debug("Debug: ifDogInSystem : i = " + i);
            if (VetClients.dogsInfo[i][0].equals(dogName) & VetClients.dogsInfo[i][1].equals(ownerFirstName) & VetClients.dogsInfo[i][2].equals(ownerLastName)) {
                LOGGER.debug("Debug: ifDogInSystem : \ndogName = " + VetClients.dogsInfo[i][0] + " = " + dogName +
                        "\nownerFirstName = " + VetClients.dogsInfo[i][1] + " = " + ownerFirstName +
                        "\nownerLastName = " + VetClients.dogsInfo[i][2] + " = " + ownerLastName);
                ifClient = true;
                break;
            }
        }
        return ifClient;
    }


    public static String getLastVactinationDt (boolean ifClient, String dogName,  String ownerFirstName, String ownerLastName) {
        if (ifClient) {
            LOGGER.debug("Debug: getLastVactinationDt : ifClient = " + ifClient);
            for (int i = 0; i < VetClients.dogsInfo.length; i++) {
                LOGGER.debug("Debug: getLastVactinationDt : i = " + i);
                if (VetClients.dogsInfo[i][0].equals(dogName) & VetClients.dogsInfo[i][1].equals(ownerFirstName) & VetClients.dogsInfo[i][2].equals(ownerLastName)) {
                    LOGGER.debug("Debug: getLastVactinationDt : \ndogName = " + VetClients.dogsInfo[i][0] + " = " + dogName +
                            "\nownerFirstName = " + VetClients.dogsInfo[i][1] + " = " + ownerFirstName +
                            "\nownerLastName = " + VetClients.dogsInfo[i][2] + " = " + ownerLastName);
                    lastVactinationDt = VetClients.dogsInfo[i][3];
                    break;
                }
            }
            return lastVactinationDt;
        }
        return infoMsg;
    }


    public static String nextDateOfVactination (boolean ifClient, String lastVactinationDt) {
        if (ifClient) {
            LOGGER.debug("Debug: nextDateOfVactination : ifClient = " + ifClient);
            String ddmm = lastVactinationDt.substring(0, 6);
            String yearStr = lastVactinationDt.substring(6);
            int year = Integer.parseInt(yearStr) + 1;
            LOGGER.debug("Debug: nextDateOfVactination : ddmm, yearStr, year -> " + ddmm + ", " + yearStr + ", " + year);
            return ddmm.concat(String.valueOf(year));
        }
        return infoMsg;
    }

    public static String notifyNextDateOfVactination(String dogName, String ownerFirstName, String ownerLastName, String nextVactinationDt) {

        LOGGER.debug("Debug: getLastVactinationDt : ifClient = " + ifClient);

        if (ifClient == false){
            return infoMsg;
        } else {
            int dd = Integer.parseInt(nextVactinationDt.substring(0, 2));
            int mm = Integer.parseInt(nextVactinationDt.substring(3, 5));
            int year = Integer.parseInt(nextVactinationDt.substring(6));
            LOGGER.debug("Debug: notifyNextDateOfVactinationn : dd, mm, year -> " + dd + ", " + mm + ", " + year);
            if (year == CurrentDate.getcurrYear() & mm == CurrentDate.getcurrMonth() + 1 & dd - CurrentDate.getcurrDay() > 0) {
                LOGGER.debug("Debug: notifyNextDateOfVactinationn : currYear -> " + CurrentDate.getcurrYear() +
                        "\ncurrMonth -> " + CurrentDate.getcurrMonth() +
                        "\ncurrDay() -> " + CurrentDate.getcurrDay());
                notifyMsg = "Dear " + String.join(" ", ownerFirstName, ownerLastName) +
                        "! We would like to remind you " + dogName + " needs to be vaccinated before "
                        + nextVactinationDt + ".";
            } else notifyMsg = "Dear " + String.join(" ", ownerFirstName, ownerLastName) +
                    "! Perhaps " + dogName + " missed the day of vaccination. It was scheduled for " +
                    nextVactinationDt + ". Do you need the help of our assistant to shedule a visit?";
        }
        return notifyMsg;
    }
}
