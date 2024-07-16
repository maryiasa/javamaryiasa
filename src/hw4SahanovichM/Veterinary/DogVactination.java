package hw4SahanovichM.Veterinary;

public class DogVactination {
    static String dogName;
    static String ownerLastName;
    static String ownerFirstName;
    static String lastVactinationDt;
    static String infoMsg = "Don't have a dog with such name in our system";
    static boolean ifClient = false;
    static String notifyMsg = "";


    public static boolean ifDogInSystem (String dogName, String ownerFirstName, String ownerLastName) {
        for (int i = 0; i < VetClients.dogsInfo.length; i++) {
            if (VetClients.dogsInfo[i][0].equals(dogName) & VetClients.dogsInfo[i][1].equals(ownerFirstName) & VetClients.dogsInfo[i][2].equals(ownerLastName)) {
                ifClient = true;
                break;
            }
        }
        return ifClient;
    }


    public static String getLastVactinationDt (boolean ifClient, String dogName,  String ownerFirstName, String ownerLastName) {
        if (ifClient ) {
            for (int i = 0; i < VetClients.dogsInfo.length; i++) {
                if (VetClients.dogsInfo[i][0].equals(dogName) & VetClients.dogsInfo[i][1].equals(ownerFirstName) & VetClients.dogsInfo[i][2].equals(ownerLastName)) {
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
            String ddmm = lastVactinationDt.substring(0, 6);
            String yearStr = lastVactinationDt.substring(6);
            int year = Integer.parseInt(yearStr) + 1;
            return ddmm.concat(String.valueOf(year));
        }
        return infoMsg;
    }

    public static String notifyNextDateOfVactination(String dogName, String ownerFirstName, String ownerLastName, String nextVactinationDt) {
        if (ifClient == false){
            return infoMsg;
        } else {
            int dd = Integer.parseInt(nextVactinationDt.substring(0, 2));
            int mm = Integer.parseInt(nextVactinationDt.substring(3, 5));
            int year = Integer.parseInt(nextVactinationDt.substring(6));
            if (year == CurrentDate.getcurrYear() & mm == CurrentDate.getcurrMonth() + 1 & dd - CurrentDate.getcurrDay() > 0) {
                notifyMsg = "Dear " + String.join(" ", ownerFirstName, ownerLastName) +
                        "! We would like to remind you " + dogName + " needs to be vaccinated before "
                        + nextVactinationDt + ".";
            } else notifyMsg = "Dear " + String.join(" ", ownerFirstName, ownerLastName) +
                    "! Perhaps " + dogName + " missed the day of vaccination. It was scheduled for " +
                    nextVactinationDt + " Do you need the help of our assistant to shedule a visit?";
        }
        return notifyMsg;
    }
}
