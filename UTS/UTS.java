package UTS;
import java.util.Scanner;

public class UTS {
    public static void main(String[] args) {
        int [] nilai = {44,23,39,18,15,10,6,25,15,2,13,14,18,29,22,21,14};
        Scanner sc = new Scanner(System.in);

        sortingsearching uts = new sortingsearching();

        System.out.println("Nilai Sebelum sorting : ");
        uts.tampil(nilai);
        System.out.println("==============================================");
        System.out.println("Nilai Setelah sorting :");
        uts.mergeSort(nilai);
        uts.tampil(nilai);
        System.out.println("==============================================");
        System.out.println("Masukkan nilai yang ingin dicari :");
        int cari = sc.nextInt();
        uts.searching(nilai, cari);
        

        sc.close();
    }
    
}   
