package Jobsheet12.Pertemuan12;

public class DoubleLinkedListMain {
    public static void main(String[] args) {
        DoubleLinkedList dll = new DoubleLinkedList();
        dll.print();
        System.out.println("Size : " + dll.size);
        System.out.println("====================================");
        dll.addFirst(3);
        dll.addLast(4);
        dll.addFirst(7);
        dll.print();
        System.out.println("Size : " + dll.size);
        System.out.println("====================================");
        try {
            dll.add(40, 1);
            dll.print();
            System.out.println("Size : " + dll.size());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("====================================");
       try {
        System.out.println("Data awal pada Linked Lists adalah :"+dll.getFirst());
       } catch (Exception e) {
          System.out.println(e.getMessage());
       }
       try {
        System.out.println("Data akhir pada Linked Lists adalah :"+dll.getLast());
       } catch (Exception e) {
        System.out.println(e.getMessage());
       }
       try {
        System.out.println("Data indeks ke-1 pada Linked Lists adalah :"+dll.get(1));
       } catch (Exception e) {
        System.out.println(e.getMessage());
       }
       System.out.println("==========================================");
        /*dll.addLast(50);
        dll.addLast(40);
        dll.addLast(10);
        dll.addLast(20);
        dll.print();
        System.out.println("Size : " + dll.size);
        System.out.println("====================================");
        try {
            dll.removeFirst();
            dll.print();
        } catch (Exception e) {
           System.out.println(e.getMessage());
        }
        System.out.println("Size : " + dll.size);
        System.out.println("====================================");
        try {
            dll.removeLast();
            dll.print();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Size : " + dll.size);
        System.out.println("====================================");
        try {
            dll.remove(1);
            dll.print();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Size : " + dll.size);
        System.out.println("====================================");*/
    }
}