package Pertemuan1;
public class Queue {
    int data[];
    int front, rear, size, max;
    
    Queue(int n){
        max = n;
        data = new int[max];
        size = 0;
        front = rear = -1;
    }
    boolean isEmpty (){
        if (size == 0) {
            return true;
        }
        else {
            return false;
        }
    }
    boolean isFull (){
        if (size == max) {
            return true;
        }
        else {
            return false;
        }
    }
    
}