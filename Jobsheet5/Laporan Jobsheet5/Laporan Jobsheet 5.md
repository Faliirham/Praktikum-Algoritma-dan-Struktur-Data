# **Laporan Jobsheet 5**
---
## Nama    : Fali Irham Maulana
## No      : 10
## Kelas   : 1-H
## NIM     : 2341720121

### 5.1 Tujuan Praktikum 
Setelah melakukan praktikum ini diharapkan mahasiswa mampu:

a. Mahasiswa mampu membuat algoritma searching bubble sort, selection sort dan 
insertion sort

b. Mahasiswa mampu menerapkan algoritma searching bubble sort, selection sort 
dan insertion sort pada program
-----------------
### 5.2 Mengurutkan Data Mahasiswa Berdasarkan IPK Menggunakan Bubble Sort
**Kode Program :** 

- **Mahasiswa Class :**

![alt text](code.png)

- **DaftarMahasiswaBerprestasi Class:**

![alt text](code1.png)

- **Main Class :**

![alt text](code2.png)
------------------
### 5.2.1 Verifikasi Hasil percobnaan
_Sebelum Sorting :_

![alt text](image.png)

_Setelah Sorting :_

![alt text](image-2.png) 

----------------------
### 5.2.2 Pertanyaan 

1. Terdapat di method apakah proses bubble sort? 

_Jawaban :_ terdapat pada method bublesort pada Class DaftarMahasiswaBerprestasi 

2.  Di dalam method bubbleSort(), terdapat baris program seperti di bawah ini:

![alt text](image-1.png)

Untuk apakah proses tersebut?

_Jawaban :_ 
Proses tersebut bertujuan untuk pengurutan menggunakan algoritma Bubble Sort dengan cara membandingkan dua elemen adjacent dalam suatu list dan menukar posisi mereka jika diperlukan sehingga elemen-elemen yang lebih kecil akan bergerak ke arah akhir list secara berurutan. Proses ini terus diulang sampai seluruh list terurut.

3. Perhatikan perulangan di dalam bubbleSort() di bawah ini: 

![alt text](image-3.png)

a. Apakah perbedaan antara kegunaan perulangan i dan perulangan j? 

_Jawaban :_ Perbedaan antara perulangan i dan j dimana perulangan i digunakan untuk mengontrol jumlah iterasi keseluruhan dari awal hingga akhir list. Sedangkan perulangan j digunakan untuk membandingkan dan menukar elemen-elemen adjacent dalam list.

b. Mengapa syarat dari perulangan i adalah `i<listMhs.length-1` ?

_Jawaban :_ Karena pada iterasi terakhir elemen terakhir sudah pasti berada di posisi yang tepat setelah iterasi sebelumnya, maka tidak perlu dilakukan iterasi lagi setelah i mencapai listMhs.length - 1.

c. Mengapa syarat dari perulangan j adalah `j<listMhs.length-i` ?

_Jawaban :_ 

d. Jika banyak data di dalam listMhs adalah 50, maka berapakali perulangan i akan 
berlangsung? Dan ada berapa Tahap bubble sort yang ditempuh?

