package com.aninda.datastructure.linkedlist;

public class CircularList<T extends Comparable<T>> {
    private Node<T> lastNode, firstListLastNode, secondListLastNode;
    private boolean isSplitted = false;

    public CircularList() {
        this.lastNode = null;
    }

    public Node<T> getLastNode() {
        return lastNode;
    }

    public void setLastNode(Node<T> root) {
        this.lastNode = root;
    }

    public void addAtFront(T data) {
        if(this.lastNode == null) {
            this.lastNode = new Node<>(data);
            this.lastNode.setNext(this.lastNode);
            return;
        }
        Node<T> node = new Node<>(data);
        node.setNext(this.lastNode.getNext());
        this.lastNode.setNext(node);
    }

    public void addAtEnd(T data) {
        if(this.lastNode == null) {
            this.lastNode = new Node<>(data);
            this.lastNode.setNext(this.lastNode);
            return;
        }
        Node<T> node = new Node<>(data);
        node.setNext(this.lastNode.getNext());
        this.lastNode.setNext(node);
        this.lastNode = this.lastNode.getNext();
    }

    public void sortedInsert(T data) {
        if(this.lastNode == null) {
            this.lastNode = new Node<>(data);
            this.lastNode.setNext(this.lastNode);
            return;
        }
        Node<T> node = new Node<>(data);
        Node<T> temp = this.lastNode.getNext();
        if(temp.getData().compareTo(data) > 0) {
            node.setNext(temp);
            this.lastNode.setNext(node);
            return;
        }
        while(temp != this.lastNode && (temp.getNext().getData().compareTo(data) < 0)) {
            temp = temp.getNext();
        }
        node.setNext(temp.getNext());
        temp.setNext(node);
        if(temp == this.lastNode)
            this.lastNode = node;
    }

    public void splitList() {
        if(this.lastNode == null)
            return;

        Node<T> fast = this.lastNode.getNext(), slow = this.lastNode.getNext();
        if(this.lastNode == null || this.lastNode.getNext() == this.lastNode)
            return;

        while(fast.getNext() != this.lastNode.getNext() && fast.getNext().getNext() != this.lastNode.getNext()) {
            slow = slow.getNext();
            fast = fast.getNext().getNext();
        }

        this.firstListLastNode = slow;
        this.secondListLastNode = this.lastNode;
        Node<T> secondHead = slow.getNext();
        this.firstListLastNode.setNext(this.lastNode.getNext());
        this.secondListLastNode.setNext(secondHead);

        this.isSplitted = true;

        System.out.println("FirstNode:: " + this.firstListLastNode.getNext().getData() +
                " SecondNode:: " + this.secondListLastNode.getNext().getData());
    }

    public void traverse() {
        if(!this.isSplitted){
            if(this.lastNode == null) {
                System.out.println("The Circular List is empty");
                return;
            }
            traverse(this.lastNode.getNext());
        }
        else {
            System.out.println("The First sublist :: ");
            traverseFirstList(this.firstListLastNode.getNext());
            System.out.println("The Second sublist :: ");
            traverseSecondList(this.secondListLastNode.getNext());
        }
    }

    public void traverse(Node<T> node) {
        if(node == this.getLastNode()) {
            System.out.println(node.getData());
            return;
        }

        System.out.println(node.getData());
        traverse(node.getNext());
    }

    public void traverseFirstList(Node<T> node) {
        if(node == this.firstListLastNode) {
            System.out.println(node.getData());
            return;
        }

        System.out.println(node.getData());
        traverseFirstList(node.getNext());
    }

    public void traverseSecondList(Node<T> node) {
        if(node == this.secondListLastNode) {
            System.out.println(node.getData());
            return;
        }

        System.out.println(node.getData());
        traverseSecondList(node.getNext());
    }
}
