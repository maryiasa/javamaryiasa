import java.util.Arrays;

public class Hw2SahanovichM {
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
            System.out.println("Today is Mon: you have a Java lesson.");
        } else if (dayOfWeek == 3) {
            System.out.println("Today is Wed: you have a Java lesson.");
        } else {
            System.out.println("Today is not Mon or Wed: you have nothing scheduled.");
        }

        do {
            System.out.println(orderId);
            orderId++;
        } while (orderId <= 100);

        while (clientNumber < 15) {
            System.out.println("You are our " + clientNumber + " client");
            clientNumber++;
        }

        for (int startDate = 1936; startDate <= endDate; startDate++) {
            if (ind >= 12) {
                ind = 0;
            }
            System.out.println(startDate + ": you are " + zodiacSignsCh[ind]);
            ind++;
        }

        if (isChinese) {
            System.out.println(Arrays.toString(zodiacSignsCh));
        } else {
            System.out.println(Arrays.toString(zodiacSignsEu));
        }

        if (dayOfWeek == 1 | dayOfWeek == 3) {
            if (time >= 9 & time <= 12) {
                System.out.println("You are busy");
            }
        }

        if (isChinese) {
            System.out.println("You are Asian");
        }

        switch (timeSlot) {
            case 1:
                System.out.println("TRX");
            case 2:
                System.out.println("STRETCH");
            case 3:
                System.out.println("LOWER BODY");
            case 4:
                System.out.println("50+");
            case 5:
                System.out.println("PILATES");
            case 6:
                System.out.println("FULL BODY");
            case 7:
                System.out.println("DANCE MIX");
            case 8:
                System.out.println("CARDIO");
                break;
            default:
                System.out.println("We are closed");
        }

        for (int i = 5; i >= 5 & i <= 7; i++ ) {
            System.out.println(zodiacSignsEu[i] + " is a summer sign");
        }

    }
}