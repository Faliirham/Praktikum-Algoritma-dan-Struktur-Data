package Jobsheet14;

public class BinaryTreeArray10 { 
    int [] data;
    int idxLast;

    BinaryTreeArray10(){ 
        data = new int[10];
        idxLast = -1;
    }
    void populateData(int data[], int idxLast){ 
        this.data = data;
        this.idxLast = idxLast;
    }
    void traverseInOrder(int idxStart){
        if (idxStart<=idxLast) {
            traverseInOrder(2*idxStart+1);
            System.out.print(data[idxStart]+" ");
            traverseInOrder(2*idxStart+2);
        }
    }
    void add(int data) {
        if (idxLast >= this.data.length - 1) {
            System.out.println("Tree is full");
            return;
        }
        this.data[++idxLast] = data;
        int currentIndex = idxLast;
        while (currentIndex > 0) {
            int parentIndex = (currentIndex - 1) / 2;
            if (this.data[currentIndex] < this.data[parentIndex]) {
                int temp = this.data[currentIndex];
                this.data[currentIndex] = this.data[parentIndex];
                this.data[parentIndex] = temp;
                currentIndex = parentIndex;
            } else {
                break; 
            }
        }
    }
    void traversePreOrder(int idxStart) {
        if (idxStart <= idxLast) {
            System.out.print(data[idxStart] + " ");
            traversePreOrder(2 * idxStart + 1);
            traversePreOrder(2 * idxStart + 2);
        }
    }
    void traversePostOrder(int idxStart) {
        if (idxStart <= idxLast) {
            traversePostOrder(2 * idxStart + 1);
            traversePostOrder(2 * idxStart + 2);
            System.out.print(data[idxStart] + " ");
        }
    }
}