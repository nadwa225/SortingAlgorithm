import java.lang.reflect.Array;
import java.util.Arrays;

public class QuickSort implements SortingAlgorithm {
    @Override
    public int[] sorty(int[] input) {
        int[] newArray = Arrays.copyOf(input, input.length);
        sort(newArray, 0, newArray.length - 1);
        return newArray;
    }

    public void sort (int input[], int start, int end){
        if(start < end){
            int part = div(input, start, end);
            sort(input, start, part - 1);
            sort(input, part + 1, end);
        }
    }

    public int div(int input[], int start, int end){
        int pivot = input[end];  // starts the pivot value at the end
        int count = start - 1; // keeps track of the index with the smaller element
        for(int i = start; i < end; i++){
            if(input[i] <= pivot){
                count++;

                // swap the elements
                int swap = input[count];
                input[count] = input[i];
                input[i] = swap;


            }
        }
        int swap = input[count + 1];
        input[count + 1] = input[end]; // moves pivot to correct position
        input[end] = swap;
        return count + 1;
    }

    public static void main(String args[]) {
        int array[] = {23, 5, 6, 7, 8};
        QuickSort quick = new QuickSort();
        //System.out.println("Unsorted array" + Arrays.toString(array));

        int[] sortedArray = quick.sorty(array);

        System.out.println("Sorted array " + Arrays.toString(sortedArray));

        // shell.sorty(array);


    }
}

