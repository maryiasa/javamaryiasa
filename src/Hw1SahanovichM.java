public class Hw1SahanovichM {
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


        System.out.println("Is there any items in the client's bin? " + (quantity != 0) + "\n");
        System.out.println("Is our client? " + (lastName == "Saganovich") + "\n");
        System.out.println("Is our client? " + (firstName.concat(lastName) == "Maria Saganovich") + "\n"); // Why is it false?

        System.out.println("Client's name: " + firstName.concat(lastName) + "\n");

        itemNum++;
        System.out.println("Item: " + itemNum);
        System.out.println("Name: " + itemName1);
        System.out.println("Quantity: " + itemQty1);
        System.out.println("Price: " + itemPrc1 + "\n");

        itemNum += itemNum;
        System.out.println("Item: " + itemNum);
        System.out.println("Name: " + itemName2);
        System.out.println("Quantity: " + itemQty2);
        System.out.println("Price: " + itemPrc2 + "\n");

        silverDiscount /= 100;

        priceInclDiscount = quantity > 50 & quantity <= 100 ? price - (price * silverDiscount) : price;
        totalPrice = price < freeDelivery ? priceInclDiscount + deliveryCost : priceInclDiscount;
        localPrice = totalPrice;
        localPrice *= usdCurrencyRt;

        System.out.println("Total Quantity: " + quantity);
        System.out.println("Price: " + price + ccyCodeUsd);
        System.out.println("Price with your discount: " + priceInclDiscount  + ccyCodeUsd);
        System.out.println("Total Price including delivery: " + totalPrice  + ccyCodeUsd);
        System.out.println("Converted to local currency: " + localPrice  + ccyCodeP);
        System.out.println();
        System.out.println("Could customer get one more item for free? " + (itemQty2 >= 2 & itemName2 == "K. Sierra. Head first Java") + "\n");
        System.out.println("Amount of gift boxes: " + giftBoxAmount);
        System.out.println("Should customer get a gift box? " + ((dayOfWeek == "Thursday") & (day % 2 == 0)));
        System.out.println("Remaining number of gift boxes: " + --giftBoxAmount + "\n");

        int a = 17;
        int b = 5;
        double c;
        c = a % b;

        System.out.println(a % b);
        System.out.println(c);
        System.out.println(17 % 5);
        b %= 3;
        System.out.println(b);
        b -=10;
        System.out.println(b);

        //System.out.printf("%.2f", priceInclDiscount);
        //System.out.printf("%s %s", firstName, lastName);
        //System.out.println("Client's name: " + firstName + lastName);
    }
}
