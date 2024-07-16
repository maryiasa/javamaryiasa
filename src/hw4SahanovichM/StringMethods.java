package hw4SahanovichM;


import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        String firstName = "Maria";
        String lastName = "Sahanovich";
        String lastName2 = "sahanovich";
        String jobName = "MPBLM257";

        String fullName = firstName + " " + lastName;
        String client = firstName.concat(" ").concat(lastName);

        char[] charArray = lastName.toCharArray();

        System.out.println(charArray);
        System.out.println(fullName);
        System.out.println(client);
        System.out.println(firstName.length());
        System.out.println(lastName.charAt(6));
        System.out.println(lastName.equals(lastName2));
        System.out.println(lastName.equalsIgnoreCase(lastName2));
        System.out.println(jobName.toLowerCase());
        System.out.println(firstName.toUpperCase());
        System.out.println(lastName.indexOf("ha"));
        System.out.println(jobName.startsWith("MP"));
        System.out.println(jobName.endsWith("7"));
        System.out.println(firstName.replace("i", "yi"));
        System.out.println(jobName.substring(2));
        System.out.println(String.join(" ", firstName, lastName));
        System.out.println(Arrays.toString(client.split(" ")));

        //home task:
        String a = "asadbut"; // "asadbut", "leetcode"
        String b = "sad"; //"sad", "leeto"
        if (a.contains(b)){
            System.out.println(a.indexOf(b));
        } else System.out.println(-1);
    }
}