import java.io.IOException;
import java.io.PrintWriter;

public class Performance {

    public static void main(String[] args) {
        SortingAlgorithm bs = new BubbleSort();
        Tester tBS = new Tester(bs);



        System.out.println("Sorting algorithm - Bubble Sort");
        tBS.testKSort(20,100);
        tBS.testKSort(20,500);
        tBS.testKSort(20,1000);
        tBS.testKSort(20,2000);
        tBS.testKSort(20,5000);
        tBS.testKSort(20,10000);
        tBS.testKSort(20,20000);
        tBS.testKSort(20,75000);
        tBS.testKSort(20,150000);

        System.out.println();
        System.out.println("Sorting algorithm - Insertion Sort");
        SortingAlgorithm is = new InsertionSort();
        Tester tIS = new Tester(is);
        tIS.testKSort(20,100);
        tIS.testKSort(20,500);
        tIS.testKSort(20,1000);
        tIS.testKSort(20,2000);
        tIS.testKSort(20,5000);
        tIS.testKSort(20,10000);
        tIS.testKSort(20,20000);
        tIS.testKSort(20,75000);
        tIS.testKSort(20,150000);

        System.out.println();
        System.out.println("Sorting algorithm - Quick Sort");
        SortingAlgorithm qs = new QuickSort();
        Tester tQS = new Tester(qs);
        tQS.testKSort(20,100);
        tQS.testKSort(20,500);
        tQS.testKSort(20,1000);
        tQS.testKSort(20,2000);
        tQS.testKSort(20,5000);
        tQS.testKSort(20,10000);
        tQS.testKSort(20,20000);
        tQS.testKSort(20,75000);
        tQS.testKSort(20,150000);


        System.out.println();
        System.out.println("Sorting algorithm - Selection Sort");
        SortingAlgorithm selS = new SelectionSort();
        Tester tSS = new Tester(selS);
        tSS.testKSort(20,100);
        tSS.testKSort(20,500);
        tSS.testKSort(20,1000);
        tSS.testKSort(20,2000);
        tSS.testKSort(20,5000);
        tSS.testKSort(20,10000);
        tSS.testKSort(20,20000);
        tSS.testKSort(20,75000);
        tSS.testKSort(20,150000);

        System.out.println();
        System.out.println("Sorting algorithm - Shell Sort");
        SortingAlgorithm shellS = new ShellSort();
        Tester tShellS = new Tester(shellS);
        tShellS.testKSort(20,100);
        tShellS.testKSort(20,500);
        tShellS.testKSort(20,1000);
        tShellS.testKSort(20,2000);
        tShellS.testKSort(20,5000);
        tShellS.testKSort(20,10000);
        tShellS.testKSort(20,20000);
        tShellS.testKSort(20,75000);
        tShellS.testKSort(20,150000);

        System.out.println();
        System.out.println("Sorting algorithm - Merge Sort");
        SortingAlgorithm ms = new MergeSort();
        Tester tMS = new Tester(ms);
        tMS.testKSort(20,100);
        tMS.testKSort(20,500);
        tMS.testKSort(20,1000);
        tMS.testKSort(20,2000);
        tMS.testKSort(20,5000);
        tMS.testKSort(20,10000);
        tMS.testKSort(20,20000);
        tMS.testKSort(20,75000);
        tMS.testKSort(20,150000);





//        SortingAlgorithm bs = new BubbleSort();
//        Tester tBS = new Tester(bs);
//
//        System.out.println("Sorting algorithm - Bubble Sort");
//        tBS.test(20,100);
//        tBS.test(20,500);
//        tBS.test(20,1000);
//        tBS.test(20,2000);
//        tBS.test(20,5000);
//        tBS.test(20,10000);
//        tBS.test(20,20000);
//        tBS.test(20,75000);
//        tBS.test(20,150000);
//
//
//
//        System.out.println("Sorting algorithm - Bubble Sort");
//        tBS.test(20,100);
//        tBS.test(20,500);
//        tBS.test(20,1000);
//        tBS.test(20,2000);
//        tBS.test(20,5000);
//        tBS.test(20,10000);
//        tBS.test(20,20000);
//        tBS.test(20,75000);
//        tBS.test(20,150000);
//
//        System.out.println();
//        System.out.println("Sorting algorithm - Insertion Sort");
//        SortingAlgorithm is = new InsertionSort();
//        Tester tIS = new Tester(is);
//        tIS.test(20,100);
//        tIS.test(20,500);
//        tIS.test(20,1000);
//        tIS.test(20,2000);
//        tIS.test(20,5000);
//        tIS.test(20,10000);
//        tIS.test(20,20000);
//        tIS.test(20,75000);
//        tIS.test(20,150000);
//
//        System.out.println();
//        System.out.println("Sorting algorithm - Quick Sort");
//        SortingAlgorithm qs = new QuickSort();
//        Tester tQS = new Tester(qs);
//        tQS.test(20,100);
//        tQS.test(20,500);
//        tQS.test(20,1000);
//        tQS.test(20,2000);
//        tQS.test(20,5000);
//        tQS.test(20,10000);
//        tQS.test(20,20000);
//        tQS.test(20,75000);
//        tQS.test(20,150000);
//
//
//        System.out.println();
//        System.out.println("Sorting algorithm - Selection Sort");
//        SortingAlgorithm selS = new SelectionSort();
//        Tester tSS = new Tester(selS);
//        tSS.test(20,100);
//        tSS.test(20,500);
//        tSS.test(20,1000);
//        tSS.test(20,2000);
//        tSS.test(20,5000);
//        tSS.test(20,10000);
//        tSS.test(20,20000);
//        tSS.test(20,75000);
//        tSS.test(20,150000);
//
//        System.out.println();
//        System.out.println("Sorting algorithm - Shell Sort");
//        SortingAlgorithm shellS = new ShellSort();
//        Tester tShellS = new Tester(shellS);
//        tShellS.test(20,100);
//        tShellS.test(20,500);
//        tShellS.test(20,1000);
//        tShellS.test(20,2000);
//        tShellS.test(20,5000);
//        tShellS.test(20,10000);
//        tShellS.test(20,20000);
//        tShellS.test(20,75000);
//        tShellS.test(20,150000);
//
//        System.out.println();
//        System.out.println("Sorting algorithm - Merge Sort");
//        SortingAlgorithm ms = new MergeSort();
//        Tester tMS = new Tester(ms);
//        tMS.test(20,100);
//        tMS.test(20,500);
//        tMS.test(20,1000);
//        tMS.test(20,2000);
//        tMS.test(20,5000);
//        tMS.test(20,10000);
//        tMS.test(20,20000);
//        tMS.test(20,75000);
//        tMS.test(20,150000);



    }

}
