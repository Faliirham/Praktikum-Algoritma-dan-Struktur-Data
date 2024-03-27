package Jobsheet5;

public class Hotel {
    String nama, kota;
    int harga, bintang;

    Hotel(String n, String k, int h, int b){
        nama = n;
        kota = k;
        harga = h;
        bintang = b;
        
    }

    void tampil (){
        System.out.println("Nama Hotel : "+nama);
        System.out.println("Kota : "+kota);
        System.out.println("Rating  : "+bintang);
        System.out.println("Harga = "+harga);
    } 

}
