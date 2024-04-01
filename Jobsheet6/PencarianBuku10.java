package Jobsheet6;

public class PencarianBuku10 {
    Buku10[] listBK = new Buku10[5];
    int idx;

    void tambahBuku(Buku10 m) {
        if (idx < listBK.length) {
            listBK[idx] = m;
            idx++;
        } else {
            System.out.println("Data Sudah Penuh");
        }
    }

    void tampil() {
        for (Buku10 m : listBK) {
            if (m != null) {
                m.tampilDataBuku();
            }
        }
    }

    int findSeqSearch(int cari) {
        int posisi = -1; 
        for (int i = 0; i < listBK.length; i++) {
            if (listBK[i] != null && listBK[i].kodeBuku == cari) {
                posisi = i; 
                break;
            }
        }
        return posisi;
    }

    void tampilPosisi(int x, int pos) {
        if (pos != -1) {
            System.out.println("Data : " + x + " ditemukan pada indeks " + pos);
        } else {
            System.out.println("Data " + x + " tidak ditemukan");
        }
    }

    void TampilData(int x, int pos){
        if (pos!=-1) {
            System.out.println("-------------------------------------------------");
            System.out.println("Data Buku yang Dicari:");
            System.out.println("Kode Buku\t : " + x);
            System.out.println("Judul\t\t : " + listBK[pos].judul);
            System.out.println("Tahun Terbit\t : " + listBK[pos].tahunTerbit);
            System.out.println("Pengarang\t : " + listBK[pos].pengarang);
            System.out.println("Stock\t\t : " + listBK[pos].stock);
            System.out.println("-------------------------------------------------");

        }else {
            System.out.println("Data "+x+" tidak ditemukan");
        }
    }

    int FindBinarySearch (int cari, int left, int right){
        int mid;
        if (cari!= -1) {
            mid = (left + right) / 2;
            if (cari == listBK[mid].kodeBuku) {
                return mid;
            } else if (cari < listBK[mid].kodeBuku) {
                return FindBinarySearch(cari, left, mid - 1);
            } else {
                return FindBinarySearch(cari, mid + 1, right);
            }
        }
        return -1;
    }
}
