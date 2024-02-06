import java.util.Random;

public class Tester {

    public Tester(SortingAlgorithm sa){

    }

    //QUESTION 7
    public double singleTest(int size){
        double start = System.currentTimeMillis();
        Random rand = new Random();
        int[] arr = new int[size];
        for(int i =0; i < size; i++){
            arr[i] = rand.nextInt();
        }

        double end = System.currentTimeMillis();
        return (start - end);
    }

    public void test(int iterations, int size){
        for(int i = 0; i < iterations; i++){
            System.out.println(singleTest(size));
        }
    }

}
