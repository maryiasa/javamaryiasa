import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Hw1SahanovichMain {

    private static final Logger LOGGER = LogManager.getLogger(Hw1SahanovichMain.class);
    
    public static void main(String[] args) {

        String firstName, lastName;
        String ccyCodeP = "pln";
        String itemName1 = "H. Schildt. Java: The Complete Reference";
        String itemName2 = "K. Sierra. Head first Java";
        String dayOfWeek = "Thursday";
        char ccyCodeUsd = '\u0024';

        firstName = "Maria ";
        lastName = "Saganovich";

        int quantity;
        int day = 6;
        int itemNum = 0;
        int itemQty1 = 70;
        int itemQty2 = 2;
        int giftBoxAmount = 10000;
        float price;
        float priceInclDiscount;
        float localPrice;
        float totalPrice;
        float silverDiscount =  10.0f;
        float itemPrc1 = 450.99f;
        float itemPrc2 = 300.00f;
        float deliveryCost = 12.50f;
        float freeDelivery = 800.00f;

        float usdCurrencyRt = 3.8088f;

        quantity = itemQty1 + itemQty2;
        price = itemPrc1 + itemPrc2;


        LOGGER.info("Is there any items in the client's bin? " + (quantity != 0));
        LOGGER.info("Is our client? " + (lastName == "Saganovich"));
        LOGGER.info("Is our client? " + (firstName.concat(lastName) == "Maria Saganovich")); // Why is it false?
        LOGGER.info("Client's name: " + firstName.concat(lastName));

        itemNum++;
        LOGGER.info("Item: " + itemNum);
        LOGGER.info("Name: " + itemName1);
        LOGGER.info("Quantity: " + itemQty1);
        LOGGER.info("Price: " + itemPrc1);

        itemNum += itemNum;
        LOGGER.info("Item: " + itemNum);
        LOGGER.info("Name: " + itemName2);
        LOGGER.info("Quantity: " + itemQty2);
        LOGGER.info("Price: " + itemPrc2);

        silverDiscount /= 100;

        priceInclDiscount = quantity > 50 & quantity <= 100 ? price - (price * silverDiscount) : price;
        totalPrice = price < freeDelivery ? priceInclDiscount + deliveryCost : priceInclDiscount;
        localPrice = totalPrice;
        localPrice *= usdCurrencyRt;

        LOGGER.info("Total Quantity: " + quantity);
        LOGGER.info("Price: " + price + ccyCodeUsd);
        LOGGER.info("Price with your discount: " + priceInclDiscount  + ccyCodeUsd);
        LOGGER.info("Total Price including delivery: " + totalPrice  + ccyCodeUsd);
        LOGGER.info("Converted to local currency: " + localPrice  + ccyCodeP);
        LOGGER.info("Could customer get one more item for free? " + (itemQty2 >= 2 & itemName2 == "K. Sierra. Head first Java"));
        LOGGER.info("Amount of gift boxes: " + giftBoxAmount);
        LOGGER.info("Should customer get a gift box? " + ((dayOfWeek == "Thursday") & (day % 2 == 0)));
        LOGGER.info("Remaining number of gift boxes: " + --giftBoxAmount);

        int a = 17;
        int b = 5;
        double c;
        c = a % b;

        LOGGER.info(a % b);
        LOGGER.info(c);
        LOGGER.info(17 % 5);
        b %= 3;
        LOGGER.info(b);
        b -=10;
        LOGGER.info(b);

    }
}
