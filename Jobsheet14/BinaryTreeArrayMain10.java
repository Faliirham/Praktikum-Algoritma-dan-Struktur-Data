package Jobsheet14;

public class BinaryTreeArrayMain10 {
    public static void main(String[] args) {
        BinaryTreeArray10 bta = new BinaryTreeArray10();
        
        int[] initialData = {6, 4, 8, 3, 5, 7, 9, 0, 0, 0, 0};
        int idxLast = 9;  
        bta.populateData(initialData, idxLast);

        System.out.print("Inorder Traversal : ");
        bta.traverseInOrder(0);
        System.out.println("\n");

        System.out.print("Preorder Traversal: ");
        bta.traversePreOrder(0);
        System.out.println("\n");

        System.out.print("Postorder Traversal: ");
        bta.traversePostOrder(0);
        System.out.println("\n");

        bta.add(10);

        System.out.print("Inorder Traversal setelah menambahkan 10: ");
        bta.traverseInOrder(0);
        System.out.println();
    }
}
