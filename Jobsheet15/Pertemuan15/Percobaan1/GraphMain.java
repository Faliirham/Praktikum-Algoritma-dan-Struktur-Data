package Jobsheet15.Pertemuan15.Percobaan1;

import java.util.Scanner;

public class GraphMain {
    public static void main(String[] args) throws Exception {
        Graph10 gedung = new Graph10(6);
        gedung.addEdge(0, 1, 50);
        gedung.addEdge(0, 2, 100);
        gedung.addEdge(1, 3, 70);
        gedung.addEdge(2, 3, 40);
        gedung.addEdge(3, 4, 60);
        gedung.addEdge(4, 5,80);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan node asal (0-5): ");
        int start = scanner.nextInt();
        System.out.print("Masukkan node tujuan (0-5): ");
        int end = scanner.nextInt();
        scanner.close();
        gedung.isConnected(start, end); 
        gedung.degree(0);
        gedung.printGraph();
        gedung.removeEdge(1, 3);
        gedung.printGraph();
    }
}
