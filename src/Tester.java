import java.util.Random;

public class Tester {
    private SortingAlgorithm sortingAlgorithm;

    // initializes
    /**
     * Contractor for the Tester class
     * @param sa
     */
    public Tester (SortingAlgorithm sa){
        this.sortingAlgorithm = sa;
    }

    /**
     * creates an array of ints of given size, fill with random numbers
     * runs the sorting algorithm's sorty method
     * @param size
     * @return time it takes to sort the array
     */
    public double singleTest(int size){
        int[] array = randomNumGen(size);
        long start = System.currentTimeMillis();
        sortingAlgorithm.sorty(array);
        long end = System.currentTimeMillis();

        return (end - start) / 1000.0;
    }

    /**
     * runs the singleTest method
     * @param iterations
     * @param size
     */
    public void test(int iterations, int size){
        double time = 0;
        for(int i = 0; i< iterations; i++){
            double timeSpent = singleTest(size);
            System.out.println("Iterations " + (i + 1)+ " ," + timeSpent + " secs");
            //System.out.println("");
            time += timeSpent;
        }
        double averageTime = time / iterations;
        System.out.println("Average time for sorting " + size + " elements: " + averageTime + " seconds");

    }



    public int[] randomNumGen(int size){
        int[] array = new int[size];
        Random rand = new Random(); // random class
        for(int i =0; i < size; i++){
            array[i] = rand.nextInt();
        }
        return array;
    }

}
