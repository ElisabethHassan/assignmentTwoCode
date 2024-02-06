public class ShellSort implements SortingAlgorithm{

    public int[] sorty(int[] input){
        for(int gap = input.length / 2; gap > 0; gap /= 2){
            for(int i = gap; i < input.length; i ++){
                int tmp = input[i];
                int j;
                for(j = i; j >= gap && tmp < input[j-gap]; j -= gap){
                    input[j] = input [j - gap];
                }
                input[j] = tmp;
            }
        }

        return input;
    }

}
