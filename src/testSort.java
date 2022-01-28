import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

public class testSort {

    private sort sort;
    ArrayList<Integer> unsortedArray;
    ArrayList<Integer> sortedArray;
    Random rand = new Random();


    @BeforeEach
    public void setUp() throws Exception {
        sort = new sort();
        sortedArray = new ArrayList<Integer>();
        unsortedArray = new ArrayList<Integer>();
    }

//    @RepeatedTest(5)
    @Test
    @DisplayName("Sorting a blank list")
    public void sortBlankList() {
        Collections.sort(sortedArray);
        assertEquals(sortedArray, sort.sortArraylist(unsortedArray),
                "Sorting a blank list didn't work");
    }

    @Test
    @DisplayName("Sorting Just One Number")
    public void sortOneNumber() {
        unsortedArray.add(3);
        sortedArray.add(3);
        Collections.sort(sortedArray);
        assertEquals(sortedArray, sort.sortArraylist(unsortedArray),
                "Sorting Just One Number didn't work");
    }
    @Test
    @DisplayName("Sorting Two Numbers")
    public void sortTwoNumbers() {
        unsortedArray.add(3);
        unsortedArray.add(2);
        sortedArray.add(3);
        sortedArray.add(2);
        Collections.sort(sortedArray);
        assertEquals(sortedArray, sort.sortArraylist(unsortedArray),
                "Sorting Two Numbers didn't work");
    }
    @Test
    @DisplayName("Sorting Numbers list  initialized with random size")
    public void sortNumbersRandomLength() {
        int limit = rand.nextInt(100);
        for (int i = 0; i < limit; i++){
            int randInt = rand.nextInt();
            unsortedArray.add(randInt);
            sortedArray.add(randInt);
        }
        Collections.sort(sortedArray);
        assertEquals(sortedArray, sort.sortArraylist(unsortedArray),
                "Sorting Numbers list  initialized with random size didn't work");
    }
    @Test
    @DisplayName("Sorting Random Numbers")
    public void sortRandomNumbers() {
        for (int i = 0; i < 10; i++){
            int randInt = rand.nextInt();
            unsortedArray.add(randInt);
            sortedArray.add(randInt);
        }
        Collections.sort(sortedArray);
        assertEquals(sortedArray, sort.sortArraylist(unsortedArray),
                "Sorting Random Numbers didn't work");
    }
    @Test
    @DisplayName("Sorting Ascending Numbers")
    public void sortAscendingNumbers() {
        for (int i = 0; i < 10; i++){
            unsortedArray.add(i);
            sortedArray.add(i);
        }
        Collections.sort(sortedArray);
        assertEquals(sortedArray, sort.sortArraylist(unsortedArray),
                "Sorting Ascending Numbers didn't work");
    }
    @Test
    @DisplayName("Sorting Descending Numbers")
    public void sortDescendingNumbers() {
        for (int i = 9; i >= 0; i--){
            unsortedArray.add(i);
            sortedArray.add(i);
        }
        Collections.sort(sortedArray);
        assertEquals(sortedArray, sort.sortArraylist(unsortedArray),
                "Sorting Descending Numbers didn't work");
    }
    @Test
    @DisplayName("Sorting Equal Numbers")
    public void sortEqualNumbers() {
        for (int i = 0; i < 10; i++){
            unsortedArray.add(5);
            sortedArray.add(5);
        }
        Collections.sort(sortedArray);
        assertEquals(sortedArray, sort.sortArraylist(unsortedArray),
                "Sorting Equal Numbers didn't work");
    }
}