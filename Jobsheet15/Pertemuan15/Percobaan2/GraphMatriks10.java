package Jobsheet15.Pertemuan15.Percobaan2;
public class GraphMatriks10 {
    int vertex;
    int matriks[][];

    GraphMatriks10(int v){
        vertex = v;
        matriks = new int[v][v];
    }
    public void makeEdge(int asal, int tujuan, int jarak ) {
            matriks[asal][tujuan] = jarak;
    }

    public void removeEdge(int asal, int tujuan) {
            matriks[asal][tujuan] = -1;
    }
    void printGraph(){
        for (int i = 0; i < vertex; i++) {
            System.out.print("Gedung "+(char)('A'+i)+": ");
            for (int j = 0; j < vertex; j++) {
                if (matriks[i][j] != -1){
                    System.out.print("Gedung "+(char)('A'+j)+" ("+ matriks[i][j]+" m), ");
                }
            }
            System.out.println();
        }
    }
    int inDegree(int v) {
        int inDegree = 0;
        for (int i = 0; i < vertex; i++) {
            if (matriks[i][v] != -1) {
                inDegree++;
            }
        }
        return inDegree;
    }

    int outDegree(int v) {
        int outDegree = 0;
        for (int i = 0; i < vertex; i++) {
            if (matriks[v][i] != -1) {
                outDegree++;
            }
        }
        return outDegree;
    }

    public int degree(int v) {
        return inDegree(v) + outDegree(v);
    }

}