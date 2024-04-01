package Jobsheet6;

public class Buku10 {
    int kodeBuku, tahunTerbit, stock;
    String judul, pengarang;

    Buku10 (int kodeBuku, String judul, int tahunTerbit,String pengarang, int stock) {
        this.tahunTerbit = tahunTerbit;
        this.judul = judul;
        this.pengarang = pengarang;
        this.kodeBuku = kodeBuku;
        this.stock = stock;
    }

    void tampilDataBuku() {
        System.out.println("========================");
        System.out.println("Kode Buku: " + kodeBuku);
        System.out.println("Judul: " + judul);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Tahun Terbit: " + tahunTerbit);
        System.out.println("Stock: " + stock);
    }

    
}
