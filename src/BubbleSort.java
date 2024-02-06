public class BubbleSort  implements SortingAlgorithm{


    public int[] sorty(int[] input){
        int temp;
        for(int i = 0; i < input.length - 1; i++){
            for(int j = 0; j < input.length - i - 1; j++) {
                if (input[j] > input[j + 1]) {
                    temp = input[j];
                    input[j] = input[j + 1];
                    input[j + 1] = temp;
                }
            }
        }
        return input;


//        for(int i = 0; i < input.length -1; i++){
//            for(int j = 0; j < input.length - 1 - i; j ++){
//                if(input[j + 1] < input[j]){
//                    swap(input, input[j], input [j + 1]);
//                }
//            }
//        }
//
//        return input;
    }


    public void swap(int[] arr, int t, int v) {
        int temp = arr[t];
        arr[t] = arr[v];
        arr[v] = temp;
    }

}
