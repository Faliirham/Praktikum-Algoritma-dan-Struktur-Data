package Jobsheet6;

public class MergeSortMain10 {
    public static void main(String[] args) {
        int [] data = {10,40,30,50,70,20,100,90};
        System.out.println("sorting dengan merge sort");
        MergeSorting10 mSort = new MergeSorting10();
        System.out.println("Data Awal");
        mSort.printArray(data);
        mSort.mergeSort(data);
        System.out.println("Setelah Diurutkan");
        mSort.printArray(data); 
    }
}
