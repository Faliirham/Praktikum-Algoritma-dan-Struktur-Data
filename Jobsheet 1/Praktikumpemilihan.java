import java.util.Scanner;

public class Praktikumpemilihan {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String [] NilaiHuruf = {"A", "B+","B", "C+","C", "D", "E"};

        System.out.println("Perhitungan Nilai Akhir Mahasiswa");
        System.out.println("=================================");
        System.out.print("Masukkan Nilai Tugas : ");
        double Tgs = sc.nextDouble();
        System.out.print("Masukkan Nilai Kuis  : "); 
        double Kuis = sc.nextDouble(); 
        System.out.print("Masukkan Nilai UTS   : ");
        double Uts = sc.nextDouble(); 
        System.out.print("Masukkan Nilai UAS   : "); 
        double UAS = sc.nextDouble(); 
        System.out.println("=================================");
        System.out.println("=================================");

         double nilaiAkhir = Tgs * 0.2 + Kuis * 0.2 + Uts * 0.3 + UAS * 0.4;
         String nilaihuruf;
        if ((Tgs <=100) && (Tgs>=0) &&(Kuis <=100) && (Kuis>=0) &&(UAS <=100)&& (UAS>=0) && (Uts<=100)&& (Uts>=0)){
            System.out.println("Nilai Akhir: "+nilaiAkhir ); 
            if(nilaiAkhir>80){
                nilaihuruf = NilaiHuruf[0];
                System.out.println("Nilai Huruf : "+nilaihuruf);
            }else if(nilaiAkhir>73){
                nilaihuruf = NilaiHuruf[1];
                System.out.println("Nilai Huruf : "+nilaihuruf);
            }else if(nilaiAkhir>65){
                nilaihuruf = NilaiHuruf[2];
                System.out.println("Nilai Huruf : "+nilaihuruf);
            }else if(nilaiAkhir>60){
                nilaihuruf = NilaiHuruf[3];
                System.out.println("Nilai Huruf : "+nilaihuruf);
            }else if (nilaiAkhir>50){
                nilaihuruf = NilaiHuruf[4];
                System.out.println("Nilai Huruf : "+nilaihuruf);
            }else if (nilaiAkhir>39){
                nilaihuruf = NilaiHuruf[5];
                System.out.println("Nilai Huruf : "+nilaihuruf);
            }else{
                nilaihuruf = NilaiHuruf[6];
                System.out.println("Nilai Huruf : "+nilaihuruf);
            }
            System.out.println("=================================");
            System.out.println("=================================");
            if (!nilaihuruf.equals(NilaiHuruf[5]) & (!nilaihuruf.equals(NilaiHuruf[6]))) {
                    System.out.println("Selamat Anda Lulus");
                }else{
                    System.out.println("Anda Tidak Lulus");
                }
        } else {
            System.out.println("Masukkan Nilai Tidak Valid");
        }
        System.out.println("=================================");
        System.out.println("=================================");

        sc.close();
    }
    
}
