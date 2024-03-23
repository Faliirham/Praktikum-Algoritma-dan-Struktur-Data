package minggu5;

import java.util.Scanner;

public class mainsum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===========================================================");
        System.out.println("Program Menghitung Keuntungan Total (Satuan Juta. Misal 5.9)");
        System.out.print("Masukkan Jumlah bulan : ");
        int elm = sc.nextInt();

        sum sm = new sum(elm);
        System.out.println("===========================================================");
        for (int i = 0; i < elm ; i++) {
            System.out.print("Masukkan untung bulan ke -"+(i+1)+" = ");
            sm.keuntungan[i]= sc.nextDouble();
        }

        System.out.println("===========================================================");
        System.out.println("Algoritma Brute force");
        System.out.println("Total Keuntungan perusahaan selama "+elm+" bulan adalah "+sm.TotalBF(sm.keuntungan));
        System.out.println("===========================================================");
        System.out.println("Algoritma Divide and Conquer");
        System.out.println("Total Keuntungan perusahaan selama "+elm+" bulan adalah "+sm.TotalDC(sm.keuntungan,0,sm.elemen-1));
    }
}
