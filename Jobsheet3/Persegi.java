package Jobsheet3;

public class Persegi {
    public static void main(String[] args) {
         PersegiPanjang[][] array2D = new PersegiPanjang[3][3];


        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
            array2D[i][j] = new PersegiPanjang();
            array2D[i][j].panjang = i + 2;
            array2D[i][j].lebar = j + 1;
            }
        }

            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    System.out.println("Persegi Panjang ke-"+i);
                    System.out.println("Panjang : "+ array2D[i][j].panjang+", Lebar : "+array2D[i][j].lebar );
                }
                
             }   

    }
}

