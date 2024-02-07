public class SelectionSort implements SortingAlgorithm {
   public int[] sorty(int[] input){
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
}
