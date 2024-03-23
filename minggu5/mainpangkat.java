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
            png[i] = new pangkat();
            System.out.print("Masukkan nilai yang hendak dipangkatkan : ");
            png[i].nilai = sc.nextInt();
            System.out.print("Masukkan nilai pembangkat : ");
            png[i].pangkat = sc.nextInt();
        }
        System.out.println("HASIL PANGKAT - BRUTE FORCE");
        for (int i = 0; i < element; i++) {
            System.out.println("Hasil dari  "
            + png[i].nilai+ " pangkat " + png[i].pangkat+ " adalah " +png[i].PangkatBF(png[i].nilai, png[i].pangkat) );
        }
        System.out.println("HASIL PANGKAT - DIVIDE AND CONQUER");
        for (int i = 0; i < element; i++) {
            System.out.println("Hasil dari  "
            + png[i].nilai+ " pangkat " + png[i].pangkat+ " adalah " +png[i].PangkatDC(png[i].nilai, png[i].pangkat));
        }
    
        sc.close();
    }
}
