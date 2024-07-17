package hw4SahanovichM;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.Arrays;


public class StringMethods {

    private static final Logger LOGGER = LogManager.getLogger(StringMethods.class);
    
    public static void main(String[] args) {
        
        String firstName = "Maria";
        String lastName = "Sahanovich";
        String lastName2 = "sahanovich";
        String jobName = "MPBLM257";

        String fullName = firstName + " " + lastName;
        String client = firstName.concat(" ").concat(lastName);

        char[] charArray = lastName.toCharArray();

        LOGGER.info(charArray);
       
        LOGGER.info(fullName);
        LOGGER.info(client);
        LOGGER.info(firstName.length());
        LOGGER.info(lastName.charAt(6));
        LOGGER.info(lastName.equals(lastName2));
        LOGGER.info(lastName.equalsIgnoreCase(lastName2));
        LOGGER.info(jobName.toLowerCase());
        LOGGER.info(firstName.toUpperCase());
        LOGGER.info(lastName.indexOf("ha"));
        LOGGER.info(jobName.startsWith("MP"));
        LOGGER.info(jobName.endsWith("7"));
        LOGGER.info(firstName.replace("i", "yi"));
        LOGGER.info(jobName.substring(2));
        LOGGER.info(String.join(" ", firstName, lastName));
        LOGGER.info(Arrays.toString(client.split(" ")));

        //home task:
        String a = "asadbut"; // "asadbut", "leetcode"
        String b = "sad"; //"sad", "leeto"
        if (a.contains(b)){
            LOGGER.info(a.indexOf(b));
        } else LOGGER.info(-1);
    }
}