package Jobsheet3;

public class Segitiga {
    public int tinggi;
    public int alas;

    public Segitiga(int a, int t) {
        tinggi = t;
        alas = a;
    }

    int hitungLuas() {
        return alas * tinggi / 2;
    }

    double hitungKeliling() {
        double miring = Math.sqrt(alas * alas + tinggi * tinggi);
        return alas + tinggi + miring;
    }
}
