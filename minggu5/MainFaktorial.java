package minggu5;
import java.util.Scanner;

public class MainFaktorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("-----------------");
        System.out.print("Masukkan Jumlah Elemen : ");
        int ijml = sc.nextInt();

        Faktorial[] fk = new Faktorial[ijml]; 
        for (int i = 0; i < ijml; i++) {
            fk[i] = new Faktorial();
            System.out.print("masukkan nilai data ke-"+(i + 1) + " : ");
            fk[i].nilai = sc.nextInt();
        }

        System.out.println("Hasil - Brute Force");
        for (int i = 0; i < ijml; i++) {
            System.out.println("Hasil perhitungan faktorial menggunakan Brute Force adalah " +
                    fk[i].FaktorialBF(fk[i].nilai));
        }
        System.out.println("Hasil - Divide And Conquer");
        for (int i = 0; i < ijml; i++) {
            System.out.println("Hasil Perhitungan faktorial menggunakan divide and conquer adalah " +
                    fk[i].faktorialDC(fk[i].nilai));
        }
        sc.close();
    }
}