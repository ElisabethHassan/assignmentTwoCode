public class SelectionSort implements SortingAlgorithm {

    public int[] sorty(int[] input){
        int sorted = 0;
        for(int i = 0; i < input.length - 1; i++){
            int minIndex = i;
            for(int j = i + 1; j < input.length; j ++){
                if(input[j] < input[minIndex]){
                    minIndex = j;
                }
            }
            swap(input, i, minIndex);
        }


        return input;
    }



    public void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
