
public class Main {
    public static void main(String[] args) {
        //instances
        SortingAlgorithm bubbleSort = new BubbleSort();
        SortingAlgorithm selectionSort = new SelectionSort();
        SortingAlgorithm quickSort = new QuickSort();
        SortingAlgorithm insertionSort = new InsertionSort();
        SortingAlgorithm mergeSort = new MergeSort();
        SortingAlgorithm shellSort = new ShellSort();

        //tester instances
        Tester bubbleTest = new Tester(bubbleSort);
        Tester insertionTest = new Tester(insertionSort);
        Tester selectionTest = new Tester(selectionSort);
        Tester mergeTest = new Tester(mergeSort);
        Tester quickTest = new Tester(quickSort);
        Tester shellTest = new Tester(shellSort);




        //bubble sort
        System.out.println("Bubble sort: ");
        bubbleTest.test(5, 1000);


        //Insertion sort
        System.out.println("\n Insertion sort: ");
        insertionTest.test(5, 1000);

        //Selection sort
        System.out.println("\n Selection Sort: ");
        selectionTest.test(5, 1000);

        //Merge Sort
        System.out.println("\n Merge sort: ");
        mergeTest.test(5, 1000);

        //Quick Sort
        System.out.println("\n Quick sort: ");
        quickTest.test(5, 1000);

        System.out.println("\n Shell sort: ");
        shellTest.test(5, 1000);




    }
}