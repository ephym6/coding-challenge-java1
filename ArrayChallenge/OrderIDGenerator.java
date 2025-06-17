/*
  The following code creates five random OrderIDs to test the fraud detection process.OrderIDs
  consist of a letter from A to E, and a three digit number. Ex. A123.
*/

import java.util.Random;

public class OrderIDGenerator {
    public static void main(String[] args) {
        Random random = new Random();//Creates a new instance of Java’s built-in Random class to generate random numbers
        String[] orderIds = new String[5]; //Declares an array to hold five OrderIDs.

        for (int i = 0; i < orderIds.length; i++) { //A standard for loop that will run five times, once for each index in the array
            //Generate a random uppercase letter between A (65) and E (69)
            //(char) casts the resulting int to a character.
            char prefix = (char) ('A' + random.nextInt(5)); //random.nextInt(5) generates a number from 0 to 4.

            //Generate a random number from 1 to 999 and format it with leading zeros
            int number = random.nextInt(999) + 1; //random.nextInt(999) gives 0 to 998 → +1 shifts it to 1–999.
            String suffix = String.format("%03d", number); /* Formats the number as a three-digit string, adding leading zeros if necessary
                                                              eg 7 becomes "007", 42 becomes "042". */

            //Combine prefix and suffix to form the OrderID
            orderIds[i] = prefix + suffix;
        }

        // Print all generated OrderIDs
        for (String orderId : orderIds) { //A for-each loop that goes through each element in the array
            System.out.println(orderId); //Prints each generated OrderID to the console
        }
    }
}