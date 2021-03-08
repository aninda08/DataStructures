package com.aninda.datastructure.linkedlist;

public class LinkedList<T> {
    private Node<T> root;

    public LinkedList() {
        this.root = null;
    }

    public Node<T> getRoot() {
        return root;
    }

    public void setRoot(Node<T> root) {
        this.root = root;
    }

    public void addAtFront(T item) {
        if(this.root == null)
            this.root = new Node<>(item);
        else {
            Node<T> temp = new Node<>(item);
            temp.setNext(this.root);
            this.root = temp;
        }
    }

    public void addAtEnd(T item) {
        if(this.root == null)
            this.root = new Node<>(item);
        else {
            Node<T> node = new Node<>(item);
            Node<T> temp = this.root;

            while(temp.getNext() != null) {
                temp = temp.getNext();
            }

            temp.setNext(node);
        }
    }

    public void remove(T item) {
        Node<T> temp = this.root, prev = null;
        if(temp == null)
            return;

        if(temp.getData().equals(item)) {
            this.root = temp.getNext();
            return;
        }

        while(temp != null && !temp.getData().equals(item)) {
            prev = temp;
            temp = temp.getNext();
        }

        if(temp != null)
            prev.setNext(temp.getNext());
    }

    public void removeAtPosition(int position) {
        Node<T> temp = this.root;
        int counter = 0;
        if(temp == null)
            return;

        if(position == 0) {
            this.root = temp.getNext();
            return;
        }

        while(temp != null && counter < position - 1) {
            temp = temp.getNext();
            counter++;
        }

        if(temp != null)
            temp.setNext(temp.getNext().getNext());
    }

    public int size() {
        return size(this.root);
    }

    public int size(Node<T> node) {
        if(node == null)
            return 0;

        return (1 + size(node.getNext()));

    }

    //Does not work for root node test case
    public void swap(T item1, T item2) {
        this.root = swap(this.root, item1, item2);
    }

    public Node<T> swap(Node<T> node, T item1, T item2) {
        Node<T> temp = node, prev1 = null, prev2 = null;
        if(item1.equals(item2))
            return null;

        while(temp.getNext() != null) {
            if(temp.getNext().getData().equals(item1))
                prev1 = temp;
            else if(temp.getNext().getData().equals(item2))
                prev2 = temp;

            temp = temp.getNext();
        }

        if(prev1 != null && prev2 != null) {
            Node<T> temp1 = prev1.getNext();
            prev1.setNext(prev2.getNext());
            prev2.setNext(temp1);
            temp1 = prev1.getNext().getNext();
            prev1.getNext().setNext(prev2.getNext().getNext());
            prev2.getNext().setNext(temp1);
        }

        return node;
    }

    public void reverse() {
        Node<T> curr = this.root, prev = null, next;

        while(curr != null) {
            next = curr.getNext();
            curr.setNext(prev);
            prev = curr;
            curr = next;
        }
        this.root = prev;
    }

    public void reverse(int k) {
        this.root = reverse(this.root, k);
    }
    public Node<T> reverse(Node<T> node,int k) {
        Node<T> curr = node, prev = null, next = null;
        int count = 0;

        if(node == null)
            return null;

        while(count < k && curr != null) {
            next = curr.getNext();
            curr.setNext(prev);
            prev = curr;
            curr = next;
            count++;
        }

        if(next != null)
            node.setNext(reverse(next, k));

        return prev;
    }

    public static <T> Node<T> getMiddle(Node<T> node) {
        Node<T> slow = node;
        Node<T> fast = node;
        if(fast == null)
            return null;

        while(fast.getNext() != null && fast.getNext().getNext() != null) {
            slow = slow.getNext();
            fast = fast.getNext().getNext();
        }
        return slow;
    }

    public static <T extends Comparable<T>> Node<T> sort(Node<T> node) {
        if(node == null || node.getNext() == null)
            return node;

        Node<T> middle = getMiddle(node);
        Node<T> nextOfMiddle = middle.getNext();
        middle.setNext(null);
        Node<T> subList1 = sort(node);
        Node<T> subList2 = sort(nextOfMiddle);

        return mergeTwoSortedList(subList1,subList2);
    }

    public static <T extends Comparable<T>> Node<T> mergeTwoSortedList(Node<T> node1, Node<T> node2) {
        if(node1 == null)
            return node2;
        if(node2 == null)
            return node1;

        if(node1.getData().compareTo(node2.getData()) < 0) {
            node1.setNext(mergeTwoSortedList(node1.getNext(),node2));
            return node1;
        }
        else {
            node2.setNext(mergeTwoSortedList(node1,node2.getNext()));
            return node2;
        }

    }

    public void rotate(int k) {
        if(k == 0)
            return;

        Node<T> temp = this.root, kthnode = null;
        int counter = 0;

        while(temp.getNext() != null) {
            if(counter == (k - 1))
                kthnode = temp;
            counter++;
            temp = temp.getNext();
        }

        if(kthnode != null && kthnode.getNext() != null) {
            temp.setNext(this.root);
            this.root = kthnode.getNext();
            kthnode.setNext(null);
        }


    }

    public void traverse() {
        if(this.root == null) {
            System.out.println("The List is empty");
            return;
        }
        Node<T> temp = this.root;
        while(temp != null) {
            System.out.println(temp.getData());
            temp = temp.getNext();
        }
    }

    public static Node<Integer> addNumbers(Node<Integer> num1, Node<Integer> num2) {
        Node<Integer> result = null;
        int carry = 0, sum;
        Node<Integer> prev = null, temp = null;

        while(num1 != null || num2 != null) {
            sum = (num1 != null ? num1.getData() : 0) + (num2 != null ? num2.getData() : 0) + carry;
            carry = (sum < 10 ? 0 : 1);
            sum = sum % 10;

            temp = new Node<>(sum);

            if(result == null)
                result = temp;
            else
                prev.setNext(temp);

            prev = temp;

            num1 = (num1 != null ? num1.getNext() : null);
            num2 = (num2 != null ? num2.getNext() : null);
        }
        if(carry > 0) {
           temp.setNext(new Node<>(carry));
        }
        return result;
    }
    public static <T> void traverseRec(Node<T> node) {
        if(node == null) {
            System.out.println("The List is empty");
            return;
        }
        Node<T> temp = node;
        while(temp != null) {
            System.out.println(temp.getData());
            temp = temp.getNext();
        }
    }
}
