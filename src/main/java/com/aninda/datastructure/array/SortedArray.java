package com.aninda.datastructure.array;

import java.util.Arrays;

public class SortedArray<T extends Comparable<T>> {
    private Object[] elements;
    private int capacity;
    private int size;
    public SortedArray(int capacity) {
        this.elements = new Object[capacity];
        this.capacity = capacity;
        this.size = 0;
    }

    public T get(int i) {
        @SuppressWarnings("unchecked")
        final T t = (T) elements[i];
        return t;
    }

    public void insert(T item) {
        int i;
        if(this.size == this.capacity)
            return;

        for (i = 0 ; i < this.size; i++) {
            if(this.get(i).compareTo(item) > 0)
                break;
        }
        if(i < this.size) {
           for(int j = this.size; j > i; j--) {
                this.elements[j] = this.elements[j - 1];
           }
        }

        this.elements[i] = item;
        this.size++;
    }

    public void delete(T item) {
        int i;
        boolean found = false;
        if(this.size == 0)
            return;

        for (i = 0 ; i < this.size; i++) {

            if(this.get(i).compareTo(item) == 0)
                found = true;

            if(found) {
                this.elements[i] = this.elements[i + 1];
            }
        }
        this.size--;
    }

    public int binarySearch(T item) {
        return binarySearch(item, 0, this.size - 1);
    }

    public int binarySearch(T item, int low, int high) {
        if(low > high)
            return -1;

        int mid = (low + high) / 2;
        if(this.get(mid).compareTo(item) > 0)
            return binarySearch(item, low, (mid - 1));
        else if(this.get(mid).compareTo(item) < 0)
            return binarySearch(item, (mid + 1), high);
        else
            return mid;
    }

    @Override
    public String toString() {
        return "SortedArray{" +
                "elements=" + Arrays.toString(Arrays.copyOfRange(elements,0,this.size)) +
                '}';
    }
}
