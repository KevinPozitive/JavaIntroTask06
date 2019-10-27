package by.epam.task06.dynamic_data_structures.doubly_linked_list;

import by.epam.task06.dynamic_data_structures.doubly_linked_list.logic.ListLogic;
import by.epam.task06.dynamic_data_structures.doubly_linked_list.untity.DoublyLinkedList;


public class Main {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        ListLogic listLogic = new ListLogic();
        listLogic.insertFirst(5,list);
        listLogic.insertLast(10,list);
        listLogic.insertInto(5,20,list);
        listLogic.removeAliment(5, list);
        listLogic.print(list);
    }
}
