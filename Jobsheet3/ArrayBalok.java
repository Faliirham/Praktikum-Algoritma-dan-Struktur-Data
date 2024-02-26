package Jobsheet3;

public class ArrayBalok {
    public static void main(String[] args) {
        Balok[] blArray = new Balok[3];

        
        blArray[1] = new Balok(120, 40,15);
        blArray[2] = new Balok(210, 50, 25);

        blArray[0]= new Balok();
        blArray[0].panjang = 10;
        blArray[0].lebar = 10; 
        blArray[0].tinggi = 10;

        for (int i = 0; i < 3; i++) {
            System.out.println("Volume Balok Ke "+i+": "+blArray[i].hitungVolume());
        }
    }
}
