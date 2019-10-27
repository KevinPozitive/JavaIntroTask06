package by.epam.task06.dynamic_data_structures.singly_linked_list.untity;

import java.util.Objects;

public class Node {
    public int data;
    public Node next;

    public Node(int data){
        this.data = data;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Node node = (Node) o;
        return data == node.data &&
                Objects.equals(next, node.next);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data, next);
    }

    @Override
    public String toString() {
        return "Link{" +
                "data=" + data +
                ", next=" + next +
                ", previous=" + '}';

    }
}
