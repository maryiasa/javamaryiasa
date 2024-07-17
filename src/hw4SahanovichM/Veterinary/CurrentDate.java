package hw4SahanovichM.Veterinary;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.time.LocalDate;



public class CurrentDate {

    private static final Logger LOGGER = LogManager.getLogger(CurrentDate.class);

        static LocalDate today = java.time.LocalDate.now();

        public static int getcurrYear() {
            LOGGER.debug("Debug: currYear = " + today.getYear());
            return today.getYear();
        }
        public static int getcurrMonth() {
            LOGGER.debug("Debug: currMonth = " + today.getMonthValue());
            return today.getMonthValue();
        }
        public static int getcurrDay() {
            LOGGER.debug("Debug: currDay = " + today.getMonthValue());
            return today.getMonthValue();
        }
}
