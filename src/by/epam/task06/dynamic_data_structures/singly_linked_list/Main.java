package by.epam.task06.dynamic_data_structures.singly_linked_list;

import by.epam.task06.dynamic_data_structures.singly_linked_list.logic.List;

public class Main {
    public static void main(String[] args) {
        List list = new List();

        list.add(10);
        list.add(15);
        list.add(20);
        list.add(5);
        list.print();
        System.out.println("//////////");
        list.remove();
        list.removeAliment(15);
        list.print();
    }
}
