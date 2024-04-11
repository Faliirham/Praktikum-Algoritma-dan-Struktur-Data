# **Laporan Jobsheet 7**
---
## Nama    : Fali Irham Maulana
## No      : 10
## Kelas   : 1-H
## NIM     : 2341720121

### 7.1 Tujuan Praktikum 
Setelah melakukan materi praktikum ini, mahasiswa mampu:

1. Membuat struktur data Stack

2. Menerapkan algoritma Stack ke dalam program
-----------
### 7.2  Percobaan 1: Penyimpanan Tumpukan Barang dalam Gudang

**Kode Program :**

- **Barang10 Class :**

![alt text](code.png)

- **Gudang10 Class :**

![alt text](code1.png)

- **Utama10 Class :**

![alt text](code2.png)
----------------
### 7.2.1.  Verifikasi Hasil Percobaan
![alt text](image.png)
-----------------
### 7.2.2 Pertanyaan
1. Lakukan perbaikan pada kode program, sehingga keluaran yang dihasilkan sama dengan verifikasi 
hasil percobaan! Bagian mana saja yang perlu diperbaiki?

_Jawaban :_ Yang perlu diperbaiki adalah bagian paada metode tampilkanBarang, terdapat kesalahan dalam format string pada printf. Format %f digunakan untuk menampilkan tipe data float, sedangkan nama pada Barang10 bertipekan data string.

2. Berapa banyak data barang yang dapat ditampung di dalam tumpukan? Tunjukkan potongan kode programnya!

_Jawaban :_ data barang yang dapat ditampung di dalam tumpukan sebanyak 7 yang diatur pada kode program berikut :

`Gudang10 gudang = new Gudang10 (7);`

3. Mengapa perlu pengecekan kondisi !cekKosong() pada method tampilkanBarang? Kalau kondisi 
tersebut dihapus, apa dampaknya?

_Jawaban :_ Pengecekan kondisi `!cekKosong()` pada method tampilkanBarang dilakukan untuk memastikan bahwa tumpukan tidak kosong sebelum mencoba menampilkan barang. Jika kondisi tersebut dihapus, maka  program akan mencoba menampilkan barang bahkan ketika tumpukan kosong.

_Contoh_ :

_Method Tampilkan Barang tanpa `!cekKosong()`_ :

![alt text](code3.png)

![alt text](image-1.png)

4. Modifikasi kode program pada class Utama sehingga pengguna juga dapat memilih operasi lihat 
barang teratas, serta dapat secara bebas menentukan kapasitas gudang!

_Jawaban :_

- **Utama10 Class :**

![alt text](code4.png)

- **Gudang10 Class :**

![alt text](code5.png)

5. Commit dan push kode program ke Github

