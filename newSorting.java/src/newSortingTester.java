import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class newSortingTester {



    /*
     * This test was done to simply test the method with any random array with no particular restrictions
     * and gave it a size of 3 to simply see if it would actually split the array correctly.
     * Input: A = {7,2,4,6,3,5,1}, size = 3
     * Expected output: {1,2,3,4,5,6,7}
     * Output: {1,2,3,4,5,6,7}
     * Test passed, meaning that the method does split the array as intended, the quickSort method works properly, and the mergeSortedHalves method merges arrays properly.
     */
    @Test
    public void newSortingTester1(){
        int[] A = {7,2,4,6,3,5,1};
        newSorting ns = new newSorting();
        ns.newSorting(A, 3);
        assertArrayEquals(A, new int[] {1,2,3,4,5,6,7});
    }



    /*
     * This test was done to test if the method works properly when there are repeated values in the array.
     * Input:  B = {1,5,4,1,5,4}, size = 2
     * Expected output: {1,1,4,4,5,5}
     * Output: {1,1,4,4,5,5}
     * Test passed, meaning that the method and its helper methods work properly to handle repeated number in the given array.
     */
    @Test
    public void newSortingTester2(){
        int[] B = {1,5,4,1,5,4};
        newSorting ns = new newSorting();
        ns.newSorting(B, 2);
        assertArrayEquals(B, new int[] {1,1,4,4,5,5});
    }



    /*
     * This test was done to test if the method works properly when the given size is larger than the given array.
     * Input:  C = {1,2,3,4,5,6,7,8,9,10}, size = 11
     * Expected output: {1,2,3,4,5,6,7,8,9,10}
     * Output: {1,2,3,4,5,6,7,8,9,10}
     * Test passed, meaning that the method and its helper methods work properly to handle an array that is smaller than the size,
     * meaning that the quickSort method was able to sort the whole array.
     */
    @Test
    public void newSortingTester3(){
        int[] C = {1,2,3,4,5,6,7,8,9,10};
        newSorting ns = new newSorting();
        ns.newSorting(C, 11);
        assertArrayEquals(C, new int[] {1,2,3,4,5,6,7,8,9,10});
    }



    /*
     * This test was done to test if the method works properly when the given array is empty.
     * Input:  D = {}, size = 4
     * Expected output: {}
     * Output: {}
     * Test passed, meaning that the method does not output any errors when given an empty array and outputs the same array, still empty.
     */
    @Test
    public void newSortingTester4(){
        int[] D = {};
        newSorting ns = new newSorting();
        ns.newSorting(D, 4);
        assertArrayEquals(D, new int[] {});
    }



    /*
     * This test was done to test if the method works properly when the given size is 1 and the method would keep spliting the array and merge them back when their length is only 1.
     * Input:  E = {7,5,3,1,2,4,6,8}, size = 1
     * Expected output: {1,2,3,4,5,6,7,8}
     * Output: {1,2,3,4,5,6,7,8}
     * Test passed, meaning that the method is capable of splitting the array until the size is only 1 and merging them back in the correct order.
     */
    @Test
    public void newSortingTester5(){
        int[] E = {7,5,3,1,2,4,6,8};
        newSorting ns = new newSorting();
        ns.newSorting(E, 1);
        assertArrayEquals(E, new int[] {1,2,3,4,5,6,7,8});
    }
}


