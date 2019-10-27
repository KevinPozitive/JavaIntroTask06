package by.epam.task06.dynamic_data_structures.binary_tree.logic;

import by.epam.task06.dynamic_data_structures.binary_tree.entity.Node;

public class LogicBinaryTree {
    public void add(int data, Node node){
        if(node.getRoot()==null){
            node.setRoot(new Node(data));
            return;
        }
        add(node.getRoot(),data);
    }
    private void add(Node node, int data){
        if(data>node.getData()){
            if(node.getRight()==null){
                node.setRight(new Node(data));
            }else {
               add(node.getRight(),data);
            }
        }
        if(data<node.getData()){
            if(node.getLeft()==null){
                node.setLeft(new Node(data));
            } else {
                add(node.getLeft(),data);
            }
        }
    }

    public void print(Node node){
        if(node.getRoot()==null){
            return;
        }
        printP(node.getRoot());
    }
    private void printP (Node node){
        if(node!=null){
            System.out.println(node.getData());
        }else return;
        printP(node.getLeft());
        printP(node.getRight());
    }

    public Node maxNode(Node node){
        if(node.getRoot()!=null){
            return maxNodeP(node.getRoot());
        }
        return null;
    }
    private Node maxNodeP(Node node){
        if(node.getRight()==null){
            return node;
        }
        return maxNodeP(node.getRight());
    }

    public Node searchParent(int data, Node node) {
        if (node.getRoot() == null) {
            return null;
        }
        if (node.getRoot().getData() == data) {
            return null;
        }
        return searchParent(node.getRoot(), data);
    }
    private Node searchParent(Node node, int data) {
        if (data > node.getData()) {
            if (node.getRight() == null) {
                return null;
            }
            if (node.getRight().getData() == data) {
                return node;
            }
            return searchParent(node.getRight(), data);
        } else {
            if (node.getLeft() == null) {
                return null;
            }
            if (node.getLeft().getData() == data) {
                return node;
            }
            return searchParent(node.getLeft(), data);
        }
    }

    public void removeNode(int data, Node node) {
        if(node.getRoot()==null){
            return;
        }
        Node parentItem = searchParent(data, node);
        Node removeNode = nodeSearch(data, node);
        if(parentItem == null||removeNode==null){
            System.out.println("fuck");
            return;
        }
        Node newNode;
        if(removeNode.getRight()==null&&removeNode.getLeft()==null){
            newNode = null;
        }else if(removeNode.getLeft()==null&&removeNode.getRight()!=null){
            newNode = removeNode.getRight();
        }else if(removeNode.getLeft()!=null&&removeNode.getRight()==null){
            newNode = removeNode.getLeft();
        }else{
            newNode = removeNode.getLeft();
            Node maxNode = maxNode(removeNode.getLeft());
            maxNode.setRight(removeNode.getRight());
        }
        if (parentItem.getRight()==removeNode){
            parentItem.setRight(newNode);
        }else{
            parentItem.setLeft(newNode);
        }
        return;
    }

    public Node nodeSearch(int data, Node node){
        if(node.getRoot()==null){
            return null;
        }
        return nodeSearch(node.getRoot(), data);
    }
    private Node nodeSearch(Node node, int data){
        if(node == null){
            return null;
        }
        if(data == node.getData()){
            return node;
        }
        if(data > node.getData()){
            return nodeSearch(node.getRight(), data);
        } else {
            return nodeSearch(node.getLeft(), data);
        }
    }

}
