package Jobsheet6;
public class PencarianBuku10 {
    Buku10 listBK[] = new Buku10[5];
    int idx;

    void tambah(Buku10 m) {
        if (idx < listBK.length) {
            listBK[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh");
        }
    }

    void tampi() {
        for (Buku10 m : listBK) {
            m.tampilDataBuku();
        }
    }

    int FindSeqSearch(String cari) {
        int posisi = -1;
        for (int j = 0; j < listBK.length; j++) {
            if (listBK[j].kodebuku.equalsIgnoreCase(cari)) {
                posisi = j;
                break;
            }
        }
        return posisi;
    }
    
    void Tampilposisi(String x, int pos) {
        if (pos != -1) {
            System.out.println("data : " + x + " ditemukan pada indeks " + pos);
        } else {
            System.out.println("data " + x + " tidak ditemukan");
        }
    }
    
    void TampilData(String x, int pos) {
        if (pos != -1) {
            System.out.println("Kode Buku \t: " + x);
            System.out.println("Judul \t: " + listBK[pos].judulBuku);
            System.out.println("Tahun terbit \t: " + listBK[pos].tahunterbit);
            System.out.println("Pengarang \t: " + listBK[pos].pengarang);
            System.out.println("Stock \t: " + listBK[pos].stock);
        } else {
            System.out.println("data " + x + " tidak ditemukan");
        }
    }
    
    Buku10 FindBuku(String cari) {
        for (Buku10 buku : listBK) {
            if (buku.kodebuku.equalsIgnoreCase(cari)) {
                return buku;
            }
        }
        return null;
    }

    int FindBinarySearch(String cari, int left, int right) {
        int mid;
        if (right >= left) {
            mid = (right + left) / 2;
            if (cari.equalsIgnoreCase(listBK[mid].kodebuku)) {
                return (mid);
            } else if (listBK[mid].kodebuku.compareToIgnoreCase(cari) > 0) {
                return FindBinarySearch(cari, mid + 1, right);
            } else {
                return FindBinarySearch(cari, left, mid - 1);
            }
        }
        return -1;
    }
    int FindSeqSearchStr (String cari) {
        int posisi = -1;
        for (int j = 0; j < listBK.length; j++) {
            if (listBK[j].judulBuku.equalsIgnoreCase(cari)) {
                posisi = j;
                break;
            }
        }
        return posisi;
    }
    void TampilposisiJudul (String x, int pos) {
            if (pos != -1) {
                System.out.println("data Buku berjudul : " + x + " ditemukan pada indeks " + pos);
            } else {
                System.out.println("data Buku berjudul : " + x + " tidak ditemukan");
            }
    }
    void TampilDataJudul (String x, int pos) {
        if (pos != -1) {
            System.out.println("Kode Buku \t: " + listBK[pos].kodebuku);
            System.out.println("Judul \t: " + x);
            System.out.println("Tahun terbit \t: " + listBK[pos].tahunterbit);
            System.out.println("Pengarang \t: " + listBK[pos].pengarang);
            System.out.println("Stock \t: " + listBK[pos].stock);
        } else {
            System.out.println("data " + x + " tidak ditemukan");
        }
    }
    void mergeSort(int[] data, int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2;
            mergeSort(data, left, middle);
            mergeSort(data, middle + 1, right);
            merge(data, left, middle, right);
        }
    }

    void merge(int[] data, int left, int middle, int right) {
        int n1 = middle - left + 1;
        int n2 = right - middle;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; ++i) {
            L[i] = data[left + i];
        }
        for (int j = 0; j < n2; ++j) {
            R[j] = data[middle + 1 + j];
        }

        int i = 0, j = 0;
        int k = left;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                data[k] = L[i];
                i++;
            } else {
                data[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            data[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            data[k] = R[j];
            j++;
            k++;
        }
    }
    int FindBinarySearchJudul(String cari, int left, int right) {
        int[] sortedIndexes = new int[listBK.length];
        for (int i = 0; i < listBK.length; i++) {
            sortedIndexes[i] = i;
        }
        mergeSort(sortedIndexes, 0, listBK.length - 1);

        int mid;
        if (right >= left) {
            mid = (right + left) / 2;
            if (cari.equalsIgnoreCase(listBK[sortedIndexes[mid]].judulBuku)) {
                return sortedIndexes[mid];
            } else if (listBK[sortedIndexes[mid]].judulBuku.compareToIgnoreCase(cari) > 0) {
                return FindBinarySearchJudul(cari, left, mid - 1);
            } else {
                return FindBinarySearchJudul(cari, mid + 1, right);
            }
        }
        return -1;
    }
    void FindAndDisplayDuplicates(String cari) {
        int count = 0;
        int[] duplicateIndexes = new int[listBK.length];
        int duplicateCount = 0;

        for (int i = 0; i < listBK.length; i++) {
            if (listBK[i].judulBuku.equalsIgnoreCase(cari)) {
                count++;
                duplicateIndexes[duplicateCount] = i;
                duplicateCount++;
            }
        }

        if (count > 1) {
            System.out.println("Peringatan: Lebih dari satu hasil ditemukan dengan judul yang sama.");
            System.out.println("Data buku dengan judul yang sama:");
            for (int j = 0; j < duplicateCount; j++) {
                int index = duplicateIndexes[j];
                System.out.println("Kode Buku: " + listBK[index].kodebuku);
                System.out.println("Judul: " + listBK[index].judulBuku);
                System.out.println("Tahun Terbit: " + listBK[index].tahunterbit);
                System.out.println("Pengarang: " + listBK[index].pengarang);
                System.out.println("Stock: " + listBK[index].stock);
                System.out.println("--------------------------");
            }
        }
    }

}
