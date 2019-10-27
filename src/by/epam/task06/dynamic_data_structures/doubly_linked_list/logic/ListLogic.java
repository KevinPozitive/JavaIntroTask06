package by.epam.task06.dynamic_data_structures.doubly_linked_list.logic;

import by.epam.task06.dynamic_data_structures.doubly_linked_list.untity.DoublyLinkedList;
import by.epam.task06.dynamic_data_structures.doubly_linked_list.untity.Node;

public class ListLogic {

    public boolean isEmpty(DoublyLinkedList list){
        return list.getFirst()==null;
    }
    public void insertFirst(int data, DoublyLinkedList list){
        Node node = new Node(data);
        if(isEmpty(list))
        {
            list.setLast(node);
        } else {
            list.getFirst().prev = node;
        }
        node.next = list.getFirst();
        list.setFirst(node);
    }
    public void insertLast(int data, DoublyLinkedList list){
        Node node = new Node(data);
        if(isEmpty(list)){
            list.setFirst(node);
        }else {
            list.getLast().next = node;
            node.prev = list.getLast();
        }
        list.setLast(node);
    }
    public void insertInto(int key, int data, DoublyLinkedList list){
        Node cur = list.getFirst();
        while(cur.data!=key){
            cur = cur.next;
            if(cur == null){
                System.out.println("No element in list!");
                return;
            }
        }
        Node node = new Node(data);
        if(cur == list.getLast()){
            node.next = null;
            list.setLast(node);
        }
        else{
            node.next = cur.next;
            cur.next.prev = node;
        }
        node.prev = cur;
        cur.next = node;
    }


    public void removeLast(DoublyLinkedList list){
        Node temp = list.getLast();
        if(list.getFirst().next == null){
            list.setLast(null);
        } else {
            list.getLast().prev.next = null;
        }
        list.setLast(list.getLast().prev);
    }
    public void removeFirst(DoublyLinkedList list){
        Node temp = list.getLast();
        if(list.getFirst().next == null){
            list.setLast(null);
        } else {
            list.getFirst().prev.next = null;
        }
        list.setFirst(list.getLast().prev);
    }
    public void removeAliment(int key, DoublyLinkedList list){
        Node cur = list.getFirst();
        while(cur.data!=key){
            if(cur == null) {
                return;
            } else {
            cur = cur.next;
            }
        }
        if(cur == list.getFirst()){
            list.setFirst(cur.next);
        } else if(cur == list.getLast()){
            list.setLast(cur.prev);
        } else {
          cur.next.prev = cur.prev;
          cur.prev.next = cur.next;
        }
    }

    public void print(DoublyLinkedList list){
        Node cur = list.getFirst();
        while (cur!=null){
            System.out.println(cur.data);
            cur = cur.next;
        }
    }

}
