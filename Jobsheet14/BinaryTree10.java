package Jobsheet14;

public class BinaryTree10 {
    Node10 root;

    BinaryTree10(){
        root = null;
    }
    
    boolean isEmpty(){
        return root == null;
    }
    
    void add(int data){
        if (isEmpty()) {
            root = new Node10(data);
        } else {
            Node10 current = root;
            while (true) {
                if (data > current.data) {
                    if (current.right == null) {
                        current.right = new Node10(data);
                        break;
                    } else {
                        current = current.right;
                    }
                } else if (data < current.data) {
                    if (current.left == null) {
                        current.left = new Node10(data);
                        break;
                    } else {
                        current = current.left;
                    }
                } else {
                    break;
                }
            }
        }
    }
    
    boolean find(int data){
        Node10 current = root;
        while (current != null) {
            if (current.data == data) {
                return true;
            } else if (data > current.data) {
                current = current.right;
            } else {
                current = current.left;
            }
        }
        return false;
    }
    
    void traversePreOrder(Node10 node){
        if (node != null) {
            System.out.print(" " + node.data);
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }
    
    void traversePostOrder(Node10 node){
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.print(" " + node.data);
        }
    }
    
    void traverseInOrder(Node10 node){
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(" " + node.data);
            traverseInOrder(node.right);
        }
    }
    
    Node10 getSuccessor(Node10 del){
        Node10 successor = del.right;
        Node10 successorParent = del;
        while (successor.left != null) {
            successorParent = successor;
            successor = successor.left;
        }
        if (successor != del.right) {
            successorParent.left = successor.right;
            successor.right = del.right;
        }
        return successor;
    }
    
    void delete(int data){
        if (isEmpty()) {
            System.out.println("Tree is Empty");
            return;
        }
        
        Node10 parent = root;
        Node10 current = root;
        boolean isLeftChild = false;
        
        while (current != null) {
            if (current.data == data) {
                break;
            } else if (data < current.data) {
                parent = current;
                current = current.left;
                isLeftChild = true;
            } else {
                parent = current;
                current = current.right;
                isLeftChild = false;
            }
        }
        
        if (current == null) {
            System.out.println("Couldn't find data");
            return;
        }
        
        if (current.left == null && current.right == null) {
            if (current == root) {
                root = null;
            } else {
                if (isLeftChild) {
                    parent.left = null;
                } else {
                    parent.right = null;
                }
            }
        } else if (current.left == null) {
            if (current == root) {
                root = current.right;
            } else {
                if (isLeftChild) {
                    parent.left = current.right;
                } else {
                    parent.right = current.right;
                }
            }
        } else if (current.right == null) {
            if (current == root) {
                root = current.left;
            } else {
                if (isLeftChild) {
                    parent.left = current.left;
                } else {
                    parent.right = current.left;
                }
            }
        } else {
            Node10 successor = getSuccessor(current);
            if (current == root) {
                root = successor;
            } else {
                if (isLeftChild) {
                    parent.left = successor;
                } else {
                    parent.right = successor;
                }
            }
            successor.left = current.left;
        }
    }
    Node10 addRecursive(Node10 current, int data) {
        if (current == null) {
            return new Node10(data);
        }
        if (data < current.data) {
            current.left = addRecursive(current.left, data);
        } else if (data > current.data) {
            current.right = addRecursive(current.right, data);
        }
        return current;
    }
    int findMin() {
        if (isEmpty()) {
            System.out.println("Tree is empty");
        }
        Node10 current = root;
        while (current.left != null) {
            current = current.left;
        }
        return current.data;
    }
    int findMax() {
        if (isEmpty()) {
            System.out.println("Tree Is Empty");
        }
        Node10 current = root;
        while (current.right != null) {
            current = current.right;
        }
        return current.data;
    }
    void printLeaf(Node10 node) {
        if (node != null) {
            
            if (node.left == null && node.right == null) {
                System.out.print(node.data + " ");
            }else{
                printLeaf(node.left);
                printLeaf(node.right);
            }
            
        }
    }
    int countLeaf(Node10 node) {
        if (node == null) {
            return 0;
        }
        if (node.left == null && node.right == null) {
            return 1;
        }
        return countLeaf(node.left) + countLeaf(node.right);
    }
}