package by.epam.task06.dynamic_data_structures.doubly_linked_list.untity;

import java.util.Objects;

public class Node {
    public int data;
    public Node next;
    public Node prev;

    public Node(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getPrev() {
        return prev;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Node link = (Node) o;
        return data == link.data &&
                Objects.equals(next, link.next) &&
                Objects.equals(prev, link.prev);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data, next, prev);
    }

    @Override
    public String toString() {
        return "Link{" +
                "data=" + data +
                ", next=" + next +
                ", previous=" + prev + '}';

    }
}