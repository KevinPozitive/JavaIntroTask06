package by.epam.task06.dynamic_data_structures.doubly_linked_list.untity;

import java.util.Objects;

public class DoublyLinkedList {
    private Node first;
    private Node last;

    public DoublyLinkedList() {
        this.first = null;
        this.last = null;
    }

    public Node getFirst() {
        return first;
    }
    public void setFirst(Node first) {
        this.first = first;
    }

    public Node getLast() {
        return last;
    }
    public void setLast(Node last) {
        this.last = last;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DoublyLinkedList that = (DoublyLinkedList) o;
        return Objects.equals(first, that.first) &&
                Objects.equals(last, that.last);
    }

    @Override
    public int hashCode() {
        return Objects.hash(first, last);
    }

    @Override
    public String toString() {
        return "DoublyLinkedList{" +
                "first=" + first +
                ", last=" + last + '}';
    }
}
