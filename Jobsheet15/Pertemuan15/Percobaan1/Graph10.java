package Jobsheet15.Pertemuan15.Percobaan1;

public class Graph10 {
    int vertex;
    DoubleLinkedList[] list;
    boolean path;

    Graph10(int v) {
        vertex = v;
        list = new DoubleLinkedList[v];
        for (int i = 0; i < v; i++) {
            list[i] = new DoubleLinkedList();
        }
    }

    void addEdge(int asal, int tujuan, int jarak) {
        list[asal].addFirst(tujuan, jarak);
        //list[tujuan].addFirst(asal, jarak);
    }

    void degree(int asal) throws Exception {
        int inDegree = 0, outDegree = 0;
        for (int i = 0; i < asal; i++) {
            for (int j = 0; j < list[i].size(); j++) {
                if (list[i].get(j) == asal) {
                    inDegree++;
                }
            }
        }
        outDegree = list[asal].size();

        System.out.println("InDegree dari Gedung " + (char) ('A' + asal) + ": " + inDegree);
        System.out.println("OutDegree dari Gedung " + (char) ('A' + asal) + ": " + outDegree);
        System.out.println("Degree dari Gedung " + (char) ('A' + vertex) + ": " + (inDegree + outDegree));
    }

    void removeEdge(int asal, int tujuan) {
        for (int i = 0; i < vertex; i++) {
            if (i== tujuan) {
               list[asal].remove(tujuan); 
            }
        }
    }

    void removeAllEdges() {
        for (int i = 0; i < vertex; i++) {
            list[i].clear();
        }
        System.out.println("Graph berhasil dikosongkan");
    }

    void printGraph() throws Exception {
        for (int i = 0; i < vertex; i++) {
            if (list[i].size() > 0) {
                System.out.print("Gedung " + (char) ('A' + i) + " terhubung dengan: ");
                for (int j = 0; j < list[i].size(); j++) {
                    System.out.print((char) ('A' + list[i].get(j)) + " (" + list[i].getJarak(j) + " m), ");
                }
                System.out.println();
            }
        }
        System.out.println();
    }
    void isConnected(int start, int end) throws Exception{
        boolean Path = false; 
        boolean[] visited = new boolean[vertex];
        connected(start, end, visited);
        if (Path) {
            System.out.println("Terdapat jalur antara node " + (char) ('A' + start) + " dan node " + (char) ('A' + end));
        } else {
            System.out.println("Tidak terdapat jalur antara node " + (char) ('A' + start) + " dan node " + (char) ('A' + end));
        }
    }

    void connected(int current, int end, boolean[] visited)throws Exception{
        if (current == end) {
           path = true;
            return;
        }
        visited[current] = true;
        for (int i = 0; i < list[current].size(); i++) {
            int neighbor = list[current].get(i);
            if (!visited[neighbor]) {
                connected(current, end, visited);
                if (path) {
                    return; 
                }
            }
        }
    }
}