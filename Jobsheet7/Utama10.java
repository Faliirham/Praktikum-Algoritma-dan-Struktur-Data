package Jobsheet7;
import java.util.Scanner;
public class Utama10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.print("Masukkan kapasitas Gudang: ");
        int kapasitas = scanner.nextInt();
        Gudang10 gudang = new Gudang10(kapasitas);
        
        boolean ulang = true;
        while (ulang) {
            System.out.println("\n Menu :");
            System.out.println("1. Tambah Barang");
            System.out.println("2. Ambil Barang");
            System.out.println("3. Tampilan tumpukan Barang");
            System.out.println("4. Lihat barang teratas");
            System.out.println("5. Keluar");
            System.out.print("Pilih Operasi :");
            int pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan Kode Barang : ");
                    int kode = scanner.nextInt();
                    System.out.print("Masukkan nama Barang : ");
                    String nama = scanner.next();
                    System.out.print("Masukkan nama Kategori : ");
                    String kategori = scanner.next();
                    Barang10 barangbaru = new Barang10(kode, nama, kategori);
                    gudang.tambahBarang(barangbaru);
                    break;
                case 2:
                    gudang.ambilBarang();
                    break;
                case 3:
                    gudang.tampilkanBarang();
                    break;
                case 4:
                    gudang.barangTeratas();
                    break;
                case 5:
                    ulang = false;
                default:
                    System.out.println("Pilihan tidak valid. Silahkan coba lagi");
                    break;
            }
        }
        scanner.close();
    }
}
