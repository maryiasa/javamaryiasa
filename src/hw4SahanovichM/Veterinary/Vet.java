package hw4SahanovichM.Veterinary;

public class Vet {
    public static void main(String[] args) {
        DogVactination.dogName = "Jessi"; //"Jessi" "Juja"
        DogVactination.ownerLastName = "Sahanovich"; //"Sahanovich"  "Petrov"
        DogVactination.ownerFirstName = "Maria"; //"Maria"   "Paul"

        boolean ifClient = DogVactination.ifDogInSystem(DogVactination.dogName, DogVactination.ownerFirstName, DogVactination.ownerLastName);
        String lastVactinationDt = DogVactination.getLastVactinationDt(ifClient, DogVactination.dogName, DogVactination.ownerFirstName, DogVactination.ownerLastName);
        String nextVactinationDt = DogVactination.nextDateOfVactination(ifClient, lastVactinationDt);
        String notify = DogVactination.notifyNextDateOfVactination(DogVactination.dogName, DogVactination.ownerFirstName,  DogVactination.ownerLastName, nextVactinationDt);
        System.out.println(notify);
    }
}
