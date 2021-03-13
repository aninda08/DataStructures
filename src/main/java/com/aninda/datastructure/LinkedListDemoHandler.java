package com.aninda.datastructure;

import com.aninda.datastructure.linkedlist.CircularList;
import com.aninda.datastructure.linkedlist.DoublyList;
import com.aninda.datastructure.linkedlist.LinkedList;

public class LinkedListDemoHandler {
    public static void linkedListAddFrontDemo() {
        LinkedList<Integer> list = new LinkedList<>();

        System.out.println("When no element added to list");
        list.traverse();

        System.out.println("Adding 10 to list front");
        list.addAtFront(10);
        list.traverse();

        System.out.println("Adding 20 to list front");
        list.addAtFront(20);
        list.traverse();

        System.out.println("Adding 30 to list front");
        list.addAtFront(30);
        list.traverse();
    }

    public static void linkedListAddEndDemo() {
        LinkedList<Integer> list = new LinkedList<>();

        System.out.println("When no element added to list");
        list.traverse();

        System.out.println("Adding 10 to list front");
        list.addAtEnd(10);
        list.traverse();

        System.out.println("Adding 20 to list front");
        list.addAtEnd(20);
        list.traverse();

        System.out.println("Adding 30 to list front");
        list.addAtEnd(30);
        list.traverse();
    }

    public static void removeElementDemo() {
        LinkedList<Integer> list = new LinkedList<>();

        System.out.println("When no element added to list");
        list.traverse();

        System.out.println("Adding 10 to list front");
        list.addAtEnd(10);
        list.traverse();

        System.out.println("Adding 20 to list front");
        list.addAtEnd(20);
        list.traverse();

        System.out.println("Adding 30 to list front");
        list.addAtEnd(30);
        list.traverse();

        System.out.println("Adding 40 to list front");
        list.addAtEnd(40);
        list.traverse();

        System.out.println("Removing 15 from list");
        list.remove(15);
        list.traverse();

        System.out.println("Removing at position 1 from list");
        list.removeAtPosition(2);
        list.traverse();
    }

    public static void getSizeDemo() {
        LinkedList<Integer> list = new LinkedList<>();

        System.out.println("When no element added to list");
        list.traverse();
        System.out.println("Size of List:: " + list.size());

        System.out.println("Adding 10 to list front");
        list.addAtEnd(10);
        list.traverse();
        System.out.println("Size of List:: " + list.size());

        System.out.println("Adding 20 to list front");
        list.addAtEnd(20);
        list.traverse();
        System.out.println("Size of List:: " + list.size());

        System.out.println("Adding 30 to list front");
        list.addAtEnd(30);
        list.traverse();
        System.out.println("Size of List:: " + list.size());

        System.out.println("Adding 40 to list front");
        list.addAtEnd(40);
        list.traverse();
        System.out.println("Size of List:: " + list.size());
    }

    public static void swapDemo() {
        LinkedList<Integer> list = new LinkedList<>();

        System.out.println("When no element added to list");
        list.traverse();

        System.out.println("Adding 10 to list front");
        list.addAtEnd(10);
        list.traverse();

        System.out.println("Adding 20 to list front");
        list.addAtEnd(20);
        list.traverse();

        System.out.println("Adding 30 to list front");
        list.addAtEnd(30);
        list.traverse();

        System.out.println("Adding 40 to list front");
        list.addAtEnd(40);
        list.traverse();

        System.out.println("Swap 20 and 30 in list");
        list.swap(20, 40);
        list.traverse();
    }

    public static void reverseDemo() {
        LinkedList<Integer> list = new LinkedList<>();

        System.out.println("When no element added to list");
        list.traverse();

        System.out.println("Adding 10 to list front");
        list.addAtEnd(10);
        list.traverse();

        System.out.println("Adding 20 to list front");
        list.addAtEnd(20);
        list.traverse();

        System.out.println("Adding 30 to list front");
        list.addAtEnd(30);
        list.traverse();

        System.out.println("Adding 40 to list front");
        list.addAtEnd(40);
        list.traverse();

        System.out.println("Reversing the list");
        list.reverse();
        list.traverse();
    }

    public static void mergeTwoSortedListDemo() {
        LinkedList<Integer> list1 = new LinkedList<>();
        list1.addAtEnd(20);
        list1.addAtEnd(40);
        list1.addAtEnd(60);
        list1.addAtEnd(80);
        list1.addAtEnd(100);

        LinkedList<Integer> list2 = new LinkedList<>();
        list2.addAtEnd(10);
        list2.addAtEnd(30);
        list2.addAtEnd(50);
        list2.addAtEnd(70);
        list2.addAtEnd(90);

        LinkedList.traverseRec(LinkedList.mergeTwoSortedList(list1.getRoot(),list2.getRoot()));
    }

    public static void getMiddleDemo() {
        LinkedList<Integer> list1 = new LinkedList<>();
        list1.addAtEnd(20);
        list1.addAtEnd(40);
        list1.addAtEnd(60);
        list1.addAtEnd(80);
        list1.addAtEnd(100);

        System.out.println("The list contains::");
        list1.traverse();

        System.out.println("The middle element is " + LinkedList.getMiddle(list1.getRoot()).getData());
    }

    public static void mergeSortDemo() {
        LinkedList<Integer> list1 = new LinkedList<>();
        list1.addAtEnd(20);
        list1.addAtEnd(40);
        list1.addAtEnd(60);
        list1.addAtEnd(80);
        list1.addAtEnd(100);
        list1.addAtEnd(10);
        list1.addAtEnd(30);
        list1.addAtEnd(50);
        list1.addAtEnd(70);
        list1.addAtEnd(90);

        System.out.println("The list contains::");
        list1.traverse();

        list1.setRoot(LinkedList.sort(list1.getRoot()));
        System.out.println("The sorted list contains:: ");
        list1.traverse();
    }

    public static void reverseGroupDemo() {
        LinkedList<Integer> list1 = new LinkedList<>();
        list1.addAtEnd(1);
        list1.addAtEnd(2);
        list1.addAtEnd(3);
        list1.addAtEnd(4);
        list1.addAtEnd(5);
        list1.addAtEnd(6);
        list1.addAtEnd(7);
        list1.addAtEnd(8);

        System.out.println("The list contains::");
        list1.traverse();

        System.out.println("Reversing list in group of 3");
        list1.reverse(3);
        list1.traverse();

    }

    public static void addTwoNumber() {
        LinkedList<Integer> list1 = new LinkedList<>();
        list1.addAtFront(1);
//        list1.addAtFront(6);
//        list1.addAtFront(5);

        LinkedList<Integer> list2 = new LinkedList<>();
        list2.addAtFront(9);
        list2.addAtFront(9);
        list2.addAtFront(9);
        list2.addAtFront(9);

        System.out.println("The first number::");
        list1.traverse();

        System.out.println("The second number::");
        list2.traverse();

        System.out.println("The first number::");
        LinkedList.traverseRec(LinkedList.addNumbers(list1.getRoot(), list2.getRoot()));
    }

    public static void rotateDemo() {
        LinkedList<Integer> list = new LinkedList<>();
        list.addAtEnd(10);
        list.addAtEnd(20);
        list.addAtEnd(30);
        list.addAtEnd(40);
        list.addAtEnd(50);
        list.addAtEnd(60);

        System.out.println("The list contains::");
        list.traverse();
        list.rotate(1);
        System.out.println("The rotated list contains with 1 rotation pont::");
        list.traverse();
    }

    public static void circularListAddFrontDemo() {
        CircularList<Integer> list = new CircularList<>();
        list.addAtFront(10);
        list.addAtFront(20);
        list.addAtFront(30);
        list.addAtFront(40);
        list.addAtFront(50);

        System.out.println("The list contains::");
        list.traverse();
    }

    public static void circularListAddEndDemo() {
        CircularList<Integer> list = new CircularList<>();
        list.addAtEnd(10);
        list.addAtEnd(20);
        list.addAtEnd(30);
        list.addAtEnd(40);
        list.addAtEnd(50);

        System.out.println("The list contains::");
        list.traverse();
    }

    public static void circularListSplitDemo() {
        CircularList<Integer> list = new CircularList<>();
        list.addAtEnd(10);
        list.addAtEnd(20);
        list.addAtEnd(30);
        list.addAtEnd(40);
//        list.addAtEnd(50);
//        list.addAtEnd(60);

        System.out.println("The list contains::");
        list.traverse();

        list.splitList();
        System.out.println("Spliting the circular list into two halves:: ");
        list.traverse();
    }

    public static void sortedInsertDemo() {
        CircularList<Integer> list = new CircularList<>();
        list.sortedInsert(70);
        list.sortedInsert(20);
        list.sortedInsert(10);
        list.sortedInsert(40);
        list.sortedInsert(80);

        System.out.println("The list contains::");
        list.traverse();
    }

    public static void doublyListAddAtFrontDemo() {
        DoublyList<Integer> list = new DoublyList<>();

        list.addAtFront(10);
        list.addAtFront(20);
        list.addAtFront(30);
        list.addAtFront(40);
        list.addAtFront(50);

        list.traverse();
    }
    public static void doublyListAddAtEndDemo() {
        DoublyList<Integer> list = new DoublyList<>();

        list.addAtEnd(10);
        list.addAtEnd(20);
        list.addAtEnd(30);
        list.addAtEnd(40);
        list.addAtEnd(50);

        list.traverse();
    }

    public static void doublyListReverseDemo() {
        DoublyList<Integer> list = new DoublyList<>();

        list.addAtEnd(10);
        list.addAtEnd(20);
        list.addAtEnd(30);
        list.addAtEnd(40);
        list.addAtEnd(50);

        System.out.println("The original Array:: ");
        list.traverse();

        System.out.println("The reversed Array:: ");
        list.reverse();
        list.traverse();
    }
}
