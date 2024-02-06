public class Performance {

    public static void main(String[] args) {
        SortingAlgorithm bs = new BubbleSort();
        Tester tBS = new Tester(bs);

        System.out.println("Sorting algorithm - Bubble Sort");
        tBS.test(20,100);
        tBS.test(20,500);
        tBS.test(20,1000);
        tBS.test(20,2000);
        tBS.test(20,5000);
        tBS.test(20,10000);
        tBS.test(20,20000);
        tBS.test(20,75000);
        tBS.test(20,150000);

        SortingAlgorithm is = new InsertionSort();
        Tester tIS = new Tester(is);
        tIS.test(20,100);
        tIS.test(20,500);
        tIS.test(20,1000);
        tIS.test(20,2000);
        tIS.test(20,5000);
        tIS.test(20,10000);
        tIS.test(20,20000);
        tIS.test(20,75000);
        tIS.test(20,150000);
        
        
        SortingAlgorithm qs = new QuickSort();
        Tester tQS = new Tester(qs);
        tQS.test(20,100);
        tQS.test(20,500);
        tQS.test(20,1000);
        tQS.test(20,2000);
        tQS.test(20,5000);
        tQS.test(20,10000);
        tQS.test(20,20000);
        tQS.test(20,75000);
        tQS.test(20,150000);
        

        SortingAlgorithm selS = new SelectionSort();
        Tester tSS = new Tester(selS);
        tSS.test(20,100);
        tSS.test(20,500);
        tSS.test(20,1000);
        tSS.test(20,2000);
        tSS.test(20,5000);
        tSS.test(20,10000);
        tSS.test(20,20000);
        tSS.test(20,75000);
        tSS.test(20,150000);

        SortingAlgorithm shellS = new ShellSort();
        Tester tShellS = new Tester(shellS);
        tShellS.test(20,100);
        tShellS.test(20,500);
        tShellS.test(20,1000);
        tShellS.test(20,2000);
        tShellS.test(20,5000);
        tShellS.test(20,10000);
        tShellS.test(20,20000);
        tShellS.test(20,75000);
        tShellS.test(20,150000);
        
        SortingAlgorithm ms = new MergeSort();
        Tester tMS = new Tester(ms);
        tMS.test(20,100);
        tMS.test(20,500);
        tMS.test(20,1000);
        tMS.test(20,2000);
        tMS.test(20,5000);
        tMS.test(20,10000);
        tMS.test(20,20000);
        tMS.test(20,75000);
        tMS.test(20,150000);



    }

}
