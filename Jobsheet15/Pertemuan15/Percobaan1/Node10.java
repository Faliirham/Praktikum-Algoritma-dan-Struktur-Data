package Jobsheet15.Pertemuan15.Percobaan1;

public class Node10 {
    int data;
    Node10 prev, next;
    int jarak;

    Node10 (Node10 prev, int data, int jarak,Node10 next) {
        this.data = data;
        this.prev = prev;
        this.next = next;
        this.jarak = jarak;
    }
}