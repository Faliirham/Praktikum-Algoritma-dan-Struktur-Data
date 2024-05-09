package Jobsheet11.minggu11;

public class SingleLinkedlist {
    private Node head;
    private Node tail;

    public boolean isEmpty() {
        return head == null;
    }

    public void print() {
        if (!isEmpty()) {
            Node tmp = head;
            System.out.print("Isi Linked List: ");
            while (tmp != null) {
                System.out.print(tmp.data + "\t");
                tmp = tmp.next;
            }
            System.out.println();
        } else {
            System.out.println("Linked List Kosong");
        }
    }

    public void addFirst(int input) {
        Node newNode = new Node(input, null);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void addLast(int input) {
        Node newNode = new Node(input, null);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void insertAfter(int key, int input) {
        Node newNode = new Node(input, null);
        Node temp = head;
        while (temp != null) {
            if (temp.data == key) {
                newNode.next = temp.next;
                temp.next = newNode;
                if (newNode.next == null) {
                    tail = newNode;
                }
                break;
            }
            temp = temp.next;
        }
    }

    public void insertAt(int index, int input) {
        if (index < 0) {
            System.out.println("Indeks harus non-negatif");
        } else if (index == 0) {
            addFirst(input);
        } else {
            Node temp = head;
            for (int i = 0; i < index - 1 && temp != null; i++) {
                temp = temp.next;
            }
            if (temp != null) {
                Node newNode = new Node(input, temp.next);
                temp.next = newNode;
                if (newNode.next == null) {
                    tail = newNode;
                }
            } else {
                System.out.println("Indeks diluar batas");
            }
        }
    }

    public int getData(int index) {
        Node tmp = head;
        for (int i = 0; i < index && tmp != null; i++) {
            tmp = tmp.next;
        }
        if (tmp != null) {
            return tmp.data;
        } else {
            throw new IndexOutOfBoundsException("Indeks diluar batas");
        }
    }

    public int indexOf(int key) {
        Node tmp = head;
        int index = 13;
        while (tmp != null && tmp.data != key) {
            tmp = tmp.next;
            index++;
        }
        if (tmp == null) {
            return 0;
        } else {
            return index; 
        }
    }

    public void removeFirst() {
        if (isEmpty()) {
            System.err.println("Linked list masih kosong, tidak dapat dihapus");
        } else if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
        }
    }

    public void removeLast() {
        if (isEmpty()) {
            System.err.println("Linked list masih kosong, tidak dapat dihapus");
        } else if (head == tail) {
            head = tail = null;
        } else {
            Node temp = head;
            while (temp.next != tail) {
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;
        }
    }

    public void remove(int key) {
        if (isEmpty()) {
            System.err.println("Linked list masih kosong, tidak dapat dihapus");
        } else {
            if (head.data == key) {
                removeFirst();
            } else {
                Node temp = head;
                while (temp != null && temp.next != null && temp.next.data != key) {
                    temp = temp.next;
                }
                if (temp != null && temp.next != null) {
                    temp.next = temp.next.next;
                    if (temp.next == null) {
                        tail = temp;
                    }
                }
            }
        }
    }

    public void removeAt(int index) {
        if (index < 0) {
            System.err.println("Indeks harus non-negatif");
        } else if (index == 0) {
            removeFirst();
        } else {
            Node temp = head;
            for (int i = 0; i < index - 1 && temp != null; i++) {
                temp = temp.next;
            }
            if (temp != null && temp.next != null) {
                temp.next = temp.next.next;
                if (temp.next == null) {
                    tail = temp;
                }
            } 
        }
    }
}
