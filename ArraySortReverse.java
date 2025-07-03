//SORT, REVERSE, and CLEAR elements in a string array

import java.util.Arrays;
import java.util.Collections;

public class ArraySortReverse {
    public static void main(String[] args) {
        // Initial array of pallet IDs
        String[] pallets = { "B14", "A11", "B12", "A13" };

        // Sort the array in ascending order
        Arrays.sort(pallets); // Sorts the array alphabetically
        System.out.println("Sorted array.....");
        for (String pallet : pallets) {
            System.out.println("-- " + pallet);
        }

        // Reverse the sorted array
        Collections.reverse(Arrays.asList(pallets)/*
                                                   * Converts the array into a list so that it can be reversed using
                                                   * Collections.reverse.
                                                   */); // Reverses the order of the sorted list
        System.out.println("Reversed array.....");
        for (String pallet : pallets) {
            System.out.println("-- " + pallet);
        }
    }
}