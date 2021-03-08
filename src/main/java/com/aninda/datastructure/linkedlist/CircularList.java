package com.aninda.datastructure.linkedlist;

public class CircularList<T> {
    private Node<T> lastNode;

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

    public void traverse() {
        if(this.lastNode == null) {
            System.out.println("The Circular List is empty");
            return;
        }
        Node<T> temp = this.lastNode.getNext();
        do {
            System.out.println(temp.getData());
            temp = temp.getNext();
        } while(temp != this.lastNode.getNext());
    }
}
