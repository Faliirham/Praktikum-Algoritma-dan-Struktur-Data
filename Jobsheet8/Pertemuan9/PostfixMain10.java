package Jobsheet8.Pertemuan9;
import java.util.Scanner;
public class PostfixMain10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        String P, Q;
        System.out.println("Masukkan Ekspresi Matematika (infix) :");
        Q = sc.nextLine();
        Q = Q.trim();
        Q = Q + ")";

        int total = Q.length();

        Postfix10 post = new Postfix10(total);
        P = post.konversi(Q);
        System.out.println("Postfix : "+P);

        sc.close();
    }
}
