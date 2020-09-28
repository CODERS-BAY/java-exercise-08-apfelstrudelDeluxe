// Main zum kurz Durchtesten

package at.linkedlist;

import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        StringElement element = new StringElement("This ist the first value");
        System.out.println(element.getValue());
        element.setValue("New, changed value!");
        System.out.println(element.getValue());
        element.setValue("head node");



        // Linked List anlegen
        LinkedList list = new LinkedList(element);
        System.out.println(" --Head only:-- ");
        list.printAll();
        list.append("second value");
        list.append("second value");
        list.append("third value");
        list.append("fourth value");


        System.out.println("##> head with append value:");
        list.printAll();

        System.out.println("##> After value added");
        list.add(1, "Element between node and second value!!!");
        list.add(100, "should be append (as out of index)");
        list.printAll();

        System.out.println("##> removal of \"second value\" ");
        list.remove("second value");
        list.printAll();

        System.out.println("Removed head:");
        list.remove("head node");
        list.printAll();

        System.out.println("Counting the list size: " + list.size());

        System.out.println("##> get elements of a specific index");
        System.out.println(list.get(0));
        System.out.println(list.get(2));
        System.out.println(list.get(1000));

        System.out.println("Returns the first occurence of val in the list");
        System.out.println("We found " + list.iterator("head node"));


        System.out.println("Removes a node at position index from the list");
        System.out.println(list.remove(1));


    }
}
