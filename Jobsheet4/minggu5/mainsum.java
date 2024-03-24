package minggu5;
import java.util.Scanner;

public class mainsum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah perusahaan: ");
        int jumlahPerusahaan = sc.nextInt();

        sum[] perusahaan = new sum[jumlahPerusahaan];
        for (int i = 0; i < jumlahPerusahaan; i++) {
            System.out.print("Masukkan jumlah bulan untuk perusahaan ke-" + (i + 1) + " : ");
            int jumlahBulan = sc.nextInt();
            perusahaan[i] = new sum(jumlahBulan);

            System.out.println("Masukkan keuntungan per bulan untuk perusahaan ke-" + (i + 1) + " : ");
            System.out.println("==================================================================");
            for (int j = 0; j < jumlahBulan; j++) {
                System.out.print("Masukkan keuntungan bulan ke-" + (j+1) + " : ");
                perusahaan[i].keuntungan[j] = sc.nextDouble();
            }
        }

        System.out.println("HASIL TOTAL KEUNTUNGAN - BRUTE FORCE");
        for (int i = 0; i < jumlahPerusahaan; i++) {
            System.out.println("Total keuntungan perusahaan ke-" + (i + 1) + ": " + perusahaan[i].TotalBF(perusahaan[i].keuntungan));
        }

        System.out.println("HASIL TOTAL KEUNTUNGAN - DIVIDE AND CONQUER");
        for (int i = 0; i < jumlahPerusahaan; i++) {
            System.out.println("Total keuntungan perusahaan ke-" + (i + 1) + ": " + perusahaan[i].TotalDC(perusahaan[i].keuntungan,
             0, perusahaan[i].elemen - 1));
        }

        sc.close();
    }
}
