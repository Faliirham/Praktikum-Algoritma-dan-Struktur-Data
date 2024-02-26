package Jobsheet3;

public class MainSegitiga {
    public static void main(String[] args) {
        
        Segitiga [] sgArray = new Segitiga[4];

        sgArray[0] = new Segitiga(10, 4);
        sgArray[1] = new Segitiga(20, 10);
        sgArray[2] = new Segitiga(15, 6);
        sgArray[3] = new Segitiga(25, 10);

        for (int i = 0; i < sgArray.length; i++) {
            double luas = sgArray[i].hitungLuas();
            double keliling = sgArray[i].hitungKeliling();
            System.out.printf("Segitiga ke-%d memiliki luas: %.2f dan keliling: %.2f\n", (i + 1), luas, keliling);
        }     
    }
}
