import java.util.Scanner;

public class InsertionSort implements SortingAlgorithm {
    public int[] sorty(int[] input){
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
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int size = scan.nextInt();

        int[] array = new int[size];
        System.out.println("enter the elements of the array: ");

        for (int i = 0; i < size; i++) {
            System.out.println("input" + (i + 1) + ":");
            array[i] = scan.nextInt();
        }
        InsertionSort sort = new InsertionSort();
        int[] insert_sort = sort.sorty(array);
        System.out.println("Sorted array: ");
        for (int num : insert_sort) {
            System.out.print(num + " ");


        }
    }
}
