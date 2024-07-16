package hw4SahanovichM.Veterinary;

import java.time.LocalDate;

public class CurrentDate {
        static LocalDate today = java.time.LocalDate.now();

        public static int getcurrYear() {
            return today.getYear();
        }
        public static int getcurrMonth() {
            return today.getMonthValue();
        }
        public static int getcurrDay() {
            return today.getMonthValue();
        }
}
