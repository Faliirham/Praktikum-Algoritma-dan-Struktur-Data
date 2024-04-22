package UTS;

public class sortingsearching {
    UTS uts = new UTS();
    
    void tampil (int [] nilai){
        for (int i = 0; i < nilai.length; i++) {
            if (i < nilai.length-1 ){
            System.out.print(nilai[i] +",");    
            }else{
                System.out.print(nilai[i]);
            }
        }
        System.out.println();
    }
    void mergeSort(int[] nilai) {
        sort(nilai, 0, nilai.length - 1); 
    }

    void merge(int[] nilai, int left, int middle, int right) {
        int[] temp = new int[nilai.length];
        for (int i = left; i <= right; i++) { 
            temp[i] = nilai[i];
        }
        int a = left;
        int b = middle + 1;
        int c = left; 

        while (a <= middle && b <= right) {
            if (temp[a] <= temp[b]) {
                nilai[c] = temp[a];
                a++;
            } else {
                nilai[c] = temp[b];
                b++;
            }
            c++;
        }

        while (a <= middle) {
            nilai[c] = temp[a];
            a++;
            c++;
        }
        while (b <= right) {
            nilai[c] = temp[b];
            b++;
            c++;
        }
    }

    void sort(int[] data, int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2;
            sort(data, left, middle);
            sort(data, middle + 1, right);
            merge(data, left, middle, right);
        }
    }


    void searching (int[]nilai, int cari) {
        for (int i = 0; i < nilai.length; i++) {
            if (cari == nilai[i]) {
                System.out.print("Nilai " + cari+ " ditemukan pada array indeks ke-"+i);
                break;
            }else{
                System.out.print("Nilai " + cari+ " tidak ditemukan pada array indeks ke-"+i);
            }
        }
    }
}

