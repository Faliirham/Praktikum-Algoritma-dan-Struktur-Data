package Jobsheet3;

public class LimassegiEmpatsamasisi {
    int sisi;
    int tinggi;
    
    
    public LimassegiEmpatsamasisi(){
       
    }
    double volume() {
        return (1.0 / 3) * sisi * sisi * tinggi;
    }
    double luasPermukaan() {
        return (0.5 * 4 * sisi * tinggi) + (sisi * sisi);
    }

    
}
