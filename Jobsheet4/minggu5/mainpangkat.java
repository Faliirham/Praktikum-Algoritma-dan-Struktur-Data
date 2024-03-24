package minggu5;
import java.util.Scanner;

public class mainpangkat {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("=====================================");
        System.out.print("Masukkan jumlah elemen yang dihitung : ");
        int element = sc.nextInt();

        pangkat [] png = new pangkat[element];
        for (int i = 0; i < element; i++) {
            System.out.print("Masukkan nilai yang hendak dipangkatkan : ");
            int nilai = sc.nextInt();
            System.out.print("Masukkan nilai pembangkat : ");
            int pangkat = sc.nextInt();
            png[i] = new pangkat(nilai,pangkat);
        }

        System.out.println("Pilih method yang akan dijalankan:");
        System.out.println("1. PangkatBF()");
        System.out.println("2. PangkatDC()");
        System.out.print("Pilih (1/2) : ");
        byte choice = sc.nextByte();

        switch (choice) {
            case 1:
            System.out.println("HASIL PANGKAT - BRUTE FORCE");
                for (int i = 0; i < element; i++) {
                    System.out.println("Hasil dari  "
                    + png[i].nilai+ " pangkat " + png[i].pangkat+ " adalah " +png[i].PangkatBF(png[i].nilai, png[i].pangkat) );
                }
                break;
            case 2:
            System.out.println("HASIL PANGKAT - DIVIDE AND CONQUER");
                for (int i = 0; i < element; i++) {
                    System.out.println("Hasil dari  "
                    + png[i].nilai+ " pangkat " + png[i].pangkat+ " adalah " +png[i].PangkatDC(png[i].nilai, png[i].pangkat));
                }
                break;
            default:
            System.out.println("Pilihan yang anda masukkan salah!");
                break;
        }
        sc.close();
    }
}