public class Buku10 {
   
    String judul, pengarang;
    int halaman, stok, harga;

    void tampilInformasi (){
        System.out.println("Judul :"+judul);
        System.out.println("Pengarang : "+pengarang);
        System.out.println("Jumlah halaman : "+halaman);
        System.out.println("Sisa Stok : "+stok);
        System.out.println("Harga : Rp"+harga);
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

        return harga*jmlterjual;
    }

    public double hitungDiskon(int hargaTotal) {
        double diskon = 0.0;
        if (hargaTotal > 150000) {
            diskon = 0.12; 
        } else if (hargaTotal >= 75000 && hargaTotal <= 150000) {
            diskon = 0.05; 
        }
        return diskon * hargaTotal;
    }

    public int hitungHargaBayar(int jmlhterjual) {
        int hargaTotal = hitungHargaTotal(jmlhterjual);
        double diskon = hitungDiskon(hargaTotal);
        return (int) (hargaTotal - diskon);
    }
}
