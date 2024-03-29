public class MergeSort implements SortingAlgorithm{
    public int[] sorty(int[] arr){
        if(arr.length <= 1){
            return arr;
        }
        int mid = arr.length / 2;
        int[] left = new int[mid];
        int[] right = new int[arr.length - mid];

        for(int i = 0; i < mid; i++){
            left[i] = arr[i];
        }
        for(int i = mid; i < arr.length; i++){
            right[i - mid] = arr[i];
        }
        left = sorty(left);
        right = sorty(right);

        return merge(left, right);

    }

    public int[] merge(int[] left, int[] right){
        int i = 0, j = 0, k = 0;
        int[] result = new int[left.length + right.length];
        // Compare elements from L & R arrays and merge them into the result array
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                result[k++] = left[i++];
            } else {
                result[k++] = right[j++];
            }
        }

        // get elements from left array, if any
        while (i < left.length) result[k++] = left[i++];

        // get remaining elements from right array, if any
        while (j < right.length) result[k++] = right[j++];

        return result;
    }
}
