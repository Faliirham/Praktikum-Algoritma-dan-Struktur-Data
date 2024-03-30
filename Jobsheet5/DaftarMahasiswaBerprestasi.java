package Jobsheet5;

public class DaftarMahasiswaBerprestasi {
    Mahasiswa listmhs [] = new Mahasiswa [5];
    int idx;

    void tambah (Mahasiswa m){
        if(idx<listmhs.length){
            listmhs[idx] = m;
            idx++;
        }else{
            System.out.println("Data sudah penuh!!");
        }
    }

    void tampil (){
        for(Mahasiswa m : listmhs){
            m.tampil();
            System.out.println("----------------------------");
        }
    }

    void bubblesort (){
        for (int i = 0; i < listmhs.length-1; i++) {
            for (int j = 1; j < listmhs.length-i; j++) {
                if (listmhs[j].ipk > listmhs[j-1].ipk) {
                    Mahasiswa tmp = listmhs[j];
                    listmhs[j] = listmhs[j-1];
                    listmhs[j-1] = tmp;
                }
            }
        }
    }

    void selectionsort(){
        for (int i = 0; i < listmhs.length-1; i++) {
            int idxmin = i;
            for(int j=i+1; j < listmhs.length; j++){
                if(listmhs[j].ipk < listmhs[idxmin].ipk){
                    idxmin = j;
                }
            }
            Mahasiswa tmp = listmhs[idxmin];
            listmhs[idxmin] = listmhs[i];
            listmhs[i] = tmp;
        }
    }

    void insectionsort() {
        for (int i = 0; i < listmhs.length; i++) {
            Mahasiswa temp = listmhs[i];
            int j = i;
            while (j > 0 && listmhs[j-1].ipk < temp.ipk) { 
                listmhs[j] = listmhs[j-1];
                j--;
            }
            listmhs[j] = temp;
        }
    }
    
}
