package Jobsheet6;
public class Buku10 {
    int  tahunterbit, stock;
    String judulBuku,kodebuku, pengarang;

    Buku10 (String kodebuku, int tahunterbit, int stock, String judulBuku, String pengarang){
        this.kodebuku = kodebuku;
        this.tahunterbit = tahunterbit;
        this.stock = stock;
        this.judulBuku = judulBuku;
        this.pengarang = pengarang;
    }

    void tampilDataBuku (){
        System.out.println("===============================");
        System.out.println("Kode Buku : "+kodebuku);
        System.out.println("Judu Buku : "+judulBuku);
        System.out.println("Tahun Terbit : "+tahunterbit);
        System.out.println("Pengarang : "+pengarang);
        System.out.println("Stock : "+stock);
    }
}
