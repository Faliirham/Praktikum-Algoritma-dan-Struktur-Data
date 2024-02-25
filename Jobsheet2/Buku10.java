public class Buku10 {
   
    String judul, pengarang;
    int halaman, stok, harga, jual;
    double diskon = 0.0;

    void tampilInformasi (){
        System.out.println("Judul: " + judul);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Jumlah halaman: " + halaman);
        System.out.println("Sisa Stok: " + stok);
        System.out.println("Harga: Rp" + harga);
        System.out.println("Harga total: " +hitungHargaTotal(jual));
        System.out.println("Diskon: " + diskon);
        System.out.println("Harga yang dibayar: Rp"+hitungHargaBayar(jual));
    }

    void terjual(int jml) {
        if (stok > 0) {
            stok -= jml;
        } else {
            System.out.println("Stok habis, tidak dapat melakukan penjualan.");
        }
    }
    

    void restock(int jml){
        stok += jml;
    }

    void gantiHarga(int hrg){
        harga = hrg;
    }

    public Buku10(){

    }

    public Buku10(String jud, String pg, int hal, int stok, int har){
        judul = jud;
        pengarang = pg;
        halaman = hal;
        this.stok = stok;
        harga = har;
    }

    int hitungHargaTotal (int jmlterjual){
        jual = jmlterjual;
        return harga * jmlterjual;
    }

    void hitungDiskon() {
        if (hitungHargaTotal(jual) > 150000) {
            diskon = 0.12; 
        } else if (hitungHargaTotal(jual) >= 75000 && hitungHargaTotal(jual) <= 150000) {
            diskon = 0.05; 
        }
        
    }

    double hitungHargaBayar(int jmlterjual) {
        int hargaTotal = hitungHargaTotal(jmlterjual);
        double total = hargaTotal - (hargaTotal * diskon);
        return total;
    }
}
