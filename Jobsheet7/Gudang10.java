package Jobsheet7;

public class Gudang10 {
    Barang10 [] tumpukan;
    int size, top;

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
    Barang10 ambilBarang (){
        if (!cekKosong()) {
            Barang10 delete = tumpukan[top];
            top--;
            System.out.println("Barang "+delete.nama+" diambil dari Gudang");
            return delete;
        }else{
            System.out.println("Tumpukan barang ksoong");
        }return null;
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
    }
    
}
