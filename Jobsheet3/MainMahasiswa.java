package Jobsheet3;
import java.util.Scanner;

public class MainMahasiswa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Mahasiswa [] mhs = new Mahasiswa[3];

        for (int i = 0; i < mhs.length; i++) {
            mhs[i]= new Mahasiswa();
            System.out.println("Masukkan Data Mahasiswa Ke-"+(i+1));
            System.out.print("Masukkan Nama : ");
            mhs[i].nama = sc.next();
            System.out.print("Masukkan Nim : ");
            mhs[i].nim = sc.nextLong();
            System.out.print("Masukkan Jenis Kelamin : ");
            mhs[i].jeniskelamin = sc.next();
            System.out.print("Masukkan IPK : ");
            mhs[i].ipk = sc.nextFloat();
        }

        for (int i = 0; i < mhs.length; i++) {
            System.out.println("Data Mahasiswa ke-"+(i+1));
            System.out.println("Nama : "+mhs[i].nama+"\nNim : "+mhs[i].nim+"\nJenis Kelamin : "+mhs[i].jeniskelamin
            +"\nIpk : "+mhs[i].ipk);
        }

        System.out.println("Rata - Rata IPK Mahasiswa : "+ratarataipk(mhs));
        System.out.println("Mahasiswa Dengan Nilai Ipk Tertinggi "+"\nNama : "+ipktertinggi(mhs).nama+"\nNim : "+ipktertinggi(mhs).nim
        +"\nJenis kelamin : "+ipktertinggi(mhs).jeniskelamin+"\nDengan Ipk : "+ipktertinggi(mhs).ipk);
     sc.close();
    
    }

    static float ratarataipk (Mahasiswa[]mhs){
        float totalipk = 0;
        for (int i = 0; i < mhs.length; i++) {
            totalipk+=mhs[i].ipk;
        }
        return totalipk/mhs.length;
    }

    static Mahasiswa ipktertinggi (Mahasiswa[]mhs){
        Mahasiswa ipktertinggi= mhs[0];
        for (int i = 0; i < mhs.length; i++) {
            if (mhs[i].ipk>ipktertinggi.ipk) {
                ipktertinggi=mhs[i];
            }
        }
        return ipktertinggi;
    }
}
