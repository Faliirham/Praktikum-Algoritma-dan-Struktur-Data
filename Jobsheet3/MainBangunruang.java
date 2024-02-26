package Jobsheet3;
import java.util.Scanner;
public class MainBangunruang {
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
    Kerucut[] krc = new Kerucut[1];
    LimassegiEmpatsamasisi [] lmssegiempat = new LimassegiEmpatsamasisi[1];
    Bola [] bl = new Bola[1];

        for (int i = 0; i < krc.length; i++) {
            krc[i] = new Kerucut();
            System.out.print("Masukkan jari-jari Kerucut ke-" + (i+1) + ": ");
            int a = sc.nextInt();
            krc[i].jarikrc=a;
            System.out.print("Masukkan sisi miring Kerucut ke-" + (i+1) + ": ");
            int b = sc.nextInt();
            krc[i].sisimiring=b;
                   }
        for (int i = 0; i< lmssegiempat.length; i++) {
            lmssegiempat[i] = new LimassegiEmpatsamasisi();
            System.out.print("Masukkan sisi alas limas segiempat sama sisi ke-" + (i+1) + ": ");
            int a = sc.nextInt();
            lmssegiempat[i].sisi = a;
            System.out.print("Masukkan tinggi limas segiempat sama sisi ke-" + (i+1) + ": ");
            int b = sc.nextInt();
            lmssegiempat[i].tinggi=b;
        }
        for (int j = 0; j < bl.length; j++) {
            System.out.print("Masukkan jari-jari Bola ke-" + (j+1) + ": ");
            int a = sc.nextInt();
            bl[j] = new Bola(a);
        }
        
        for (int j2 = 0; j2 < bl.length; j2++) {
            System.out.printf("Kerucut ke-%d\nmemiliki Volume : %.2f\n dan Luas Permukaan : %.2f\n",
                (j2+1), krc[j2].volumekerucut(), krc[j2].luasPermukaankerucut());
            
            System.out.printf("Limas Segi Empat Sama sisi ke-%d\nmemiliki Volume : %.2f\n dan Luas Permukaan : %.2f\n",
                (j2+1), lmssegiempat[j2].volume(), lmssegiempat[j2].luasPermukaan());
            
            System.out.printf("Bola ke-%d\nmemiliki Volume : %.2f\n dan Luas Permukaan : %.2f\n",
                (j2+1), bl[j2].volumebola(), bl[j2].Luaspermukaanbola());
        }
        
    }
}
