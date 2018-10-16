package org.erhmutlu.algrthms.datastructures;

public class ListItem <T> {

    private ListItem<T> next;
    private T data;

    public ListItem<T> getNext() {
        return next;
    }

    public void setNext(ListItem<T> next) {
        this.next = next;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
