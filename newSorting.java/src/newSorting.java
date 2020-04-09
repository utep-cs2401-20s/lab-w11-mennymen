public class newSorting {
    public void newSorting(int[] A, int size){
        //Base case
        if(A.length <= size)
            quickSort(A);

        //Split A into 2 halves
        else {
            int mid = A.length / 2;

            int[] LH = new int[mid];
            int[] RH = new int[A.length - mid];

            //Assign values to each half
            for (int i = 0; i < RH.length; i++) {
                RH[i] = A[i + mid];
                if (i < LH.length) {
                    LH[i] = A[i];
                }
            }

            //Recursive calls for each half and then merge the arrays
            newSorting(LH, size);
            newSorting(RH, size);
            mergeSortedHalves(A, LH, RH);
        }
    }

    private void mergeSortedHalves(int[] A, int[] L, int[] R){
        // i is for L's index, j is for R's index and k is for A's index
        int i = 0;
        int j = 0;
        int k = 0;

        //This while keeps going until we're done with both arrays
        while(i < L.length || j < R.length){
            //If we're done with L, just adds the remaining values of R
            if(i == L.length){
                A[k] = R[j];
                j++;
            }

            //If we're done with R, just adds the remaining values of L
            else if(j == R.length){
                A[k] = L[i];
                i++;
            }

            //Checks which value is smaller to add it to A
            else if(L[i] < R[j]) {
                A[k] = L[i];
                i++;
            }

            else{
                A[k] = R[j];
                j++;
            }
            k++;
        }
    }


    private void quickSort (int[] A){
        quickSortHelper(A, 0, A.length-1);
    }


    private void quickSortHelper(int[] A, int start, int end){
        //Base case
        if(start >= end)
            return;

        //Obtain pivot for quick sort through the partition helper method
        int pivot = partition(A, start, end);

        //Recursive call for each half
        quickSortHelper(A, start, pivot - 1);
        quickSortHelper(A, pivot, end);

    }

    //Helper method for quickSortHelper method
    private int partition(int[] array, int less, int more) {
        int pivot = array[less];

        //Follow the procedure of quick sort by having one half having values that are smaller than the pivot
        //and the other half having values that are larger than the pivot and swapping them when both do not meet their conditions
        while (less <= more) {
            while (array[less] < pivot){
                less++;
            }

            while (array[more] > pivot){
                more--;
            }

            if (less <= more) {
                int temp = array[less];
                array[less] = array[more];
                array[more] = temp;
                less++;
                more--;
            }
        }
        return less;
    }
}
