package Jobsheet12.Pertemuan12;
public class Node {
    int data;
    Node prev;
    Node next;

    Node (Node prev,int data , Node next){
        this.data = data;
        this.prev = prev;
        this.next = next;
    }
}