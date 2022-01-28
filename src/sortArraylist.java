// Java code to sort an array of integers
// with the help of single loop

import org.junit.Test;

import java.util.*;
class sort {

    // Function for Sorting the array
    // using a single loop
    public static ArrayList<Integer> sortArraylist(ArrayList<Integer> arr)
    {

        // Finding the length of array 'arr'
        int length = arr.size();

        // Sorting using a single loop
        for (int j = 0; j < length - 1; j++) {

            // Checking the condition for two
            // simultaneous elements of the array
            if (arr.get(j) > arr.get(j + 1)) {

                // Swapping the elements.
                int temp = arr.get(j);
                arr.set(j, arr.get(j + 1));
                arr.set(j + 1, temp);

                // updating the value of j = -1
                // so after getting updated for j++
                // in the loop it becomes 0 and
                // the loop begins from the start.
                j = -1;
            }
        }

        return arr;
    }

    // Declaring main method
    public static void main(String args[])
    {
        int limit = 2;
        ArrayList<Integer> unsortedArray = new ArrayList<Integer>();
        ArrayList<Integer> sortedArray = new ArrayList<Integer>();

        Random rand = new Random();
        for (int i = 0; i < limit; i++){
            unsortedArray.add(rand.nextInt(1000));
        }

        // Printing the original Array.
        System.out.println("Original array: " + Arrays.toString(unsortedArray.toArray()));


        // Sorting the array using a single loop
        sortedArray = sortArraylist(unsortedArray);

        // Printing the sorted array.
        System.out.println("Sorted array: " + Arrays.toString(sortedArray.toArray()));
    }
}
