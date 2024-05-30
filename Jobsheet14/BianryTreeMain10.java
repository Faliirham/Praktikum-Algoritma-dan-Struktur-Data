package Jobsheet14;

public class BianryTreeMain10 {
    public static void main(String[] args) {
        BinaryTree10 bt = new BinaryTree10();
        bt.add(6);
        bt.add(4);
        bt.add(8);
        bt.add(3);
        bt.add(5);
        bt.add(7);
        bt.add(9);
        bt.add(10);
        bt.add(15);
        System.out.print("Preorder Traversal :");
        bt.traversePreOrder(bt.root);
        System.out.println("");
        System.out.print("inOrder Transversal :");
        bt.traverseInOrder(bt.root);
        System.out.println("");
        System.out.print("PostOrder Transversal :");
        bt.traversePostOrder(bt.root);
        System.out.println("");
        System.out.println("Find Node :"+bt.find(5));
        System.out.println("Delete Node 8");
        bt.delete(8);
        System.out.print("");
        System.out.print("Preorder Traversal :");
        bt.traversePreOrder(bt.root);
        System.out.println("");
        System.out.print("Find Min Node :"+bt.findMin());
        System.out.println("");
        System.out.print("Find Max Node :"+bt.findMax());
        System.out.println("");
        System.out.print("Count leaf nodes :"+bt.countLeaf(bt.root));
        System.out.println("");
        bt.addRecursive(bt.root, 19);
        System.out.print("InOrder Transversal :");
        bt.traverseInOrder(bt.root);
    }
}