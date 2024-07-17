import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;

public class Hw2SahanovichMain {

    private static final Logger LOGGER = LogManager.getLogger(Hw2SahanovichMain.class);

    public static void main(String[] args) {
        int dayOfWeek = 1;
        int time = 13;
        int timeSlot = 3;
        int orderId = 1;
        int clientNumber = 1;
        int endDate = 2024;
        int ind = 0;
        boolean isChinese = false;
        String[] zodiacSignsCh = {"Rat", "Ox", "Tiger", "Rabbit", "Dragon", "Snake", "Horse", "Sheep", "Monkey",
                "Rooster", "Dog", "Pig"};
        String[] zodiacSignsEu = {"Capricornus", "Aquarius", "Pisces", "Aries", "Taurus", "Gemini", "Cancer", "Leo",
                "Virgo", "Libra", "Scorpius", "Sagittarius"};


        if (dayOfWeek == 1) {
            LOGGER.info("Today is Mon: you have a Java lesson.");
        } else if (dayOfWeek == 3) {
            LOGGER.info("Today is Wed: you have a Java lesson.");
        } else {
            LOGGER.info("Today is not Mon or Wed: you have nothing scheduled.");
        }

        do {
            LOGGER.info(orderId);
            orderId++;
        } while (orderId <= 100);

        while (clientNumber < 15) {
            LOGGER.info("You are our " + clientNumber + " client");
            clientNumber++;
        }

        for (int startDate = 1936; startDate <= endDate; startDate++) {
            if (ind >= 12) {
                ind = 0;
            }
            LOGGER.info(startDate + ": you are " + zodiacSignsCh[ind]);
            ind++;
        }

        if (isChinese) {
            LOGGER.info(Arrays.toString(zodiacSignsCh));
        } else {
            LOGGER.info(Arrays.toString(zodiacSignsEu));
        }

        if (dayOfWeek == 1 | dayOfWeek == 3) {
            if (time >= 9 & time <= 12) {
                LOGGER.info("You are busy");
            }
        }

        if (isChinese) {
            LOGGER.info("You are Asian");
        }

        switch (timeSlot) {
            case 1:
                LOGGER.info("TRX");
            case 2:
                LOGGER.info("STRETCH");
            case 3:
                LOGGER.info("LOWER BODY");
            case 4:
                LOGGER.info("50+");
            case 5:
                LOGGER.info("PILATES");
            case 6:
                LOGGER.info("FULL BODY");
            case 7:
                LOGGER.info("DANCE MIX");
            case 8:
                LOGGER.info("CARDIO");
                break;
            default:
                LOGGER.info("We are closed");
        }

        for (int i = 5; i >= 5 & i <= 7; i++ ) {
            LOGGER.info(zodiacSignsEu[i] + " is a summer sign");
        }

    }
}