package by.epam.task06.dynamic_data_structures.binary_tree;

import by.epam.task06.dynamic_data_structures.binary_tree.entity.Node;
import by.epam.task06.dynamic_data_structures.binary_tree.logic.LogicBinaryTree;

public class Main {
    public static void main(String[] args) {
        Node node = new Node();
        LogicBinaryTree binaryTree = new LogicBinaryTree();
        binaryTree.add(20,node);
        binaryTree.add(22,node);
        binaryTree.add(25,node);
        binaryTree.add(23,node);
        binaryTree.add(19,node);
        binaryTree.add(24,node);
        binaryTree.add(26,node);
        binaryTree.print(node);
        System.out.println("?????????????");
        System.out.println(binaryTree.searchParent(24,node).getData());
        binaryTree.removeNode(24,node);
        binaryTree.print(node);
    }
}
