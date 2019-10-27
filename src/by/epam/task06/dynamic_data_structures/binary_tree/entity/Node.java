package by.epam.task06.dynamic_data_structures.binary_tree.entity;

public class Node {
    private int data;
    private Node right;
    private Node left;
    private Node root;

    public Node(int data) {
        this.data = data;
        this.right = null;
        this.left = null;
    }
    public Node(){
        root = null;
    }

    public Node getRoot() {
        return root;
    }
    public void setRoot(Node root) {
        this.root = root;
    }

    public int getData() {
        return data;
    }
    public void setData(int data) {
        this.data = data;
    }

    public Node getRight() {
        return right;
    }
    public void setRight(Node right) {
        this.right = right;
    }

    public Node getLeft() {
        return left;
    }
    public void setLeft(Node left) {
        this.left = left;
    }
}
