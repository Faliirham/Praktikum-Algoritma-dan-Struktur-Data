package Jobsheet3;
import java.util.Scanner;

public class ArrayObjects {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.print("Masukkan Jumlah persegi yang ingin di input : ");
      int inpt = sc.nextInt();
      PersegiPanjang[] ppArray = new PersegiPanjang[inpt];

      for (int i = 0; i < 3; i++) {
         ppArray[i]=new PersegiPanjang();
         System.out.println("Persegi Panjang ke-" +(i+1));
         System.out.print("Masukkan Panjang : ");
         ppArray[i].panjang = sc.nextInt();
         System.out.print("Maukkan Lebar : ");
         ppArray[i].lebar = sc.nextInt();
      }

      for (int i = 0; i < 3; i++) {
         System.out.println("Persegi Panjang ke-"+(i+1));
         System.out.println("Panjang : "+ ppArray[i].panjang+", Lebar : "+ppArray[i].lebar );
      }   
   }
}