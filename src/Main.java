
public class Main {
    public static void main(String[] args) {

        String dog = "ben";
        String owner = "Petrov";
        //String ownerFirstName = "Alex";
        boolean ifClient = false;

        String [][] dogsInfo = {{"Jessi", "Maria", "Sahanovich", "29/07/2023"}, {"Lesli", "Alex", "Sidorov", "07/07/2023"}, {"Juja", "Paul", "Petrov", "09/09/2023"}};




            for (int i = 0; i < dogsInfo.length; i++) {
                if (dogsInfo[i][0].equals(dog) & dogsInfo[i][2].equals(owner)) {
                    ifClient = true;
                    System.out.println(dogsInfo[i][0]);
                    System.out.println(dogsInfo[i][2]);
                    System.out.println(ifClient);
                    break;
                } else ifClient = false;
                System.out.println(ifClient);
        }
    }
}