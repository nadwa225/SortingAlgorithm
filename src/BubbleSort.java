public class BubbleSort implements SortingAlgorithm{
    public int[] sorty(int[] input) {
        int n = input.length;
        for (int i = 0; i < n - 1; i++)

            for (int j = 0; j < n - i - 1; j++)

                if (input[j] > input[j + 1]) {
                    // swap temp and arr[i]
                    int temp = input[j];
                    //System.out.println("Temp 1:" + temp);
                    input[j] = input[j + 1];
                    input[j + 1] = temp;
                    System.out.println();
                    // System.out.println(i +"Here"+ j);
                }
        return input;
    }
    void printArray ( int arr[]){
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    // Driver method to test above
    public static void main (String args[]){
        BubbleSort ob = new BubbleSort();
        int arr[] = {64, 34, 25, 70, 22, 11, 90};
        ob.sorty(arr);
        System.out.println("Sorted array");
        ob.printArray(arr);
    }

}
