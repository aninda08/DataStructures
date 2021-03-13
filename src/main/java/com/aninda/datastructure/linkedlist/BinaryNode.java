package com.aninda.datastructure.linkedlist;

public class BinaryNode<T> {
    private T data;
    private BinaryNode<T> prev, next;

    public BinaryNode(T data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }

    public T getData() {
        return data;
    }

    public BinaryNode<T> getPrev() {
        return prev;
    }

    public BinaryNode<T> getNext() {
        return next;
    }

    public void setData(T data) {
        this.data = data;
    }

    public void setPrev(BinaryNode<T> prev) {
        this.prev = prev;
    }

    public void setNext(BinaryNode<T> next) {
        this.next = next;
    }
}
