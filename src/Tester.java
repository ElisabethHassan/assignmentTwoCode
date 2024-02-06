import java.util.Random;

public class Tester {
    SortingAlgorithm algo;

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

    public void test(int iterations, int size){
        double total = 0;
        for(int i = 0; i < iterations; i++){
            total += singleTest(size);
        }

        System.out.println("Sorted " + size + "elements in " + total / iterations + "ms (avg)");
    }

}
