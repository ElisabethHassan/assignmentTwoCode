import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //Making sure the methods work
        BubbleSort bs = new BubbleSort();
        InsertionSort is = new InsertionSort();
        QuickSort qs = new QuickSort();
        SelectionSort selectionSort = new SelectionSort();
        ShellSort shellSort = new ShellSort();
        MergeSort ms = new MergeSort();


        int[] arr = {-2, 5, 6, -10, 1, 98, 4, 1};

        System.out.println("Original array: " + Arrays.toString(arr));
        System.out.println("BS: " + Arrays.toString(bs.sorty(arr)));
        System.out.println("IS: " + Arrays.toString(is.sorty(arr)));
        System.out.println("SelS: " + Arrays.toString(selectionSort.sorty(arr)));
        System.out.println("ShellS: " + Arrays.toString(shellSort.sorty(arr)));
        System.out.println("MS: " + Arrays.toString(ms.sorty(arr)));
        System.out.println("QS: " + Arrays.toString(qs.sorty(arr)));

    }
}