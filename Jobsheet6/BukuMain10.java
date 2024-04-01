package Jobsheet6;
import java.util.Scanner;

public class BukuMain10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*Scanner sc1 = new Scanner(System.in);*/
        PencarianBuku10 data = new PencarianBuku10();
        /*int jumbuku = 5;

        System.out.println("-------------------------------------------------------");
        System.out.println("Masukkan data Buku secara urut dari kodeBuku Terkecil  ");
        for(int i = 0; i < jumbuku; i++) {
            System.out.println("--------------------------------");
            System.out.print("Kode Buku\t: ");
            int kodeBuku = sc1.nextInt();
            System.out.print("Judul Buku\t: ");
            String judulBuku = sc.nextLine(); 
            System.out.print("Tahun Terbit\t: ");
            int tahunTerbit = sc1.nextInt();
            
            System.out.print("Pengarang\t: ");
            String pengarang = sc.nextLine();
            System.out.print("Stock\t\t: ");
            int stock = sc1.nextInt();*/



            Buku10 m = new Buku10(111, "Algoritma", 2019, "Wahyuni", 5);
            Buku10 m1 = new Buku10(123, "Big Data", 2020,"Susilo",3);
            Buku10 m2 = new Buku10(125, "Desain UI", 2021,"Supriadi",3);
            Buku10 m3 = new Buku10(126, "Web Programming", 2022, "Pustaka Adi", 2);
            Buku10 m4 = new Buku10(127, "Etika Mahasiswa", 2023, "Darmawan Adi",2);


            data.tambahBuku(m);
            data.tambahBuku(m1);
            data.tambahBuku(m2);
            data.tambahBuku(m3);
            data.tambahBuku(m4);
        

        System.out.println("-------------------------------------------------");
        System.out.println("Data Keseluruhan Buku  ");
        data.tampil();
        System.out.println("-------------------------------------------------");
        System.out.println("-------------------------------------------------");
        System.out.println("Pencarian Data  ");
        System.out.println("Masukkan Kode Buku yang dicari ");
        System.out.print("Kode Buku : ");
        int cari = sc.nextInt();
        System.out.println("Menggunakan sequential Search");
        int posisi = data.findSeqSearch(cari);
        data.tampilPosisi(cari, posisi);
        data.TampilData(cari, posisi);
        System.out.println("===================================");
        System.out.println("Menggunakan Binary Search");
        posisi = data.FindBinarySearch(cari, 0, 5-1);
        data.tampilPosisi(cari, posisi);
        data.TampilData(cari, posisi);

        sc.close();
    }    
}

