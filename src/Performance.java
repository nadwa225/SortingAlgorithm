import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Performance {
    public static void main(String args[]) {
        int[] sizes = {100, 500, 1000, 2000};
        int iterations = 20;
        try {
            FileWriter writer = new FileWriter("performance_report.txt");

            for (int size : sizes) {
                writer.write("Array size: " + size + "\n");

                // Bubble Sort
                long bubbleTotalTime = 0;
                for (int i = 0; i < iterations; i++) {
                    int[] array = genRandArray(size);
                    long startTime = System.currentTimeMillis();
                    bubbleSort(array);
                    long endTime = System.currentTimeMillis();
                    bubbleTotalTime += (endTime - startTime);
                }
                double bubbleTime = bubbleTotalTime / (double) iterations;
                writer.write("Bubble sort: Sorted " + size + " elements in " + bubbleTime + " ms (avg)\n");

                // Quick sort
                long quickTotalTime = 0;
                for (int i = 0; i < iterations; i++) {
                    int[] array = genRandArray(size);
                    long startTime = System.currentTimeMillis();
                    quickSort(array, 0, array.length - 1);
                    long endTime = System.currentTimeMillis();
                    quickTotalTime += (endTime - startTime);
                }
                double quickTime = quickTotalTime / (double) iterations;
                writer.write("Quick sort: " + size +  "elements in " +quickTime + " ms (avg)\n");

                //shell sort
                long shellTotalTime = 0;
                for (int i = 0; i < iterations; i++) {
                    int[] array = genRandArray(size);
                    long startTime = System.currentTimeMillis();
                    sorty(array);
                    long endTime = System.currentTimeMillis();
                    shellTotalTime += (endTime - startTime);
                }
                double shellTime = shellTotalTime / (double) iterations;
                writer.write("Shell sort: " + size + " elements in "+shellTime + " ms (avg)\n");

                //insertion
                long insertionTotalTime = 0;
                for (int i = 0; i < iterations; i++) {
                    int[] array = genRandArray(size);
                    long startTime = System.currentTimeMillis();
                    insertion(array);
                    long endTime = System.currentTimeMillis();
                    insertionTotalTime += (endTime - startTime);
                }
                double insertionTime = insertionTotalTime / (double) iterations;
                writer.write("Insertion sort: " + size + " elements in"+insertionTime + " ms (avg)\n");

                //selection sort
                long selectionTotalTime = 0;
                for (int i = 0; i < iterations; i++) {
                    int[] array = genRandArray(size);
                    long startTime = System.currentTimeMillis();
                    selection(array);
                    long endTime = System.currentTimeMillis();
                    selectionTotalTime += (endTime - startTime);
                }
                double selectionTime = selectionTotalTime / (double) iterations;
                writer.write("selection sort: " + size + " elements in"+selectionTime + " ms (avg)\n");

            }

            writer.close();
            System.out.println("Performance report");
        } catch (IOException e) {
            e.printStackTrace();

        }
    }
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap temp and arr[i]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    public static void quickSort(int[] input, int low, int high) {
        if (low < high) {
            int part = div(input, low, high);

            quickSort(input, low, part - 1);
            quickSort(input, part + 1, high);
        }
    }
    public static int div(int input[], int start, int end){
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
    //Shell Sort
    public static int[] sorty(int[] input) {
        int n = input.length;
        //for loop
        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i++) {
                int var = input[i];
                for (int j = i; j >= gap && input[j - gap] > var; j -= gap) {
                    input[j] = input[j - gap];
                    input[j-gap] = var;
                }
                //input[j-gap] = var;
            }
        }
        return input;
    }
    public static int[] insertion(int[] input){
    int n = input.length;
        for(int i= 0; i< input.length; i++){
        n = input[i];
        int j;
        for(j = i; j > 0 && n < input[j-1]; j--){
            input[j] = input[j-1];

        }
        input[j]= n;
    }
        return input;
}

    public static int[] selection(int[] input){
    int n = input.length;
    int i;
        for(i = 0; i < n -1; i++){
        int min = i; // find the minimum element from the index to swap
        int j;
        for(j = i+1; j < n;  j++){
            if(input[j] < input[min]){ //
                min = j;

                // swap the elements
                int swap = input[min];
                input[min] = input[i];
                input[i] = swap;

            }
        }
    }

        return input;
}
    public static int[] genRandArray(int size) {
        int[] array = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(1000); // Generate random integers between 0 and 999
        }
        return array;
    }
}