package Jobsheet8.Pertemuan9;

public class StackKonversi10 {
    int size, top;
    int [] tumpukanBiner;
    StackKonversi10 (){
        this.size = 32;
        tumpukanBiner = new int[size];
        top = -1;
    }
    boolean isEmpty(){
        return top == -1;
    }
    boolean isfull(){
        return top == size - 1;
    }
    void push(int data){
        if (isfull()) {
            System.out.println("Stack penuh");
        }else{
            top++;
            tumpukanBiner[top] = data;
        }
    }
    int pop(){
        if (isEmpty()) {
            System.out.println("Stack Kosong");
            return -1;
        }else{
            int data = tumpukanBiner[top];
            top--;
            return data;
        }
    }

}
