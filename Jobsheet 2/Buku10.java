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

    void terjual (int jml){
        stok -= jml;
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

    int hitungHargaTotal (int jml){

        int hargatotal = harga*jml;
        return hargatotal;
    }

    int hitungDiskon (int hargatotal){
        int diskon = 0;
        if (hargatotal > 150000) {
            diskon = hargatotal * 12 / 100; 
        } else if (hargatotal >= 75000) {
            diskon = hargatotal * 5 / 100;
        } else {
            diskon = 0;
        }

        return diskon;
    }

    int hitungHargaBayar (int hargatotal, int diskon){
        int hargaBayar = hargatotal - diskon;
        return hargaBayar;
    }
}
