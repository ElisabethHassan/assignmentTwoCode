import java.util.Random;

public class Tester {
    SortingAlgorithm algo;

    //constructor
     public Tester(SortingAlgorithm sa){
        algo = sa;
    }

    //QUESTION 7
    public double singleTest(int size){

        Random rand = new Random();
        int[] arr = new int[size];
        for(int i =0; i < size; i++){
            arr[i] = rand.nextInt();
        }

        double start = System.currentTimeMillis();
        algo.sorty(arr);
        double end = System.currentTimeMillis();
        return (end - start);
    }

    public double singleKSortTest(int size){

        Random rand = new Random();
        int[] arr = new int[size];
        for(int i =0; i < size; i++){
            arr[i] = rand.nextInt();
        }

        int[] input = generate10Sorted(arr);


        double start = System.currentTimeMillis();
        algo.sorty(input);
        double end = System.currentTimeMillis();
        return (end - start);
    }

    public int[] generate10Sorted(int[] arr){
        Random rand = new Random();

        for (int i = 0; i < arr.length; i++) {
            int start = Math.max(0, i - 10);  //starts the value at 0 or -10
            int end = Math.min(arr.length - 1, i + 10); //visa versa

            int j = rand.nextInt(end - start + 1) + start; // +1 to include the end point

            int temp = arr[i]; //swaps the values
            arr[i] = arr[j];
            arr[j] = temp;
        }

        return arr;
    }


    public void testKSort(int iterations, int size){
        double total = 0;
        for(int i = 0; i < iterations; i++){
            total += singleTest(size);
        }

        System.out.println("Sorted " + size + " elements in " + total / iterations + "ms (avg)");
    }


    public void test(int iterations, int size){
        double total = 0;
        for(int i = 0; i < iterations; i++){
            total += singleKSortTest(size);
        }

        System.out.println("Sorted " + size + " elements in " + total / iterations + "ms (avg)");
    }

}
