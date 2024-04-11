package Jobsheet7.Pertemuan9;

public class Gudang10 {
    Barang10 [] tumpukan;
    int size, top;
    StackKonversi10 stack = new StackKonversi10();
    Gudang10 (int kapasitas){
        size = kapasitas;
        tumpukan = new Barang10[size];
        top = -1;
    }
    boolean cekKosong (){
        if (top == -1) {
            return true;
        }else{
            return false;
        }
    }
    boolean cekPenuh (){
        if (top == size - 1) {
            return true;
        }else{
            return false;
        }
    }
    void tambahBarang (Barang10 brg){
        if (!cekPenuh()) {
            top++;
            tumpukan[top] = brg;
            System.out.println("Barang "+brg.nama+" berhasil ditambahkan ke Gudang");
        }else {
            System.out.println("Gagal! Tumpukan barang di Gudang sudah penuh");
        }
    }
    Barang10 ambilBarang() {
        if (!cekKosong()) {
            Barang10 delete = tumpukan[top];
            top--;
            System.out.println("Barang " + delete.nama + " diambil dari Gudang");
            System.out.println("Kode unik dalam biner: " + konversiDesimalKeBiner(delete.kode));
            return delete;
        } else {
            System.out.println("Tumpukan barang kosong");
            return null;
        }
    }
    
    void tampilkanBarang() {
        if (!cekKosong()) {
            System.out.println("Rincian Tumpukan Barang: ");
            for (int i = 0; i <= top; i++) {
                System.out.printf("Kode %d: %s (kategori %s)\n", tumpukan[i].kode, tumpukan[i].nama, tumpukan[i].kategori);
            }
        } else {
            System.out.println("Tumpukan Barang Kosong");
        }
    }
    void barangTeratas() {
        if (!cekKosong()) {
            System.out.println("Barang Teratas adalah:");
            System.out.printf("%s (kategori %s) dengan kode %d\n", tumpukan[top].nama, tumpukan[top].kategori, tumpukan[top].kode);
        } else {
            System.out.println("Tumpukan Barang Kosong");
        }
    }String konversiDesimalKeBiner(int kode){
        while (kode != 0) {
            int sisa = kode %2;
            stack.push(sisa);
            kode = kode / 2;
        }
        String biner = new String();
        while (!stack.isEmpty()) {
            biner += stack.pop() ;
        }
        return biner;
    } 
    void barangTerbawah (){
        if (!cekKosong()) {
            System.out.println("Barang Terbawah adalah:");
            System.out.printf("%s (kategori %s) dengan kode %d\n", tumpukan[0].nama, tumpukan[0].kategori, tumpukan[0].kode);
        }else{
            System.out.println("Tumpukan Barang Kosong");
        }
    }
    
    void cariBarangnama (String nama){
        if (!cekKosong()){
            for (int i = 0; i < size; i++) {
                if (tumpukan[i].nama.equalsIgnoreCase(nama)) {
                    System.out.printf("%s (kategori %s) dengan kode %d\n", tumpukan[i].nama, tumpukan[i].kategori, tumpukan[i].kode);
                }
            }
        }else{
            System.out.println("Tumpukan Barang Kosong");
        }
     
    }
    void cariBarangkode (int kode){
        if (!cekKosong()) {
            for (int i = 0; i < size; i++) {
                if (tumpukan[i].kode == kode) {
                    System.out.printf("%s (kategori %s) dengan kode %d\n", tumpukan[i].nama, tumpukan[i].kategori, tumpukan[i].kode);
                }
            }
        }else {
            System.out.println("Tumpukan Barang Kosong");
        }
   
    }
    
}
