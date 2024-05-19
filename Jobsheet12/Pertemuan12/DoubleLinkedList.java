package Jobsheet12.Pertemuan12;
public class DoubleLinkedList {
    Node head;
    int size;

    DoubleLinkedList(){
        head = null;
        size = 0;
    }
    boolean isEmpty (){
        return head == null;
    }
    void addFirst (int item){
        if (isEmpty()) {
            head = new Node(null,item, null);
        }else{
            Node newNode = new Node(null, item, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }
    void addLast (int item){
        if (isEmpty()) {
            addFirst(item);
        }else{
            Node current = head;
            while (current.next != null){
                current = current.next;
            }
            Node newNode = new Node(current, item, null);
            current.next = newNode;
            size++;
        }
    }
    public void add(int item, int index) throws Exception {
        if (isEmpty()) {
            addFirst(item);
        }else if (index < 0 || index > size) {
            throw new Exception("Nilai Indeks di luar batas");
        } else {
            Node current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            Node newNode = new Node(current, item, current.next);
            if (current.next != null) {
                current.next.prev = newNode;
            }
            current.next = newNode;
            size++;
        }
    }
    int size (){
        return size;
    }
    void clear (){
        head = null;
        size = 0;
    }
    void print (){
        if (!isEmpty()) {
            Node tmp = head;
            while (tmp!=null) {
                System.out.print(tmp.data+"\t");
                tmp = tmp.next;
            }
            System.out.println("\nberhasil diisi");
        }else{
            System.out.println("Linked List Kosong");
        }
    }
    void removeFirst () throws Exception{
        if (isEmpty()) {
            throw new Exception("Linked List masih kosong, tidak dapat dihapus");
        }else if (size == 1){
            removeLast();
        }else{
            head = head.next;
            head.prev = null;
            size --;
        }
    }
    void removeLast () throws Exception{
        if (isEmpty()) {
            throw new Exception ("Nilai indeks diluar batas");
        }else if (head.next == null) {
            head = null;
            size --;
        }
        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
        size --;
    }
    void remove (int index)throws Exception{
        if (isEmpty()) {
            throw new Exception ("Nilai indeks diluar batas");
        }else if (index == 0) {
            removeFirst();
        }else{
            Node current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.next == null){
            current.prev.next = null;
            }else if (current.prev == null){
                current = current.next;
                current.prev = null;
                head = current;
            }else{
                current.prev.next = current.next;
                current.next.prev = current.prev;
            }
            size --;
        }
    }
    int getFirst()throws Exception{
        if (isEmpty()) {
            throw new Exception("Liked List kosong");
        }
        return head.data;
    }
    int getLast()throws Exception{
        if (isEmpty()) {
            throw new Exception("Linked List kosong");
        }
        Node tmp = head;
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        return tmp.data;
    }
    int get(int index)throws Exception{
        if (isEmpty() || index >= size) {
            throw new Exception ("Nilai indeks di luar batas");
        }
        Node tmp = head;
        int i = 0;
        while ( i < index) {
            tmp = tmp.next;
            i++;
        }
        return tmp.data;
    }

}