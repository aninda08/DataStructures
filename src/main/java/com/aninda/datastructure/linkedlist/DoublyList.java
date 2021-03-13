package com.aninda.datastructure.linkedlist;

public class DoublyList<T> {
    private BinaryNode<T> root;

    public BinaryNode<T> getRoot() {
        return root;
    }

    public void setRoot(BinaryNode<T> root) {
        this.root = root;
    }

    public void addAtFront(T item) {
        if(this.root == null)
            this.root = new BinaryNode<>(item);
        else {
            BinaryNode<T> temp = new BinaryNode<>(item);
            temp.setNext(this.root);
            this.root.setPrev(temp);
            this.root = temp;
        }
    }

    public void addAtEnd(T item) {
        if(this.root == null)
            this.root = new BinaryNode<>(item);
        else {
            BinaryNode<T> node = new BinaryNode<>(item);
            BinaryNode<T> temp = this.root;

            while(temp.getNext() != null) {
                temp = temp.getNext();
            }

            temp.setNext(node);
            node.setPrev(temp);
        }
    }

    public void traverse() {
        if(this.root == null) {
            System.out.println("The List is empty");
            return;
        }
        BinaryNode<T> temp = this.root;
        while(temp != null) {
            System.out.println(temp.getData());
            temp = temp.getNext();
        }
    }

    public void reverse() {
        if(this.root == null)
            return;

        BinaryNode<T> curr = this.root, temp = null;

        while(curr != null) {
            temp = curr.getPrev();
            curr.setPrev(curr.getNext());
            curr.setNext(temp);
            curr = curr.getPrev();
        }

        if(temp != null)
            this.root = temp.getPrev();
    }

}
