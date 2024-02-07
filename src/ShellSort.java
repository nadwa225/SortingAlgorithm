import java.util.Arrays;

public class ShellSort implements SortingAlgorithm {
    public int[] sorty(int[] input) {
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

    public static void main(String args[]) {
        int array[] = {23, 5, 6, 7, 8};
        System.out.println("Unsorted array" + Arrays.toString(array));

        ShellSort shell = new ShellSort();
        shell.sorty(array);

        System.out.println("Sorted array " + Arrays.toString(array));

    }
}