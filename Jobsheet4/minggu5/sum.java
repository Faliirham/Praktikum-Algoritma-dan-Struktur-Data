package minggu5;

public class sum {
    int elemen;
    double keuntungan[], total;

    sum(int element) {
        this.elemen = element;
        keuntungan = new double[element];
        total = 0;
    }

    double TotalBF(double arr[]) {
        for (int i = 0; i < elemen; i++) {
            total += arr[i];
        }
        return total;
    }

    double TotalDC(double arr[], int l, int r) {
        if (l == r) {
            return arr[l];
        } else if (l < r) {
            int mid = (l + r) / 2;
            double lsum = TotalDC(arr, l, mid);
            double rsum = TotalDC(arr, mid + 1, r);
            return lsum + rsum;
        }
        return 0;
    }
}


