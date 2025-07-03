public class ArrayChallenge {
    public static void main(String[] args) {
        //int[] myArray = {1, 2, 3, 4, 5};
        //System.out.println(myArray[0]);

        /* Declares an array of strings called orderIds.
           The array holds a list of order identifiers like "B123", "C234", etc.
         */
        String[] orderIds = {"B123", "C234", "A345", "C15", "B177", "G3003", "C235", "B179"};

        for (String item : orderIds) { //This is a for-each loop that goes through each element in the orderIds array.
            if (item.startsWith("B")) { //This checks if the current string (item) starts with the letter "B".
                                        //The startsWith() method returns true if the string begins with the specified prefix.
                System.out.println(item); //If the condition is true, this line prints the string to the console
            }
        }
    }
}