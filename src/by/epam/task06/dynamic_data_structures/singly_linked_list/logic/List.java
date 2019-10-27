package by.epam.task06.dynamic_data_structures.singly_linked_list.logic;

import by.epam.task06.dynamic_data_structures.singly_linked_list.untity.Node;

public class List {
    private Node head;

    public List(){
        head = null;
    }
    private boolean isEmpty(){
        return head == null;
    }
    public void add(int data){
        Node temp = new Node(data);
        temp.next = head;
        head = temp;
    }
    public void remove(){
        head = head.next;
    }
    public void removeAliment(int key){
        Node cur = head;
        Node prev = head;

        while(cur.data!=key){
            if(isEmpty()){
                System.out.println("List is empty");
                return;
            } else{
                prev = cur;
                cur = cur.next;
            }
            if(cur==head){
                head = head.next;
            }else {
                prev.next = cur.next;
            }
        }
    }

    public int findAliment(int key){
        Node temp = head;
        int n = 0;

        while(temp!= null){
            if(temp.data == key){
                return n;
            }
            temp = temp.next;
            n++;
        }
        return -1;
    }

    public void print(){
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
